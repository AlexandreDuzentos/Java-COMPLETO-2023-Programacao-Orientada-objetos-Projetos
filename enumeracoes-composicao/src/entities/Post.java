package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	/* o private static fará com que eu não tenha uma cópia do objeto sdf, para
	 * cada post feito, ou seja para cada instância de um objeto do tipo Post, isto porque
	 * o acesso a atributos estáticos é independente da criação de objetos, desse modo
	 * haverá apenas uma cópia do objeto para a aplicação inteira.
	 *  */
	 private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	 private Date moment;
	 private String title;
	 private String content;
	 private Integer likes;
	 
	 /*
	  * composição de objetos: declarando e instânciando uma lista.
	  * 
	  * quando temos uma composição tem-muitos, o atributo que armazenará outros objetos
      * não deve ser incluído no construtor, você simplesmente o inicia a sua lista vazia,
      * instânciando-a.
	  * 
	  * A propriedade comments não pode estar no construtor por que ela permitirá que 
	  * a lista de comments dentro do objeto seja trocada por outra lista de comments
	  * passada como parâmetro para o contrutor, e o mesmo que aconteceria se tivessemos
	  * um método setcomment, por conta disso, ele também não deve estar presente.
	  * 
	  * */
	 private List<Comment> comments = new ArrayList<>();
	 
	 public Post() {
		 
	 }
	 
	 
	 public Post(Date moment, String title, String content, Integer likes) {
		 this.moment = moment;
		 this.title = title;
		 this.content = content;
		 this.likes = likes;
	 }

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	
	/* Método resposável por associar um Comment de um post */
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	/* Método responsável por desassociar  um Comment de um Post*/
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	/* A classe StringBuilder é muito mais otimizada para montar uma
	 * String grande a partir de outras String menores, consome menos memória
	 * do que forma tradicional de concatenação, que é baseada no uso do +(mais).
	 * */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title+ "\n"); // o \n(barra invertidade n) é utilizada para quebrar uma linha
		sb.append(likes);
		sb.append(" Likes - "+ sdf.format(moment) + "\n");
		sb.append("Comments:\n");
		for(Comment c: comments) {
			sb.append(c.getText()+ "\n");
		}
		
		/* Convertendo o objeto StringBuilder para String e retornando-o */
		return sb.toString();
	}
}
