package sub4;

public class Sedan extends Car{
	
	//속성-무조건 private으로 선언, 상속관계에서는 부모클래스 이면 protected로 선언
	private int cc;//배기량
	//private String color;
	protected int speed;//상속관계에서 자식 클래스에서 참조도 가능하게 접근권한을 protected로 변경 
	
	public Sedan(String name, String color, int speed,int cc) {
		//부모클래스 생성자 호출
		super(name, color,speed);
		this.cc=cc;//초기화
	}
	
	public void turbo() {
		this.speed+=10;
	}
	
	public void show() {
		super.show();//부모클래스show()호출
		System.out.println("배기량:"+this.cc);
	}

}
