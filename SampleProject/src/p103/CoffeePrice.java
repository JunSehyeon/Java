package p103;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("무슨 커피 드릴까요?");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500; break;
		case "아메리카노":
			price = 2000; break;
		default: System.out.println("메뉴가 없습니다");	
		}
		if(price!=0) System.out.print(order+"는"+price+"원입니다");
		sc.close();
	}
}
