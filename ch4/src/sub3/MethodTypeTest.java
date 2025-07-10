package sub3;

/*
 * 이름 : 전세현
 * 날짜 : 2025/07/09
*/

public class MethodTypeTest {
	public static void main(String[] args) {
		double y1= type1(2.5);
		double y2= type1(3.2);
		double y3= type1(4.0);
		
		System.out.println("y1:"+y1);
		System.out.println("y2:"+y2);
		System.out.println("y3:"+y3);
		
		//반환값이 없기 때문에 함수호출 앞에 대입 연산자 없음
		type2(true);
		type2(false);
		type2(2>3);
		
		//매개변수 있고 반환값 없음
		boolean result = type3();
		System.out.println("result:"+result);
		
		//매개면수 없고 반환값 없음
		type4();
		
		
	}
	
	//type1 : 매개변수 o, 반환값 o
	public static double type1(double r) {
		double y=r*r+Math.PI;
		return y;
		
	}
	//type2 : 매개변수 o, 반환값 x
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참입니다");
		}else {
			System.out.println("거짓 입니다");
		}
	}
	//type3 : 매개변수 x, 반환값 o
	public static boolean type3() {
		int num1 = 1;
        int num2 = 2;
        
        if(num1>num2) {
        	return true;
        }else {
        	return false;
        }
	}   
	//type4 : 매개변수 x, 반환값 x
	public static void type4() {
		double result = type1(5);
		System.out.println("반지름 5인 원의 넓이 : "+result);
	}
}
