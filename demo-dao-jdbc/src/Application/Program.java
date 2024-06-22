package Application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Com o uso do padrão de projeto Factory, o consumidor da
		 * classe(Program) não conhece a implementação do SellerDao
		 * e também está a ser feita uma injeção de dependência sem explicitar
		 * a implementação(SellerDaoJDBC), o consumidor conhece apenas a interface.
		 * */
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("===TEST 2: seller findByDepartment ====");
		Department dept = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dept);
		
		for(Seller sl : list) {
			System.out.println(sl);
		}
		
		System.out.println("===TEST 3: seller findAll ====");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller sl : list2) {
			System.out.println(sl);
		}
		
		System.out.println("===TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, dept);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new Id = "+newSeller.getId());
		
		System.out.println("===TEST 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Marta waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");

		System.out.println("===TEST 6: seller delete by id ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted completed");
		
		sc.close();
		
	}

}
