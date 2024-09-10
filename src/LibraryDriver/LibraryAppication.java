package LibraryDriver;
import java.util.*;

import LibraryService.BookService;
import LibraryService.studentService;
import libraryModle.Book;
import libraryModle.student;
public class LibraryAppication {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		BookService bs=new BookService();
		studentService sr=new studentService();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add new book");
			System.out.println("2.view all book");
			System.out.println("3.view book category wise");
			System.out.println("4.view book information category wise");
			System.out.println("5.view book information authore wise");
			System.out.println("6.add new Student");
			System.out.println("7.issued book to Student");
			System.out.println("8.stock after book issued");
			System.out.println("9.delete book by authore");
			System.out.println("10.view student wise book");
			choice=sc.nextInt();
			al=bs.getBook();
			switch(choice) {
			
				case 1:
				{
					boolean flag=true;
					System.out.println("Enter book id");
					int id=sc.nextInt();
					System.out.println("Enter book name");
					sc.nextLine();
					String name=sc.nextLine();
					if(al!=null && al.size()>0) {
						for(Object o:al) {
							Book b=(Book)o;
							if(b.getId()==id ||b.getName().equals(name)) {
								System.out.println("book is alredy present");
								flag=false;
								break;
							}
						}
					}
					if(flag) {
						System.out.println("Enter book authore");
						String authore=sc.nextLine();
						System.out.println("Enter book publication");
						String publication=sc.nextLine();
						System.out.println("Enter book price");
						int price=sc.nextInt();
						System.out.println("Enter book category");	
						sc.nextLine();
						String category=sc.nextLine();
						System.out.println("Enter book status");
						String status=sc.nextLine();
						Book b=new Book(id,name,authore,publication, price, category, status);
						boolean flag1=bs.isAddBook(b);
						if(flag1) {
							System.out.println("Book added Successfully.................");
						}
						else {
							System.out.println("there is some problem.................");
						}
					}
					break;
				}
				
				case 2:
				{
					al=bs.getBook();
					if(al==null || al.size()==0) {
						System.out.println("There is no book present in library");
					}
					else {
						System.out.println("*****************Dispaly all books in library*******************");
						for(Object obj:al) {
							Book b=(Book)obj;
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
					break;
				}
				
				case 3:
				{
					if(al==null || al.size()==0) {
						System.out.println("There is no book present in library");
					}
					else {
						System.out.println("___________________________________________");
						System.out.println("category\tcountOfBooks");
						System.out.println("___________________________________________");
						al=bs.getBook();
						for(int i=0;i<al.size();i++) {
							Book b1=(Book)al.get(i);
							String cat=b1.getCategory();
							int count=1;
							boolean flag2=true;
							for(int j=0;j<i;j++) {
								Book b2=(Book)al.get(j);
								if(b2.getCategory().equals(cat)) {
									flag2=false;
									break;
								}
							}
							if(flag2) {
								for(int k=i+1;k<al.size();k++){
									Book b3=(Book)al.get(k);
									if(b3.getCategory().equals(cat)){
										count++;
									}
								}
								System.out.println(cat+"\t"+count);
							}
						}
						}
					break;
				}
				
				case 4:{
					if(al==null || al.size()==0){
						System.out.println("There is no book present in library");
					}
					else{
						System.out.println("**************category Wise Books information*************");
						al=bs.getBook();
						for(int i=0;i<al.size();i++) {
							Book b1=(Book)al.get(i);
							String cat=b1.getCategory();
							boolean flag2=true;
							for(int j=0;j<i;j++) {
								Book b2=(Book)al.get(j);
								if(b2.getCategory().equals(cat)) {
									flag2=false;
									break;
								}
							}
							if(flag2) {
								System.out.println("category-------------->"+cat);
								bs.displayBook(b1);
								for(int k=i+1;k<al.size();k++) {
									Book b3=(Book)al.get(k);
									if(b3.getCategory().equals(cat)) {
										bs.displayBook(b3);
									}
								}
							}
						}
						}
					break;
				}
				
				case 5:{
					if(al==null || al.size()==0) {
						System.out.println("There is no book present in library");
					}
					else {
						System.out.println("**************Authore Wise Books information*************");
						al=bs.getBook();
						for(int i=0;i<al.size();i++) {
							Book b1=(Book)al.get(i);
							String author=b1.getAuthore();
							boolean flag2=true;
							for(int j=0;j<i;j++) {
								Book b2=(Book)al.get(j);
								if(b2.getAuthore().equals(author)) {
									flag2=false;
									break;
								}
							}
							if(flag2) {
								System.out.println("authore-------------->"+author);
								bs.displayBook(b1);
								for(int k=i+1;k<al.size();k++) {
									Book b3=(Book)al.get(k);
									if(b3.getAuthore().equals(author)) {
										bs.displayBook(b3);
									}
								}
							}
						}
						}
					break;
				}
				case 6:
				{
					System.out.println("Enter student id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter student name");
					String name=sc.nextLine();
					System.out.println("Enter student email");
					String email=sc.nextLine();
					System.out.println("Enter student contact");
					String contact=sc.nextLine();
					student s=new student(id, contact, contact, contact);
					boolean flag=sr.isAddStudent(s);
					if(flag) {
						System.out.println("Student added successfully!!!!!!!!!!!!");
					}
					else{
						System.out.println("there is some problem");
					}
					break;
				}
				case 7:
				{
					boolean sflag=false;
					student s1=null;
					al=sr.getAllStudent();
					if(al==null) {
						System.out.println("no student in record");
					}
					else {
						int bchoice=1;
						System.out.println("Enter Student id");
						int sid=sc.nextInt();
						for(Object o:al) {
						student s=(student)o;
							if(s.getId()==sid) {
								s1=s;
								sflag=true;
								break;
							}
						}
						if(sflag)
						{
							al=bs.getBook();
							if(al==null || al.size()==0) {
								System.out.println("no book in library");
							}
							else {
								studentService sr1=new studentService();
								while(bchoice==1) {
									boolean issuedflag=false;
									System.out.println("enter name of book you want");
									sc.nextLine();
									String bname=sc.nextLine();
									for(Object obj:al) {
										Book b=(Book)obj;
										if((b.getName().equals(bname))&& b.getStatus().equals("not issued")) {
											issuedflag=sr1.IssueBook(b);
											b.setStatus("issued");
											System.out.println("book is issued to you");
											break;
										}
										
									}
								if(issuedflag==false)
								{
									System.out.println("this book is either not avalaible or issued to someone else");
								}
								System.out.println("do you want more book\n 1.yes 2.no");
								bchoice=sc.nextInt();
								}
								sr1.setIssueBooks(s1);
							}
						}
						else {
							System.out.println("no student with this id found");
						}
					}
					break;
				}
				case 8:
				{
					al=bs.getBook();
					if(al==null || al.size()==0) {
						System.out.println("no book in library");
						
					}
					else {
						System.out.println("*****************stock of remaining books*******************");
						System.out.println("_____________________________________________________________");
						for(Object obj:al) {
							Book b=(Book)obj;
							if(b.getStatus().equals("not issued"))
							{
								bs.displayBook(b);
							}
						}
					}
					break;
					
				}
				case 9:
				{
					al=bs.getBook();
					if(al==null || al.size()==0) {
						System.out.println("no book in library");
						
					}
					else
					{
						System.out.println("Enter author name");
						sc.nextLine();
						String aname=sc.nextLine();
						boolean flagr=false;
						Iterator i=al.iterator();
						while(i.hasNext())
						{
							Book re=(Book)i.next();
							if(re.getAuthore().equals(aname)) {
								i.remove();
								flagr=true;
							}
						}
						if(flagr) {
							System.out.println(aname+ " Author book removed successfully");
						}
						else {
							System.out.println("no book of this authore found");
						}
					}
					break;
				}
				case 10:
				{
					al=sr.getAllStudent();
					if(al==null) {
						System.out.println("no student in record");
					}
					else
					{
						System.out.println("---------------------Display Student-----------------");
						for(Object obj:al) {
							student s2=(student)obj;
							System.out.println("______________________________________________________");
							System.out.println("student id ->"+s2.getId());
							System.out.println("student name ->"+s2.getName());
							System.out.println("student email ->"+s2.getEmail());
							System.out.println("student contact ->"+s2.getContact());
							ArrayList arr=sr.getIssuedBook(s2);
							if(arr==null) {
								System.out.println("--------------no book issued to this student--------------");
							}
							else {
								System.out.println("-----------------books name issued to this student------------------");
								for(Object obj1:arr) {
									Book b=(Book)obj1;
									bs.displayBook(b);
								}
							}
						}
				
					}
					break;
				}
			}
		}
		while(true);
	}
}
