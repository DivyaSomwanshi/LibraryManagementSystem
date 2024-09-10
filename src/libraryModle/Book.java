package libraryModle;

public class Book {
	private int id;
	private String name,authore,publication;
	private int price;
	
	public Book() {
		
	}
	public Book(int id, String name, String authore, String publication, int price, String category, String status) {
		super();
		this.id = id;
		this.name = name;
		this.authore = authore;
		this.publication = publication;
		this.price = price;
		this.category = category;
		this.status = status;
	}
	private String category,status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthore() {
		return authore;
	}
	public void setAuthore(String authore) {
		this.authore = authore;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
