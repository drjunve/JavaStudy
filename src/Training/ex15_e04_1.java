package Training;

class myFriends extends Object {
	String myName;
	public myFriends(String name) {
		myName = name;
	}
	@Override
	public String toString() {
		return "이름:"+myName;
	}
}

class yourFriends extends Object {
	String myName;
	public yourFriends(String name) {
		myName = name;
	}
}
public class ex15_e04_1 {

	public static void main(String[] args) {
		myFriends fnd1 = new myFriends("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
	}
	
	
}
