package sub4;

public class InheritTest {
	public static void main(String[] args) {
		
		//Car 상속 실습
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고","남색",0,0);
		bongo.speedUp(80);
		bongo.load(100);
		bongo.speedDown(20);
		bongo.show();
		
		//person doctor engineer 실습
		Doctor doctor = new Doctor("김유신",23,"소아과");
		Engineer engineer = new Engineer("김춘추",25,"소프트웨어");
		
		doctor.introduce();
		engineer.introduce();
		
	}
}
