package ex06array;

public class QuArray1To10 {
	public static void main(String[] args) {
		int[] number = new int[10];
		int sum=0;
		
		for(int i=0 ; i<number.length ; i++) {
			number[i] = i+1;
		}
		
		System.out.println("초기화된 배열 요소");
		
		for(int i=0 ; i<number.length ; i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.print("\n배열전체요소의합:");
		for(int i=0 ; i<number.length ; i++) {
			sum += number[i];
		}
		System.out.print(sum);
	}
}
