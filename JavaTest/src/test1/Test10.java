package test1;

public class Test10 {
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		
		System.out.print(n1+", ");//0
		System.out.print(n2+", ");//1
		
		for(int i=1; i<=10; i++) {
			n3=n1+n2;
			System.out.print(n3+", ");//1
			n1=n2;//n1=1
			n2=n3;
		}
	}
}
//011 2