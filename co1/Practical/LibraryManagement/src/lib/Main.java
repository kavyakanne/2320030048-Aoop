package lib;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library library = new Library();
	        Book book1 = new Book("1984", "George Orwell");
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
	        Member member1 = new Member("Alice", 1);
	        Member member2 = new Member("Bob", 2);

	        library.addBook(book1);
	        library.addBook(book2);
	        library.addMember(member1);
	        library.addMember(member2);

	        Borrowing borrowingProcess = new Borrowing(library);
	        borrowingProcess.borrowBook(book1);
	        borrowingProcess.returnBook(book1);
	    }

	}


