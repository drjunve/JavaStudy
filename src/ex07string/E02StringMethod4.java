package ex07string;

public class E02StringMethod4 {
	/*
	시나리오] 주민등록번호를 이용하여 성별을 판단하는
	프로그램을 charAt()을 이용해서 작성하시오.
	190419-3000000 => 남자
	190419-4000000 => 여자
	*/
	/*
	시나리오] 해당 문자열이 이메일 형식인지 검사하는
	프로그램을 contains()를 이용해서 작성하시오.
	hong@daum.net => 이메일형식임
	not@naver => 이메일형식이아님
	*/
	/*
	시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
	이용해서 작성하시오.
	*/	
	/*
	시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
	작성하시오. lastindexOF()
	파일명 : my.file.images.jpg
	*/

	public static void main(String[] args) {
		
		String who1 = "190419-3000000";
		String who2 = "190419-4000000";
		
		if(who1.charAt(7)=='1' || who1.charAt(7)=='3') {
			System.out.println("who1은 남자입니다.");
		}
		if(who1.charAt(7)=='2' || who1.charAt(7)=='4') {
			System.out.println("who1은 여자입니다.");
		}
		
		if(who2.charAt(7)=='1' || who2.charAt(7)=='3') {
			System.out.println("who2는 남자입니다.");
		}
		if(who2.charAt(7)=='2' || who2.charAt(7)=='4') {
			System.out.println("who2는 여자입니다.");
		}
		
		/////////////////////////////////////
		
		String email1 = "hong@daum.net";
		String email2 = "hong@naver";
		
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("email1은 이메일 형식이 맞습니다.");
		}
		else {
			System.out.println("email1은 이메일 형식이 아닙니다.");
		}
		
		if(email2.contains("@") && email2.contains(".")) {
			System.out.println("email2은 이메일 형식이 맞습니다.");
		}
		else {
			System.out.println("email2은 이메일 형식이 아닙니다.");
		}
		
		////////////////////////////////////////
		
		if(who1.indexOf("1")==7 || who1.indexOf("3")==7) {
			System.out.println("who1은 남자입니다.");
		}
		
		if(who1.indexOf("2")==7 || who1.indexOf("4")==7) {
			System.out.println("who1은 여자입니다.");
		}
		
		if(who2.lastIndexOf("1")==7 || who2.lastIndexOf("3")==7) {
			System.out.println("who2는 남자입니다.");
		}
		
		if(who2.lastIndexOf("2")==7 || who2.lastIndexOf("4")==7) {
			System.out.println("who2는 여자입니다.");
		}
		
		//////////////////////////////////
		
		
		
	}

}

































