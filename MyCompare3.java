import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Animal {
	String name;
	int legs;
	public Animal(String Aname, int Alegs) {
		name = Aname;
		legs = Alegs;
	}
	public int getLegs(){
		return this.legs;
	}
	public String toString(){
		return this.name;
	}
}


class Dog extends Animal{
	public Dog(String name, int legs){
		super(name,legs);
	}

	public String toString(){
		return name;
	}
}




public class MyCompare3 {
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido4", 4));
		dogs.add(new Dog("Fido3", 3));
		dogs.add(new Dog("Alfie",4));
		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>() {
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}
