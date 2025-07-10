package test2;

public class Test02 {
	public static void main(String[] args) {
		int arr[]= {17,92,18,33,58,7,26,42};
		int maxNum = arr[0];//17 배열속 첫번쨰 숫자
		
		for(int i=0;i<8; i++) {//8개의 배열속 숫자 돌리기
			if(maxNum<arr[i]) {//maxNum = 17 arr[1]부터 비교 시작
				maxNum = arr[i];
			}
		}
		System.out.println("배열arr에서 가장 큰수 : "+maxNum);
	}
}
