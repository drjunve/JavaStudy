package Training;

class IntNumber {
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	
	public boolean myEquals(IntNumber numObj) {
		if(this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class ex15_e04_2 {

	public static void main(String[] args) {
		String str1 = new String("Java developer");
		String str2 = "Java developer";
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(10);
		IntNumber num3 = new IntNumber(10);
		
		if(num1==num2) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.myEquals(num3)) {
			System.out.println("num1과 num3은 동일한 정수");
		}
		else {
			System.out.println("num1과 num3은 다른 정수");
		}
	}

}
