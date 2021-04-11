package Books;

import java.util.Scanner;

public class HistoryBooks extends books {

	public void getBookInput(Scanner input) {
		System.out.print("Student Id: ");
		int Id = input.nextInt();
		this.setId(Id);

		System.out.print("Book name: ");
		String name = input.nextLine();
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does the book have a writer? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Book writer: ");
				String writer = input.nextLine();
				this.setWriter(writer);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setWriter("");
				break;
			}
			else {
			}
		}

		System.out.print("Book price: ");
		String price= input.nextLine();
		this.setPrice(price);
	}
}
