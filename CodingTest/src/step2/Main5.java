package step2;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		//10시 10분 - 45분  10-45=-35 M-45
		if(M-45<0) {
			H--;
			M=60+(M-45);
			if(H<0) {//0시에서 한시간 줄이기
				H=23;
			}
			
		}else {//10시 50분 - 45분 =10시 5분
			M=M-45;
		}
		
		System.out.printf("%d %d",H,M);
		
		sc.close();
	}
}
