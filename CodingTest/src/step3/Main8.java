package step3;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		int A;
		int B;
		int C;
		
		for(int x=1; x<=T; x++) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = A+B;
			
			System.out.println("Case #"+x+": "+A+" + "+B+" = "+C);
		}
		
		sc.close();
	}
}
