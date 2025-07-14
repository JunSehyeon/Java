package step3;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int a=0;
		int b=0;
		int c=0;
		
		for(int i=0;i<N;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c += (a * b); 
		}
		
		if(c==X) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		sc.close();
	}
}
