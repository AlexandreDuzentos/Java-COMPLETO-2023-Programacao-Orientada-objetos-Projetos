package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Aula2Composicao {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment comment1, comment2, comment3, comment4;
		Post post1, post2;
		
		comment1 = new Comment("Have a nice trip!");
		comment2 = new Comment("Wow that's awesome!");
		
		post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to new Zealand", "I'm going to visit this wonderful country", 12);
		
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		System.out.println(post1.toString());
		
			
		comment3 = new Comment("Good night!");
		comment4 = new Comment("May the force be with!");
		
		post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post2.toString());
		
		
		

	}

}
