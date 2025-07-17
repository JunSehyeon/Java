package test4.sub4;

public class Member {
	// 속성
    private String name;          // 회원 이름
    private String memberId;      // 회원 아이디
    private Book borrowedBook;    // 회원이 대출한 도서

    // 생성자
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null; // 대출 도서는 초기에는 없음
    }
    
    // 도서 대출
    public void borrowBook(Book book) {
        if (borrowedBook == null) {
            borrowedBook = book;
            book.borrowBook();  // 도서 상태를 '대출됨'으로 변경
            System.out.println("도서를 성공적으로 대출했습니다.");
        } else {
            System.out.println("이미 도서를 대출 중입니다. 반납 후 대출하세요.");
        }
    }

    // 도서 반납
    public void returnBook(Book book) {
        if (borrowedBook != null && borrowedBook == book) {
            borrowedBook.returnBook(); // 도서 상태를 '대출 가능'으로 변경
            borrowedBook = null;
            System.out.println("도서를 성공적으로 반납했습니다.");
        } else {
            System.out.println("반납할 도서가 없습니다.");
        }
    }

    // 회원 정보 출력
    public void getMemberInfo() {
        System.out.println("회원 이름: " + name);
        System.out.println("회원 ID: " + memberId);
        if (borrowedBook != null) {
            System.out.println("대출 중인 도서 정보:");
            borrowedBook.getBookInfo();
        } else {
            System.out.println("현재 대출 중인 도서가 없습니다.");
        }
    }
}
