package step2;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result;
		
		//같은 눈이 3개 나온 경우 : 10000원 + 같은 눈 * 1000
		if(A==B&&B==C) {
			result = 10000 + A * 1000;
		}
		//같은 눈이 2개 나오는 경우: 1000원 + 눈 * 100
		else if(A==B||B==C||A==C) {
			
			if(A==B || A == C) {
				result = 1000 + A * 100;
			}else {
				result = 1000 + B * 100;
			}
			
		}
		//모두 다른 눈이 나오는 경우 : 가장 큰 눈 *100
		else {
			if(A>B&&A>C) {
				result = A * 100;
			}else if(B>A&&B>C) {
				result = B * 100;
			}else {
				result = C * 100;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
