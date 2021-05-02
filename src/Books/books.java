package Books;

import java.util.Scanner;

public class books {

	protected BookKind kind = BookKind.History;
	protected String name;
	protected int Id;
	protected String writer;
	protected String price;
	
	public books() {
	}
	
	public books(BookKind kind) {
		this.kind = kind;
	}
	
	public books(String name, int Id) {
		this.name = name;
		this.Id = Id;
	}
	
	public books(String name, int Id, String writer, String price) {
		this.name = name;
		this.Id = Id;
		this.writer = writer;
		this.price = price;
	}
	
	public books(BookKind kind, String name, int Id, String writer, String price) {
		this.kind = kind;
		this.name = name;
		this.Id = Id;
		this.writer = writer;
		this.price = price;
	}
	
	public BookKind getKind() {
		return kind;
	}

	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case History : 
			skind = "Hist";
			break;
		case Science :
			skind = "Sci";
			break;
		case Language :
			skind = "Lang";
			break;
		case Movie :
			skind = "Mov";
			break;
		default:
			
		}
		System.out.println("kind" + skind + "name: " + name + "Id: " + Id + "Writer: " + writer + "Price: " + price);
	}
	
	public void getBookInput(Scanner input) {
		System.out.print("Student Id: ");
		int Id = input.nextInt();
		this.setId(Id);
		
		System.out.print("Book name: ");
		String name = input.nextLine();
		this.setName(name);
		
		System.out.print("Book writer: ");
		String writer = input.nextLine();
		this.setWriter(writer);
		
		System.out.print("Book price: ");
		String price= input.nextLine();
		this.setPrice(price);
	}
	
}