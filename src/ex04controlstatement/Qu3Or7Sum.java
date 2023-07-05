package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num<=100) {
			if(num%3==0 || num%7==0 && !(num%(3*7)==0)) {
				sum += num;
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
		System.out.println("합:"+sum);
	}
}
