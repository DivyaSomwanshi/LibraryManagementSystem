package LibraryRepo;

import java.util.ArrayList;

import libraryModle.Book;

public class BookRepo {
	 ArrayList Books=new ArrayList();
	 public ArrayList getBooks()
	 {
		 return Books.size()>0?Books:null;
	 }
	 public boolean isAddBook(Book b) {
		 return Books.add(b);
	 }
}
