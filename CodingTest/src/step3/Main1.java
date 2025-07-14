package step3;

import java.util.Scanner;

/*
 * 2단계
 * 2025-07-11
 * 반복문
 */

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<10;i++) {
		    System.out.printf("%d x %d = %d\n",n,i,n*i);
		}
		
		sc.close();
	}
}
