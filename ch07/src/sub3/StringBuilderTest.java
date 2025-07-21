package sub3;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		//string의 불변성
		String str = "java";
		System.out.println("str adress:"+ System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str adress:"+System.identityHashCode(str));
		
		System.out.println(str);
		
		//빈번한 문자열 변경을 위한 StringBuilder
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("sb sdress:"+System.identityHashCode(sb));
		
		sb.append("Programming");
		
		
	}
}
