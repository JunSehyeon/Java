package step3;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int a= N/4;
		
		for(int i=0;i<a;i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		sc.close();
	}
}
