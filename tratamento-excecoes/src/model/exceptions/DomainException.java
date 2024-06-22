package model.exceptions;

public class DomainException extends RuntimeException {
	
	 /* recebeu o nome de DomainException porque é uma exceção que pode ser lançada nas minhas
	* classes de Domain(domínio).
	* 
	* E toda classe que é uma exceção recebe a terminação Exception.
	* */

	/**
	 * A classe DomainException agora é serializable, porque ela herda de uma
	 *  classe serializable que é a RuntimeException, classes que são serializable
	 *  podem ter seus objetos convertidos para bytes e assim trafega-los em redes, ser
	 *  gravados em arquivos e etc.
	 *  
	 *  classes serializable precisam ter um número de versão, que fica armazenado
	 *  em uma constante na própria classe.
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
