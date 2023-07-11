package ex12inheritance;

//친구의 정보를 저장할 기본클래스
class MyFriendInfoT{
	private String name;
	int age;
	
	public MyFriendInfoT(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showMyFriendInfoT() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfoT extends MyFriendInfoT
{
	private String addr;
  	private String phone;
  	//생성자 메서드 정의
  	public MyFriendDetailInfoT(String name, int age, String addr, String phone) {
  		
  		super(name, age);
  		this.addr = addr;
  		this.phone = phone;
  		
  	}
  	
	public void showMyFriendDetailInfoT(){
		showMyFriendInfoT();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfoT {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		//정보Print
		MyFriendDetailInfoT fDInfo = 
				new MyFriendDetailInfoT
				("이순신", 100, "성균관", "010-1000-8888");
		fDInfo.showMyFriendDetailInfoT();
		
	}
}
