package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Insert2 {

	public static void main(String[] args) {
		
		/* ---------- INSERCÃO DE DADOS COM RECUPERAÇÃO DA CHAVE PRIMÁRIA GERADA --------- */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement ps = null; // objeto que representa uma declaração sql pré-compilada.
		
		try {
			conn = DB.getConnection();
			
			/* 
			 * O método prepareStatement cria um objeto PreparedStatement para enviar
			 * declarações SQL parametrizadas para o banco de dados.
			 * 
			 * o ?(interrogação) na declaração sql é o que chamamos de placeholder,
			 * ou seja, ele guarda os lugares dos valores a serem inseridos
			 * posteriormente.
			 * */
			ps = conn.prepareStatement(
					   "INSERT INTO seller "
					  + "(Name, Email, Birthdate, BaseSalary, DepartmentId)"
					  + "values (?, ?, ?, ?, ?)",
					  java.sql.Statement.RETURN_GENERATED_KEYS
					);
			
			/* substituindo os placeholders pelos valores de fato */
			ps.setString(1, "Carl purple");
			ps.setString(2, "Carl@gmail.com");
			
			/* 
			 * O método getTime pega numa data do tipo Date(java.util.date) e transforma em
			 * milissegundos, e o para o construtor da classe Date(java.util.sql)
			 * é passado um valor em milissegundos para ele gerar a data a ser inserida no db.
			 * */
			ps.setDate(3, new Date(sdf.parse("22/04/1995").getTime()));
			ps.setDouble(4, 3000.0);
			ps.setInt(5, 4);
			
			/* 
			 * O método executeUpdate executa o comando passado para o método
			 * prepareStatement, e retorna a quantidade de linhas de foram
			 * afetadas pela execução do comando.
			 * */
			int rowsAffected = ps.executeUpdate();
			
			if(rowsAffected > 0) {
				/* o getGeneratedKeys gera uma tabela auxiliar contendo 
				 * apenas a coluna de id */
				ResultSet rs = ps.getGeneratedKeys();
				
				while(rs.next()) {
					/* Pegando o valor da primeira coluna */
					int id = rs.getInt(1);
					System.out.println("Done! Id = "+ id);
				}
			} else {
				System.out.println("No rows affected!");
			}
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		} finally {
			/* fechar um recurso é fechar a comunicação de uma classe
			 * com algum meio externo, tais como banco de dados, rede,
			 * sistema de arquivos.
			 *  */
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		

	}

}
