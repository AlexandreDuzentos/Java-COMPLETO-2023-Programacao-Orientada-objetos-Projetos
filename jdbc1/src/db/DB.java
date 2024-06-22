package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/* ---- classe responsável por conectar e desconectar com o banco de dados ----- */
public class DB {
	
	/* Propriedade para armazenar objeto de conexão com o banco de dados do
	 * JDBC.
	 *  */
	private static Connection conn = null;
	
	/* 
	 * Método responsável por fazer uma conexão com o banco de dados e
	 * retornar o objeto de conexão com o banco de dados.
	 **/
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				
				/* O DriverManager é o serviço básico para gerenciar um
				 * conjunto de drivers JDBC.
				 * 
				 * O método getConnection tenta estabelecer uma conexão com uma
				 * dada url do um banco de dados.
				 * 
				 * retorna um objeto do tipo Connection.
				 *  */
				conn = DriverManager.getConnection(url, props); //  a conexão com o banco de dados é efetivada nessa linha
			} catch(SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		
		return conn;
	}
	
	/* Método responsável por fechar a conexão com o banco de dados */
	public static void closeConnection() {
		if(conn != null) {
			try {
			  conn.close();
			} catch(SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		
	}
   
	/* 
	 * Método responsável por ler o arquivo contendo 
	 * os dados de conexão com o banco de dados e armazenar
	 * esses dados no objeto props do tipo Properties.
	 * 
	 * retorna um objeto do tipo Properties.
	 * */
	private static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			
			/* 
			 * O método load faz a leitura do arquivo db.properties apontado
			 * pelo objeto fs e guarda os dados dentro do objeto props.
			 * */
			props.load(fs);
			
			return props;
		} catch(IOException e) {
			throw new DBException(e.getMessage());
		}
	} 
}
