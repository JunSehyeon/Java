package step3;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();//테스트 케이스 갯수 입력
		int[] result = new int[n]; 
		
		int A = 0;
		int B = 0;
		
		for(int i=0;i<n;i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			result[i]=A+B;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
		
		sc.close();
		
	}
}
