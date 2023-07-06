package ex07string;

public class stringTest {

	public static void main(String[] args) {
		String str = "after like";
		char cArr[] = str.toCharArray();
		char c = cArr[4];
		System.out.println(c);
		
		String astr = new String(cArr);
		
		System.out.println(str);
		System.out.println(astr);
		
		if(str==astr) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		StringBuffer astr2 = new StringBuffer("abcd");
		
		astr2.append("ef");
		
		System.out.println(astr2);

	}

}
