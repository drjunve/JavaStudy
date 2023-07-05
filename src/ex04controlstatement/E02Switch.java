package ex04controlstatement;

import java.util.Scanner;

import ex01start.E02SystemOutPrintln;

/*
switch문
: if문처럼 조건에 따라 분기하는 제어문으로, 정수식의 값과 동일한 부분을 찾아
실행하는 형태를  가지고 있다.
형식]
	switch(산술식 혹은 정수식){
	case 값1:
		실행문; break;
	case 값2:
		실행문; break;
	default:
		위에서 값이 매칭되지 않을 때 실행되는 문장으로 else와 같은 의미로 사용된다.
		
	※ switch문 내부에서 break문을 만나게되면 실행이 중지되고 밖으로 탈출하게된다.
	※ 만약 break문이 없으면 그 아래의 모든 실행문이 실행되게된다.
 */

public class E02Switch {

	public static void main(String[] args) {
		/*
		Scanner클래스
		: 사용자로부터 입력값을 받기위한 클래스로, 해당 클래스의 메서드가
		실행되면 잠깐 실행이 중지되고 입력을 기다린다.
		nextLine() : 문자열을 입력받는다.
		nextInt() : 정수를 입력받는다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는:"+iNum);
		
		//정수를 3으로 나누면 나머지는 0,1,2만 생성된다.
		int remain = iNum % 3;
		switch (remain) {
		case 0:
			System.out.println("나머지는 0입니다.");
			break;
		case 1:
			System.out.println("나머지는 1입니다.");
			break;
		default:
			System.out.println("나머지는 2입니다.");
		}
		/*
		switch문 사용시 주의사항
		-long타입의 변수는 사용할 수 없다.
		-byte, short, int, char, String만 사용할 수 있다.
		-논리식, 조건식을 사용할 수 없다.
		 */
		long ln = 100;
		//long타입의 변수는 사용할 수 없으므로 에러발생
//		switch(ln) {
//		case 100:
//			System.out.println("long타입 사용??");
//		default:
//			System.out.println("안되는군!");
//		}
		//조건식은 사용할 수 없으므로 에러발생.
//		switch(iNum%3==0) {
//			System.out.print("논리식도 안되는군~");
//		}
		
		//문자열이나 문자는 사용할 수 있다.
		String title = "자바";
		switch(title) {
		case "자바": System.out.println("자바 좋아");
			break;
		case "JAVA": System.out.println("JAVA Gooood");
			break;
		}
		
		/*
		여러 case를 동시에 처리할 때는 break문 없이 case를 나열하면 된다.
		if문에서 ||(논리 OR)를 사용하는 것과 같다.
		 */
		int season = 8;
		switch(season) {
		//=> if(season==3 || season==4 || ...)
		case 3:case 4:case 5:
			System.out.println("봄입니다.");
			break;
		case 6:case 7:case 8:case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11:case 12:case 1:case 2:
			System.out.println("겨울입니다.");
			break;
		}
		
		/*
		시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는 프로그램을
		작성하시오. 90점 이상은 A학점... 60점 미만은 F학점을 출력하면 된다.
		단, switch문으로 작성하시오. f, 60이상d, 70이상c 80이상b 90이상a
		 */
		//정수타입으로 점수를 할당한다. 
		int kor=99, eng=70, math=64;
		System.out.println("avg"+"="+(kor+eng+math)/3);
		switch((kor+eng+math)/3) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
		case 41:
		case 42:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
			System.out.println("f학점. 학사경고");
			break;
		case 60:
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
			System.out.println("d학점");
			break;
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
			System.out.println("c학점");
			break;
		case 80:
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
			System.out.println("b학점");
			break;
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			System.out.println("a학점");
			break;
		}
		
		/* Java에서는 switch문에 조건식을 사용할 수 없으므로 평균점수의
		구간을 아래와 같이 10으로 나눈 몫을 통해 구해야한다.
		 */
		int avg = (kor+eng+math) / (3*10);
		System.out.println("avg="+avg);
		switch(avg) {
		case 10:case 9:
			System.out.println("A학점"); break;
		case 8:
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		case 6:
			System.out.println("D학점"); break;
		default:
			System.out.println("F학점"); break;
		}
		}
	}

