package ex05Method;

public class QuFindPrimeNumber {

	static boolean QuFindPrimeNumber() {

		for(int pnum = 2 ; pnum<=100 ; pnum++) {
			
			int chnum = 0;
			
			for(int num=1 ; num<=(pnum-1) ; num++) {
				
				if(!(pnum%num==0)) {
					chnum += 1;
				}
			}
			if(chnum == (pnum-2)) {
				System.out.println(pnum);
			}
			else {
			}
			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		QuFindPrimeNumber();
	}

}
