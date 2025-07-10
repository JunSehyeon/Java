package step1;

import java.util.Scanner;

/*
 * 1단계 9번 문제
 * 2025-07-10
 */
public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int firstDigit = B % 10;
		int secondDigit = (B % 100)/10;
		int thirdDigit = B / 100;
		
		System.out.println(A*firstDigit);	
		System.out.println(A*secondDigit);	
		System.out.println(A*thirdDigit);	
		System.out.println(A*B);	
		
		sc.close();
	}
}
