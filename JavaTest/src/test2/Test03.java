package test2;

public class Test03 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+", ");
		}//정방향 출력
		
		System.out.print("\n");//다음줄
		
		for(int j=0; j<5; j++) {//역방향 만들기
			int temp=arr[j];
			arr[j]=arr[9-j];
			arr[9-j]=temp;
		}
		
		for(int n:arr) {
			System.out.print(n+", ");
		}
	}
}
