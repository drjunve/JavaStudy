package ex07string;

/*
StringBuffer 클래스
: String 클래스는 기존 문자열에 새로운 문자열을 추가하면 새롭게 생성된 메모리에
문자열을 저장한다. 기존 메모리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기위해,
문자열의 변경이 많은 경우에는 StringBuffer 클래스를 사용하는 것이 좋다. 해당
클래스는 기존 메모리의 문자열을 변경하는 방식으로 추가한다.
 */
public class E03StringBuilderBufferTr {

	public static void main(String[] args) {

		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strBuf="+ strBuf);
		
		strBuf.insert(2,  false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf="+strBuf);
		
		System.out.println("String과 StringBuffer의 "+"참조값 비교");
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		if(str1==str2) {
			System.out.println("연결전:주소값동일");
		}
		else {
			System.out.println("연결전:주소값다름");
		}
		
		str1 = str1 + "&Spring";
		if(str1==str2) {
			System.out.println("연결후:주소값동일");
		}
		else {
			System.out.println("연결후:주소값다름");
		}
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf="+buf);
		System.out.println("저장된 문장열크기:"+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append("Java 공부중..");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append("금일은 StringBuffer 학습중..!!");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
	}
}















