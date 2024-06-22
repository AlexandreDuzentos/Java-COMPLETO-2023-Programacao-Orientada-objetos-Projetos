package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Update {

	public static void main(String[] args) {
		
		/* ----- ATUALIZAÇÃO DE DADOS --------*/
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DB.getConnection();
			
			ps = conn.prepareStatement(
					   "UPDATE seller "
					  +"set BaseSalary = BaseSalary + ? "
					  +"WHERE "
					  +"(DepartmentId = ?)"
					);
			
			ps.setDouble(1, 200.0);
			ps.setInt(2, 2);
			
			int rowsAffected = ps.executeUpdate();
			
			System.out.println("Done! rows affected: "+ rowsAffected);
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
