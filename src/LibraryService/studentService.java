package LibraryService;

import java.util.ArrayList;

import LibraryRepo.studentRepo;
import libraryModle.Book;
import libraryModle.student;

public class studentService {
	studentRepo sr=new studentRepo();
	ArrayList issued=new ArrayList();
	
	public boolean isAddStudent(student s) {
		return sr.isAddStudent(s);
	}
	public ArrayList getAllStudent() {
		return sr.getAllStudent();
	}
	public boolean IssueBook(Book b) 
	{
		return issued.add(b);
	}
	public void setIssueBooks(student s) {
		sr.setIssueBooks(s,issued);
	}
	public ArrayList getIssuedBook(student s){
		return sr.getIssuedBook(s);
	}
}
