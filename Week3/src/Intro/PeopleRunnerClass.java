package Intro;

import java.util.ArrayList;

public class PeopleRunnerClass {
	public static void main(String[] args) {
		
		
		Person hash = new Person("Hashim Ali", 21, "IT Consultant");
		Person abdi = new Person("Abdi", 24, "IT Consultant");
		
		/*
		System.out.println(hash.name);
		hash.getAge();
		System.out.println(hash.jobTitle);
		
		System.out.println("My colleague is: " + abdi.name + " and I am : " + hash.name);
		*/
		
		//hash.toString();
		//abdi.toString();
		
		ArrayList<Object> people = new ArrayList<>();
		people.add(hash);
		people.add(abdi);
		
		/*
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		*/
		//findPerson("Abdi", people);
		
		System.out.println(abdi.getClass().getCanonicalName());
	}
	
	public static void findPerson(String name, ArrayList<Object> array) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).toString().contains(name)) {
				System.out.println("Person Found: ");
				System.out.println(array.get(i));
			}
		}
	}
	
}