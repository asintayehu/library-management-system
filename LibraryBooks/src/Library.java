import java.util.*;

public class Library {
	public static void main(String[] args) {
		/*Project Requirements:
				Object-Oriented Design:
				
				Design the system using object-oriented principles. Each book should be represented as an object with properties such as title, author, and ISBN.
				Implement appropriate classes to represent books and the library itself.
				
				ArrayList Usage:
				
				Use an ArrayList to store the collection of books in the library.
				Implement methods to add, remove, and search for books in the ArrayList.
				
				Functionality:
				Implement methods to add a book to the library, remove a book from the library, and search for a book by its title, author, or ISBN.
				Provide options for listing all books in the library and displaying detailed information about a specific book.
				
				User Interface:
				Design a simple text-based user interface to interact with the library management system.
				Provide clear prompts and messages to guide the user through various actions, such as adding, removing, and searching for books.
				
				Error Handling:
				Implement error handling mechanisms to deal with invalid inputs or operations that cannot be completed (e.g., removing a book that does not exist).
				
				Documentation and Comments:
				Write clear and concise documentation for each class and method, explaining their purpose, parameters, and return values.
				Include comments throughout the code to explain complex logic, important decisions, or any non-obvious implementation details.
				
				Testing:
				Test your library management system with various scenarios, including adding, removing, and searching for books.
				Ensure that the system behaves as expected and handles different cases gracefully.
				
				Code Formatting:
				Follow a consistent code formatting style throughout the project.
				Use meaningful variable and method names to improve readability.
				Organize your code logically into classes, methods, and blocks to enhance maintainability.
				
				Version Control:
				Use version control (e.g., Git) to manage your project's codebase.
				Commit your changes regularly and use descriptive commit messages to track the evolution of your code.
				
				Documentation and Readme:
				Include a README.md file with instructions on how to use the library management system, including setup, compilation, and execution steps.
				Provide an overview of the project, its features, and any additional information that might be helpful for users or contributors.
		 * 
		 * 
		 * 
		 * */
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean flag = false;
		
		int response;
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		String title, author;
		
		long ISBN;
		
		System.out.println("Welcome to the Library Management System!\n");
		
		while(flag == false) {
			System.out.print("\n-----------------------------\n"
					+ ""
					+ "\n1. Add a book"
					+ "\n2. Remove a book"
					+ "\n3. Search for a book"
					+ "\n4. Search for a book"
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
				
				books.add(new Book(title, author, ISBN));
				
				System.out.println("");
				
				break;
			}
			
			for(Book book: books) {
				System.out.println(book.author);
				System.out.println(book.ISBN);
				System.out.println(book.title);
			}
				
			
		}
	}

}
