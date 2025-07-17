package sub7;

public class AbstractTest {
	public static void main(String[] args) {
		
		//추상클래스는 단독으로 객체 생성 불가
		//Animal animal = new Animal();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		tiger.hunt();
		tiger.move();
		
		eagle.hunt();
		eagle.move();
	}
}
