package step1;

import java.util.Scanner;

/*
 * 1단계 6번 문제
 * 2025-07-10
 */
public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		sc.close();
	}
}
