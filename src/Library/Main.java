package Library;

	import Library.Book;
	import Library.Member;
	import static Library.Utility.generateId; // Static import

	public class Main {
	    public static void main(String[] args) {
	        Book book1 = new Book("The Alchemist", "Paulo Coelho", generateId());
	        Member member1 = new Member("Alice Johnson", generateId());

	        book1.displayBook();
	        member1.displayMember();
	    }
	}
