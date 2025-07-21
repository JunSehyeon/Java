package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThroesTest {
	public static void main(String[] args) {
		try {
			method1(7);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	public static void method1(int n) {
		method2(n);
	}
	
	public static void method2(int n) throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력: ");
		int value = sc.nextInt(); //inputmismatchException발생
		int result = n/value;//ArithmeticException발생
		System.out.println("result: "+ result);
		
	}
}
