package Application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===TEST 1: seller findById ====");
		Department dept = departmentDao.findById(3);
		
		System.out.println(dept);
		
		System.out.println("===TEST 2: department findAll ====");
		List<Department> list1 = departmentDao.findAll();
		for(Department sl : list1) {
			System.out.println(sl);
		}
		
		System.out.println("===TEST 3: seller insert ====");
		Department newDepartment = new Department(null, "Eletrics");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new Id = "+newDepartment.getId());
		
		System.out.println("===TEST 4: department update ====");
		dept = departmentDao.findById(3);
		dept.setName("Eletronics");
		departmentDao.update(dept);
		System.out.println("Update completed!");

		
		System.out.println("===TEST 5: department delete by id ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted completed");
	}

}
