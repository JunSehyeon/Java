package test2;

public class Test01 {
	public static void main(String[] args) {
		char str[] = { 'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U' };
		
		for (int row = 1; row <= str.length; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print(str[col]);
			}
			System.out.println(); // 줄 바꿈
		}
	}
}
