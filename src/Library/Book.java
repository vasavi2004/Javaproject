package Library;

public class Book {
	    private String title;
	    private String author;
	    private String bookId;

	    public Book(String title, String author, String bookId) {
	        this.title = title;
	        this.author = author;
	        this.bookId = bookId;
	    }

	    public void displayBook() {
	        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
	    }
	}

