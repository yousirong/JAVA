package step10_java10.review3;

import java.util.ArrayList;

import java.util.List;

public class AnimalManager extends Animal {
	//private ArrayList<Animal> ArrayList<>();
	
	List<Animal> animalList = new ArrayList<>();
	
	public void add(String animalType, String name) {
		if(animalType.equals("소"))
		{
			Cow cow = new Cow(name);
			animalList.add(cow);
		}
		else if (animalType.equals("참새"))
		{
			Sparrow sparrow = new Sparrow(name);
			animalList.add(sparrow);
		}
	}
	
	public void delete(String name) {
		System.out.println("_________________");
		for(int idx = 0; idx < animalList.size(); idx++) {
			if(animalList.get(idx).getName().equals(name)) {
				animalList.remove(idx);
				System.out.println(name+"는 삭제되었습니다.");
			}
		}
	}
	
	public void printAll(){
		System.out.println("_________________");
		for(Animal animal : animalList) {
			
			if(animal instanceof Cow) {
				((Cow) animal).run();
				((Cow) animal).sound();
			}
			else if(animal instanceof Sparrow)
			{
				((Sparrow)animal).run();
				((Sparrow)animal).sound();
			}
		}
	}
	
	
	
	
}
