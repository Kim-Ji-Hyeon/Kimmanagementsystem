import java.util.Scanner;

public class MenuManaer {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 4) {
		System.out.println("1. Add books"); 
		System.out.println("2. View books");
		System.out.println("3. Return books");
		System.out.println("4. Exit"); 
		System.out.print("Select one between 1~3: "); 
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.print("Book name: ");
			String bookName = input.next();
			break;
		case 2:
			System.out.print("Write what you want to view: ");
			String book = input.next();
			break;
		case 3:
			System.out.print("Books have been returned.");
			break;
		}
		}
	}

}
