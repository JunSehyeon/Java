package sub2;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	public Book(String title, String author, String isbn, int availableCopies) {
		this.title=title;
		this.isbn=isbn;
		this.availableCopies=availableCopies;
		this.author=author;
	}
	
	public boolean borrowBook() {
		if(availableCopies>0) {
			availableCopies --;
			return true;
		}else {
			return false;
		}
	}
	
	public void returnBook() {
		availableCopies ++;
	}
	
	public void show() {
		System.out.println("제목 : " + this.title);
		System.out.println("작가명 : " + author); 
		System.out.println("isbn : " + isbn); 	
		System.out.println("이용가능한 복사본 : " + availableCopies); 	
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
