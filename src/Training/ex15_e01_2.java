package Training;

public class ex15_e01_2 {

	public static void main(String[] args) {
		//필드
		String strNumber = "1000";
		
		//함수
		//변수에 10을 더하여 출력
		System.out.println("10+strNumber="+(10+strNumber));
		//변수를 정수로 변환한 뒤(Integer클래스의 
		System.out.println("10+strNumber를 숫자로 변경(parseInt사용):"
				+(10+Integer.parseInt(strNumber)));
		System.out.println("10+strNumber를 숫자로 변경(valueOf사용):"
				+(10+Integer.valueOf(strNumber)));
		
		String floatString = "3.14";
		System.out.println("실수형(float)형으로 변경:"+Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경:"+Double.parseDouble(floatString));
		System.out.println("밸류오브"+Double.valueOf(floatString));
		
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD",3));
		
		System.out.println("isDigit()를 통한 숫자 판단");
		System.out.println(Character.isDigit('A')?"숫자임":"숫자아님");
		System.out.println(Character.isDigit(50)?"숫자임":"숫자아님");
		System.out.println(Character.isDigit('7')?"숫자임":"숫자아님");
		
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCaseCa));
	}
}
