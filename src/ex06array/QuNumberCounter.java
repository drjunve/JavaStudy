package ex06array;

public class QuNumberCounter {
	public static void main(String[] args) {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for(int i=0 ; i<answer.length ; i++) {
			if(answer[i] == 1) {
				count1 += 1;
			}
			if(answer[i] == 2) {
				count2 += 1;
			}
			if(answer[i] == 3) {
				count3 += 1;
			}
			if(answer[i] == 4) {
				count4 += 1;
			}
		}
		
		/*
		해법2 : 검색한 숫자가 만약 1이라면 counter 배열의 0번 인덱스를 
		1증가시키면 되므로 아래와 같이 표현하 수 있따.
		counter[answer[i]-1]++;
		 * */
		
		System.out.println("counter[0] => "+count1);
		System.out.println("counter[1] => "+count2);
		System.out.println("counter[2] => "+count3);
		System.out.println("counter[3] => "+count4);
	}
}
