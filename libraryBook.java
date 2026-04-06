package placement;

 class Book {
	int bookId;
	String bookname;
	String author;
	boolean isIssued = false;
	
	void issueBook(){
		if(isIssued == false) {
			isIssued = true;
			System.out.println("Book issued successfully");
		}
		else {
			System.out.println("Book already issued");
		}
	}
	
	void returnBook() {
		if(isIssued == true) {
			isIssued = false;
			System.out.println("Book returned successfully");
		}
		else {
			System.out.println("Book was not issued");
		}
	}
	void displayBook() {
		System.out.println("Book ID: "+bookId);
		System.out.println("Book Name: "+bookname);
		System.out.println("Author: "+author);
		System.out.println("Issued: "+isIssued);
	}
}
public class libraryBook{
	public static void main(String[]args) {
		Book m = new Book();
		m.bookId = 101;
		m.bookname = "Java programming";
		m.author = "james gosling";
		
		m.displayBook();
		m.issueBook();
		m.returnBook();
	}
}
