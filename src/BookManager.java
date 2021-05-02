import java.util.ArrayList;
import java.util.Scanner;

import Books.BookKind;
import Books.HistoryBooks;
import Books.ScienceBooks;
import Books.books;

public class BookManager {
	ArrayList<books> books = new ArrayList<books>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}

	public void addBook() {	
		int kind = 0;
		books book;
		while (kind != 1 && kind != 2) {
			System.out.print("1. For History");
			System.out.print("2. For Science");
			System.out.print("3. For Language");

			System.out.print("Select num for Book Kind between 1,2 or 3: ");	
			kind = input.nextInt();
			
			if (kind == 1) {
				book = new books(BookKind.History);
				book.getBookInput(input);
				books.add(book);
				break;
			}
			else if (kind == 2) {
				book = new HistoryBooks(BookKind.Science);
				book.getBookInput(input);
				books.add(book);
				break;
			}
			else if (kind == 3) {
				book = new ScienceBooks(BookKind.Language);
				book.getBookInput(input);
				books.add(book);
				break;
			}
			else {
				System.out.print("Select num for Book Kind between 1,2 or 3: ");
			}
		}
	}

	public void deleteBook() {
		System.out.print("Student Id: ");
		int StudentId = input.nextInt();
		int index = -1;
		for (int i = 0; i<books.size(); i++) {
			if (books.get(i).getId() == StudentId) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			books.remove(index);
			System.out.println("The book" + StudentId + " is deleted.");
		}
		else {
			System.out.println("The book has not been registered.");
			return;
		}
	}
	
	public void editBook() {
		System.out.print("Student Id: ");
		int StudentId = input.nextInt();
		for(int i = 0; i < books.size(); i++) {
			books book = books.get(i);
			if (books.get(i).getId() == StudentId) {
				int num = -1;
				while (num != 5); {
					System.out.println("** Books Info Edit Menu");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Writer");
					System.out.println("4. View Price ");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1~5: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Student Id: ");
						int Id = input.nextInt();
						book.setId(Id);
					}
					else if (num == 2) {
						System.out.print("Book Name: ");
						String name = input.next();
						book.setName(name);
					}
					else if (num == 3) {
						System.out.print("Book Writer: ");
						String writer = input.next();
						book.setWriter(writer);
					}
					else if (num == 4) {
						System.out.print("Book Price: ");
						String price = input.next();
						book.setPrice(price);
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
	}
	public void viewBooks() {
//		System.out.print("Student ID: "); 
//		int StudentID = input.nextInt();
		System.out.println("# of registered books: " + books.size());
		for(int i = 0; i < books.size(); i++) {
			books.get(i).printInfo();
		}
	}
}
