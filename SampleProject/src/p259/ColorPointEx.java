package p259;

class Point{
	private int x,y;
	public void set (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
