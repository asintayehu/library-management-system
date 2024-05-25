import java.util.*;

public class Library {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean flag = false;
		
		int response;
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		String title, author;
		
		long ISBN = 0L;
		
		System.out.println("Welcome to the Library Management System!\n");
		
		while(flag == false) {
			System.out.print("-----------------------------\n"
					+ ""
					+ "\n1. Add a book"
					+ "\n2. Remove a book"
					+ "\n3. Search for a book"
					+ "\n4. List all books"
					+ "\n5. Exit"
					+ "\n"
					+ "\nPlease enter your choice: ");
			
			
			response = keyboard.nextInt();
			
			System.out.println("");
			
			keyboard.nextLine();
			
			switch(response) {
			
			case 1:
				System.out.print("Option 1: Add a book\n"
						+ "\n"
						+ "Enter the Title of the Book: ");
				
				title = keyboard.nextLine();
								
				System.out.println("");
				
				System.out.print("Enter the Author of the Book: ");
				
				author = keyboard.nextLine();
							
				System.out.println("");

				System.out.print("Enter the ISBN of the Book: ");
				
				ISBN = keyboard.nextLong();

				System.out.println(""
						+ ""
						+ ""
						+ "Book added successfully!");
				
				Book new_book = new Book(title, author, ISBN);
				
				books.add(new_book);
				
				break;
				
				
			case 2:
				System.out.println("Option 2: Remove a Book");

				System.out.print("Enter the ISBN of the Book to Remove: ");
				
				long targetISBN = keyboard.nextLong();
				
				for(Book book: books) {
					if(book.ISBN == targetISBN)
						books.remove(book);
					}
					
				System.out.println("Book successfully removed!");
				
			break;
			
			case 3:
				System.out.println("--------------------\nOption 3: Search for a Book");
				System.out.println("1. Search by Title\n2. Search by Author\n3. Search by ISBN");
				System.out.print("Please enter your choice: ");
				
				int searchChoice = keyboard.nextInt();
				keyboard.nextLine(); // input sanitization
				
				switch(searchChoice) 
				{
					case 1:
						System.out.print("Enter title: ");
						
						String searchTitle = keyboard.nextLine();
						
						System.out.println("Books with title" + " \"" + searchTitle + "\": \n");
						
						for(int i = 0; i < books.size(); i++) {
							// 1. Harry Potter and the Sorcerer's Stone (ISBN: 9780590353427)
							if(books.get(i).title.toLowerCase().equals(searchTitle)) {
								System.out.println(i + 1 + ". "+ books.get(i).title + " (ISBN: " + books.get(i).ISBN + ")");
							}
						}
						break;
						
						
					case 2:
						System.out.print("Enter Author Name: ");
						String targetAuthor = keyboard.nextLine();
						
						System.out.println("Books by" + " \"" + targetAuthor + "\": \n");
						
						for(int i = 0; i < books.size(); i++) {
							// 1. Harry Potter and the Sorcerer's Stone (ISBN: 9780590353427)
							if(books.get(i).author.toLowerCase().equals(targetAuthor)) {
								System.out.println(i + 1 + ". "+ books.get(i).title + " (ISBN: " + books.get(i).ISBN + ")");
							}
						}
						
						break;
						
					case 3:
						System.out.print("Enter ISBN: ");
						long searchISBN = keyboard.nextLong();
						
						System.out.println("Books with ISBN:" + " \"" + searchISBN + "\": \n");
						
						for(int i = 0; i < books.size(); i++) {
							// 1. Harry Potter and the Sorcerer's Stone (ISBN: 9780590353427)
							if(books.get(i).ISBN == searchISBN) {
								System.out.println(i + 1 + ". "+ books.get(i).title + " by " + books.get(i).author);
							}
						}
						
						break;
						
				}
				
			case 4:
				for(int i = 0; i < books.size(); i++) {
					System.out.println(i + 1 + ". \"" + books.get(i).title + "\"by " + books.get(i).author + " (ISBN: " + books.get(i).ISBN + ")");
				}
				break;
				
			case 5:
				flag = true;
				break;		

				}
			
		}
		
		System.out.println("Thank you for using the program!!");
	}
}