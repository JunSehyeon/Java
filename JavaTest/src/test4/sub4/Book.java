package test4.sub4;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book (String title, String author, String isbn, boolean isBorrowd) {
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = isBorrowd;
		this.title = title;
	}
	
	public void borrowBook() {
		//도서가 대출되지 않은 상태라면 대출
		if(!isBorrowd) {
			isBorrowd = true;
			System.out.println("도서가 대출되었습니다");
		} else {
			System.out.println("이미 대출됐습니다");
		}
	}
	
	public void returnBook() {
		//도서가 대출된 상태라면 반납
		if(isBorrowd) {
			isBorrowd = false;
			System.out.println("도서가 반남되었습니다");
		}else {
			System.out.println("이 도서는 대출되지 않았습니다");
		}
	}
	
	public void getBookInfo() {
		//도서의 정보를 추ㅡㄹ력
		 System.out.println("제목: " + title);
	        System.out.println("저자: " + author);
	        System.out.println("ISBN: " + isbn);
	        System.out.println("대출 여부: " + (isBorrowd ? "대출 중" : "대출 가능"));
	}
	
	public String getTitle() {
		//속성title의 getter
		return title;
	}
}
