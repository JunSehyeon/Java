package test1;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X값을 입력:");
		int x = sc.nextInt();
		
		System.out.print("Y값을 입력:");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다";
		System.out.println(result);
		
		sc.close();
	}
}
