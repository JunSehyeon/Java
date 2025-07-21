package sub1;

public class ObjectTest {
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("일본",2000);
		
		System.out.println(a1.toString());
		System.out.println(a2);
		
		if(a1==a2) {
			System.out.println("a1과 a2가 같다");
		}else {
			System.out.println("a1과 a2가 다르다");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1과 a2객체가 같다");
		}else {
			System.out.println("a1과 a2객체가 다르다");
		}
		
		System.out.println("a1 해시값:"+a1.hashCode());
		System.out.println("a2 해시값:"+a2.hashCode());
	}
}
