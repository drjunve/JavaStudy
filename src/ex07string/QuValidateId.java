package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String id = scanner.nextLine();
		
		/* 만약 String을 Javascript처럼 배열처럼 만들고 싶다면
		 * toCharArray() 메서드를 사용하면 된다. 해당 메서드는
		 * String을 char타입의 배열로 변환해준다. */
		char[] charArray = id.toCharArray();
		for(int i=0 ; i<charArray.length ; i++) {
			System.out.println(charArray[i]+"-");
		}
		
		boolean isOk = ValidateId(id);
		
		
		if(isOk==true) {
			System.out.println("사용 가능한 ID입니다.");
		}
		else {
			System.out.println("사용 불가능한 ID입니다.");
		}
		
	}
	
	static boolean ValidateId(String id) {
		
		boolean idOk = true;
		
		if(id.length()>=8 && id.length()<=12) {
			idOk = true;
		}
		else {
			System.out.println("아이디는 8~12자 사이로만 사용할 수 있다.");
			idOk = false;
		}
		
		for(int i=0 ; i<id.length(); i++) {
			if(!(id.charAt(i) >= 'a' && id.charAt(i)<='z') &&
				!(id.charAt(i) >= 'A' && id.charAt(i)<='Z') &&
				!(id.charAt(i) >= '0' && id.charAt(i)<='9')) {
				idOk =false;
				System.out.println("아이디는 영문과 숫자로만 입력할 수 있다.");
				break;
			}
			
		}
		
		return idOk;
		
	}

}
