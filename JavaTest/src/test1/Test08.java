package test1;

public class Test08 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i = 0; i<n ; i++) {//n=5 i=0,1,2,3,4
			for(int j=n-1 ;j>i;j--) {//j=4,3,2,1,0
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1; j++) {//j=0,1,2,3,4
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
