package p193;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title= t;
		author="작자미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = "작자미상";
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생택쥐페리");
		
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title+" "+littlePrince.author);;
		System.out.println(loveStory.title+" "+loveStory.author);;
	}
}
