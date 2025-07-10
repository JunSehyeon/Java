package sub4;

/*
 * 이름 : 전세현
 * 날짜 : 2025/07/08
 * 내용 : 자바 while 조건문 실습하기
*/

public class WhileTest {
	public static void main(String[] args) {
		//1부터 10 까지 합
		int sum = 0;
		int k = 1;
		
		while(k<=10) {
			sum+=k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 :"+sum);
		//do-while
		int tot = 0;
		int j=1;
		
		do {
			if(j%2==0) {
				tot+=j;
			}
			j++;
		}while(j<=10);
		
		System.out.println("1부터 10까지 짝수합: " + tot);
		
		//break
		int num = 1;
		
		while(true) {
			
			if(num%5==0 && num%7==0) {
				break;//반복문 탈출
			}
			num++;
		}
		
		System.out.println("5부터7의 최소공베수:"+num);
		
		//continue
		int total = 0;
		int i = 1;
		
		while(i<=10) {
			i++;
			if(i%2==1) {
				continue;
			}
			total += i;
		}
		System.out.println("1부터 10까지 짝수합 : "+total);
	}
}
