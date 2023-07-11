package ex12inheritance;

public class Animal {

	private String species;
	public int age;
	public String gender;
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public void showAnimal() {
		System.out.println("종족: "+species);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
	}
	
	protected String getSpecies() {
		return species;
	}

}
