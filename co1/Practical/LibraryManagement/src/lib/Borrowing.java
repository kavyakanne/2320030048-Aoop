package lib;

public class Borrowing implements Borrow{
	   private Library library;
	 public Borrowing(Library library) {
		 this.setLibrary(library);

	    }
	    public void borrowBook(Book book) {
	        if (book.isAvailable()) {
	            book.setAvailable(false);
	            System.out.println("Book borrowed: " + book.getTitle());
	        } else {
	            System.out.println("Book is not available: " + book.getTitle());
	        }
	    }
	    public void returnBook(Book book) {
	        book.setAvailable(true);
	        System.out.println("Book returned: " + book.getTitle());
	    }
		public Library getLibrary() {
			return library;
		}
		public void setLibrary(Library library) {
			this.library = library;
		}

}
