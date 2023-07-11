package ex12inheritance;

public class AnimalDog extends Animal {
	public AnimalDog(String species, int age, String gender, String dogKind, String name) {
		super(species, age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}
	public String dogKind;
	public String name;
	void bark() {
		System.out.println
		("이름이 "+name+"이고, 종("+getSpecies()+")이 "+dogKind+"인 강아지가 짖는다.");
		
	}
	void showDog() {
		showAnimal();
		System.out.println("종: "+dogKind);
		System.out.println("이름: "+name);
		
	}
}
