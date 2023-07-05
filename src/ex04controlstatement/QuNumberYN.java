package ex04controlstatement;

import java.io.IOException;

import ex01start.E02SystemOutPrintln;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {
		
		System.out.println("하나의 문자를 입력하세요");
		int inputNum = System.in.read();
		
		String a = (inputNum >=48 && inputNum <= 57) ?
		 "숫자입니다"
		 :"숫자가아닙니다";
		System.out.println(a);
		/////////////////////////////////////
		// 선생님 버전
		
		 

	}

}
