package step2;

import java.util.Scanner;

/*
 * 2단계
 * 2025-07-10
 */

public class main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		sc.close();
	}
}
