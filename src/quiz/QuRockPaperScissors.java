package quiz;

import java.util.Scanner;

public class QuRockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputRPS = scanner.nextInt();
		System.out.println(
			"무엇을 내겠습니까?(1:가위, 2:바위, 3:보) :"+inputRPS
		);
		
	}

}
