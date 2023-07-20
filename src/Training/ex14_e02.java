package Training;

class Singer {
	String name;
	public Singer(String name) {
		this.name = name;
	}
	//Object클래스의 toString메소드를 오버라이딩
	@Override
	//toString은 객체가 가진 정보를 스트링타입으로 변환하여 반환한다.
	public String toString() {
		return "이름:"+name;
	}
}

class GirlGroup extends Singer {
	String team;
	//protected : 부모나 자식 클래스만 접근할 수 있는 클래스
	protected GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}
	@Override
	public String toString() {
		return super.toString()+", 팀명:"+team;
	}
}

interface ISinger {
	public void dancing();
}

public class ex14_e02 {

	public static void main(String[] args) {
		
		Singer s1 = new Singer("조용필");
		System.out.println(s1);
		
		Singer s2 = new GirlGroup("츄", "이달의소녀");
		System.out.println(s2);
		
		/*익명클래스 출현. new를 통해 인스턴스를 생성하고, {}를 붙인 뒤,
			중괄호 안에 클래스의 내용을 작성하면, 중괄호 안은 이름이 없는
			익명클래스가 된다. 익명클래스는 오버라이딩은 가능하지만, 
			이름이 없어서 다른 클래스가 접근할 수도 없고,
			참조변수 활용을 위한 다운캐스팅도 불가능하다. */ 
		Singer s3 = new GirlGroup("아이린", "레드벨벳") {
			boolean mic = true;
			@Override
			public String toString() {
				return super.toString()+", 소속사:SM";
			}
		};
		System.out.println(s3);
		
		ISinger s4 = new ISinger() {
			@Override
			public void dancing() {
				System.out.println("춤추는게 좋아요~~");
			}
		};
		s4.dancing();
	}

}
