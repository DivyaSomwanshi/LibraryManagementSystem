package LibraryRepo;

import java.util.ArrayList;

import libraryModle.student;

public class studentRepo {
	ArrayList studentData=new ArrayList();
	public boolean isAddStudent(student s) {
		return studentData.add(s);
	}
	public ArrayList getAllStudent() {
		return studentData.size()>0?studentData:null;
	}
	public ArrayList getIssuedBook(student s) {
		return s.getBookIssued();
	}
	public void setIssueBooks(student s, ArrayList issued) {
		s.setBookIssued(issued);
	}
}
