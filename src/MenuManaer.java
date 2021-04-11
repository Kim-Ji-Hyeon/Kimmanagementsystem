import java.util.Scanner;

public class MenuManaer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input);
		
		int num = -1;

		while (num != 5) {
			System.out.println("1. Add books"); 
			System.out.println("2. Delete book");
			System.out.println("3. Edit book");
			System.out.println("4. View books");
			System.out.println("5. Exit"); 
			System.out.print("Select one between 1~5: "); 
			num = input.nextInt();
			if (num==1) {
				bookManager.addBook();
			}
			else if (num==2) {
				bookManager.deleteBook();
			}
			else if (num==3) {
				bookManager.editBook();
			}
			else if (num==4) {
				bookManager.viewBooks();
			}
			else {
				continue;
			}
		}
	}

}
