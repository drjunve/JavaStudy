package ex05Method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static int[] arithmetic() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력받아 사칙연산의 결과를 출력합니다.");
		
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = scanner.nextInt();
		
		System.out.println("두번재 정수를 입력하세요");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		int dif = num1 - num2;
		int pro = num1 * num2;
		int quo = num1 / num2;
		int rem = num1 % num2;
		
		int cal[] = {sum,dif,pro,quo,rem};
		
		return cal;
	}
	
	public static void main(String[] args) {
		int cal[] = arithmetic();
		System.out.println("덧셈결과->"+cal[0]);
		System.out.println("뺄셈결과->"+cal[1]);
		System.out.println("곱셈결과->"+cal[2]);
		System.out.println("나눗셈 몫->"+cal[3]);
		System.out.println("나눗셈 나머지->"+cal[4]);
	}

}
