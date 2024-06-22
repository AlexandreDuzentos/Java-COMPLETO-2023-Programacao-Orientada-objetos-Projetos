package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBException;

public class Transaction {

	public static void main(String[] args) {
		
		/* --- TRANSAÇÃO ---- */
		/* Uma transação geralmente representa qualquer alteração
		 * no banco de dados, ela tem como objetivo manter a consistência
		 * do banco de dados.
		 * 
		 * Uma transacão possui quatro propriedades: atomicidade, consistência,
		 * isolamento e durabilidade.
		 * 
		 * exemplo de transação: transferência bancária: transferir um dinheiro
		 * da conta da pessoa A para conta da Pessoa B consiste em fazer dois passos,
		 * primeiro, debitar o dinheiro da conta da pessoa A e segundo creditar
		 * o dinheiro da conta da pessoa B, agora imagina, se no meio do processo,
		 * logo após o primeiro passo, acontece um erro no sistema e o processo é
		 * interrompido, o que vai acontecer? os dados ficarão inconsistentes, vai
		 * estar constando no banco de dados que a conta da Pessoa A tem menos dinheiro,
		 * se que na conta da pessoa B não tem dinheiro nenhum a mais, então para
		 * garantir que a operações de transferência seja consistente, ela precisa ser uma
		 * transação.
		 **/
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			/* O método setAutoCommit recebe um valor booleano, se o valor
			 * for true todas as operações com o banco de dados estão confirmadas
			 * para serem executadas automaticamente, se retornar false, as operações não estão confirmadas
			 * para serem executadas automaticamente e aguardam por uma confirmação de
			 * execução posterior */
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE Seller set BaseSalary = 2090 where DepartmentId = 1");
			
			/* Simulando um erro durante a transação */
			//int x = 1;
			//if(x < 2) {
				///throw new SQLException("Fake error");
			//}
			
			int rows2 = st.executeUpdate("UPDATE Seller set BaseSalary = 3090 where DepartmentId = 2");
			
			/* confirma que as transações terminaram e podem ser executadas */
			conn.commit();
			
			System.out.println("Rows 1: "+ rows1);
			System.out.println("Rows 2: "+rows2);
		} catch(SQLException e) {
			 /* 
			  * Volta o banco de dados a um estado anterior ao que ele estava
			  * antes das operações que foram efetuadas nele.
			  * */
			try {
				conn.rollback();
				
				/*
				 * Essa exceção é lançada no bloco try porque ele está dentro
				 * de um bloco catch e dentro de um bloco catch podem lançar-se
				 * exceções.
				 * 
				 * A outra estrutura try-catch está sendo usada, porque a operação
				 * rollback também pode lançar uma exceção.
				*/
				throw new DBException("Transaction rolled back! Caused by: "+ e.getMessage());
			} catch(SQLException e1) {
			    throw new DBException("Error trying to rollback!");
			}
			 
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		


	}

}
