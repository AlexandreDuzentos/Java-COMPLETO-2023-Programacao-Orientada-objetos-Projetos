package application;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Insert {

	public static void main(String[] args) {
		
		/* ---------- INSERCÃO DE DADOS --------- */
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
					  + "values (?, ?, ?, ?, ?)"
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
			
			System.out.println("Done! rows affected "+ rowsAffected);
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		} finally {
			/* fechar um recurso é fechar a comunicação de uma classe
			 * com algum meio externo, tais como banco de dados, rede,
			 * sistema de arquivos.
			 * 
			 * PreparedStatement é um subtipo da interface Statement. Significa
			 * que preparedStatement cumpre o contrato de todos os métodos definidos
			 * na interface Statement e, portanto, pode ser usado em qualquer
			 * lugar onde um Statement é esperado.
			 * 
			 * liberar memória é o mesmo que desalocar objeto que está a consumir a memória
			 * da memória, de modo a garantir mais memória para o meu programa.
			 *  */
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		

	}

}
