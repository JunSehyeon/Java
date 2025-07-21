package step3;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		int A;
		int B;
		
		for(int x=1;x<=T;x++) {
			A = sc.nextInt();
		    B = sc.nextInt();
		    int C = A+B;
			System.out.println("Case #"+ x +": "+ C);
		}
		sc.close();
	}
}
