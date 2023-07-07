package ex08class;

public class CalculatorEx {

	double num1;
	double num2;
	double result;
	int adcount;
	int micount;
	int mucount;
	int dicount;
	
	void init() {
		int result = 0;
	}
	
	double add(double num1, double num2) {
		adcount += 1;
		return result = num1+num2;
	}
	
	double min(double num1, double num2) {
		micount += 1;
		return result = num1 - num2;
	}
	
	double mul(double num1, double num2) {
		mucount += 1;
		return result = num1*num2;
	}
	
	double div(double num1, double num2) {
		dicount += 1;
		return result = num1/num2;
	}
	
	void showOpCount() {
		System.out.println("덧셈횟수 : "+adcount);
		System.out.println("뺄셈횟수 : "+micount);
		System.out.println("곱셈횟수 : "+mucount);
		System.out.println("나눗셈횟수 : "+dicount);
	}
 
	public static void main(String[] args) {

	}

}
