package LibraryService;

import java.util.ArrayList;

import LibraryRepo.BookRepo;
import libraryModle.Book;

public class BookService {
	BookRepo br=new BookRepo();
	public ArrayList getBook() {
		return br.getBooks();
	}
	public boolean isAddBook(Book b) {
		return br.isAddBook(b);
	}
	public void displayBook(Book b) {
		System.out.println("Book Id is ->"+b.getId());
		System.out.println("Book name is ->"+b.getName());
		System.out.println("book authore is ->"+b.getAuthore());
		System.out.println("book publication is ->"+b.getPublication());
		System.out.println("book price is ->"+b.getPrice());
		System.out.println("book category is ->"+b.getCategory());	
		System.out.println("book status is ->"+b.getStatus());
		System.out.println("___________________________________________________________________________________________");
	}
}
