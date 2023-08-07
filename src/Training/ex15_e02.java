package Training;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ex15_e02 {

	public static void main(String[] args) {
		
		System.out.println("Long형의 최대값:"+Long.MAX_VALUE);
		System.out.println("Long형의 최소값:"+Long.MIN_VALUE);
		
		BigInteger bigValue1 = new BigInteger("10000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger subResult = bigValue1.subtract(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		BigInteger divResult = bigValue1.divide(bigValue2);
		BigInteger remResult = bigValue1.remainder(bigValue2);
		
		System.out.println("큰 수의 덧셈결과:"+addResult);
		System.out.println("큰 수의 뺄셈결과:"+subResult);
		System.out.println("큰 수의 곱셉결과:"+mulResult);
		System.out.println("큰 수의 나눗셈결과:"+divResult);
		System.out.println("큰 수의 나머지결과:"+remResult);
		
		double dbl1 = 1.6;
		double dbl2 = 0.1;
		
		System.out.println("두 실수의 덧셈결과(오차있음):" + (dbl1+dbl2));
		System.out.println("두 실수의 곱셉결과(오차있음):" + (dbl1*dbl2));
		
		BigDecimal bigDec1 = new BigDecimal("1.6");
		BigDecimal bigDec2 = new BigDecimal("0.1");
		
		System.out.println("두 실수의 덧셈결과:" + bigDec1.add(bigDec2));
		System.out.println("두 실수의 뺄셈결과:" + bigDec1.subtract(bigDec2));
		System.out.println("두 실수의 곱셈결과:" + bigDec1.multiply(bigDec2));
		System.out.println("두 실수의 나눗셈결과:" + bigDec1.divide(bigDec2));
		System.out.println("두 실수의 나머지결과:" + bigDec1.remainder(bigDec2));
		
	}

}
