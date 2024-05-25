
public class Book {
	
	String title;
	String author;
	long ISBN;
	
	Book(String title, String author, long ISBN){
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	Book(String title, String author){
		this.author = author;
		this.title = title;
	}

}
