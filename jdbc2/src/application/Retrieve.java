package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Retrieve {

	public static void main(String[] args) {
		
		/* ---------- RECUPERAÇÃO DE DADOS DO SGBD ----------- */
		
		/* 
		 * Usamos as classes Connection, Statement e ResultSet para operações
		 * de entrada e saída com o banco de dados.
		 * 
		 * recursos externos que não são controlados pela jvm,é interessante
		 * que  nós fechemos esses recursos manualmente, para evitar que o meu
		 * programa tenha algum vazamento de memória.
		 * */
		
		/* Inicializando os objetos */
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			
			/* O método createStatement cria um objeto statement para enviar declarações
			 * para o banco de dados. Declarações sql sem parâmetro são geralmente executadas
			 * usando o objeto Statement. */
			st = conn.createStatement();
			
			/* 
			 * método responsável por executar uma consulta no
			 * banco de dados, que retorna um único objeto do tipo ResultSet. 
			 * */
			rs = st.executeQuery("select * from  department ");
			
			/* o método next move o cursor do resultSet para a próxima posição, ou seja,
			 * próxima tupla, por padrão ele começa na tupla 0, que é onde
			 * ficam os campos, se existir a posição para a qual o cursor foi movido é 
			 * retornado true senão é retornado false.
			 * */
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", "+ rs.getString("Name"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {	
			    /* Aqui eu não obrigado a tratar quaisquer possíves exceções
			     * que essas chamadas possam lançar, pois as exceções que
			     * possívelmente serão lançadas são exceções personalizadas que herdam
			     * de RuntimeException, que é um tipo de exceção cujo não há obrigatoriedade
			     * de se tratar.
			     * */
				DB.closeResultSet(rs);
				DB.closeStatement(st);
				DB.closeConnection();	
		}
		
		
		/* Classes da API do JDBC Statement, CallableStatement and
		 * preparedStatement.
		 * 
		 * Essas interfaces acima definem métodos e propriedades que habilitam
		 * ao programador enviar comandos SQL ou PLSQL e receber dados da base
		 * de dados.
		 * 
		 * Elas também definem métodos que ajudam a intermediar diferenças de tipos
		 * de dados entre a linguagem java e o SQL.
		 * 
		 * ResultSet é um objeto que representa um conjunto de dados retornados da
		 * fonte de dados, normalmente, como resultado de uma consulta.
		 *  
		 **/

	}

}
