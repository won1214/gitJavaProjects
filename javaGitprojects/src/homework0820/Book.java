package homework0820;

public class Book {
	private int code;
	private String title;
	private String author;
	
	public Book(int code, String title, String author) {
		this.code = code;
		this.title = title;
		this.author = author;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return this.code + " " + this.title + " "+ this.author + "작가님";
	}
	
	
	
	
	
}
