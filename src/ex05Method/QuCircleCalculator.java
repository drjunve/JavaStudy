package ex05Method;

import java.util.Scanner;

public class QuCircleCalculator {

	static double ban() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요");
		double ban = scanner.nextDouble();
		
		return ban;
	}
	
	static double circleArea(double ban) {
		double area = 3.14 * ban * ban;
		return area;
	}
	
	static double circleRound(double ban) {
		double round = 2 * 3.14 * ban;
		return round;
	}
	
	static double circleArea2(double ban) {
		double area2 = 3.14 * ban * ban;
		return area2;
	}
	
	static double circleRound2(double ban) {
		double round2 = 2 * 3.14 * ban;
		return round2;
	}
	
	public static void main(String[] args) {
		
		double banjirum = ban();
		double area = circleArea(banjirum);
		double round = circleRound(banjirum);
		
		System.out.println("원의 둘레("+banjirum+") :"+round);
		System.out.println("원의 넓이("+banjirum+") :"+area);
		
		double area2 = circleArea2(5.5);
		double round2 = circleRound2(5.5);
		
		System.out.println("파라메타 원의둘레(5.5) :"+round2);
		System.out.println("파라메타 원의넓이(5.5) :"+area2);
		
	}

}
