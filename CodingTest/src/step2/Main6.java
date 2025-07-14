package step2;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int Time = sc.nextInt();
		
		//전체 분 계산
		M += Time;
		
		// M이 60 이상이면 시(H)에 올림 처리
		H += M / 60;
		M = M % 60;
		
		// 시가 24 이상이면 0~23로 맞춰주기
		H = H % 24;
				
		System.out.printf("%d %d",H,M);
		sc.close();
	}
}
