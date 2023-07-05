package ex05Method;

import java.util.Scanner;

public class QuTemperature {

	static double inputce() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력하시면, 화씨 온도로 바꿔드립니다.");
		double ce = scanner.nextInt();
		double cetofa = 1.8 * ce + 32;
		return cetofa;
	}
	
	static double inputfa() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하시면, 섭씨 온도로 바꿔드립니다.");
		double fa = scanner.nextInt();
		double fatoce = (fa-32)/1.8;
		return fatoce;
	}
	
	
	public static void main(String[] args) {

		double fahrenheit = inputce();
		double celsius = inputfa();

		System.out.printf
		("입력하신 섭씨 온도는 화씨 온도로 %.3f℉ 입니다.",fahrenheit);
		
		System.out.println();
		
		System.out.printf
		("입력하신 화씨 온도는 섭씨 온도로 %.3f ℃ 입니다.",celsius);
		
	}

}
