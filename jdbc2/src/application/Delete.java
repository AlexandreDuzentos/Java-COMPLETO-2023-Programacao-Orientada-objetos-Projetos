package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DBIntegrityException;

public class Delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement(
					 "DELETE FROM department "
					+"WHERE "
					+"Id = ?"
				);
			
			ps.setInt(1, 2);
			
			int rowsAffected = ps.executeUpdate();
			
			System.out.println("rows affected: "+ rowsAffected);
		} catch(SQLException e) {
			throw new DBIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		

	}

}
