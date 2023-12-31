package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] tenArr1 = new int[10];
		int[] tenArr2 = new int[10];
		
		int oddStartNum = 0;
		int evenStartNum = tenArr2.length-1;
		
		for(int i=0 ; i<tenArr1.length ; i++) {
			//정수를 입력받는다.
			System.out.print((i+1)+"번째 정수를 입력하세요:");
			int num = scanner.nextInt();
			
			//입력 받은 정수를 첫번째 배열에 삽입한다.
			tenArr1[i] = num;
			
			//입력 받은 정수가 홀수라면 두번재 배열 앞부분 부터 삽입한다.
			if(!(num%2==0)) {
				tenArr2[oddStartNum] = num;
				oddStartNum++;
			}
			
			//입력 받은 정수가 짝수라면 두번재 배열 뒷부분 부터 삽입한다.
			if (num%2==0) {
				tenArr2[evenStartNum] = num;
				evenStartNum--;
			}
		}
		
		System.out.println("순서대로입력된결과");
		for(int i=0 ; i<tenArr1.length ; i++) {
			System.out.print(tenArr1[i]+" ");
		}
		
		System.out.println("\n홀수/짝수 구분입력결과");
		for(int i=0 ; i<tenArr2.length ; i++) {
			System.out.print(tenArr2[i]+" ");
		}
		
	}

}
