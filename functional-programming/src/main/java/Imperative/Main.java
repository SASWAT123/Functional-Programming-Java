package Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Person> persons = List.of(
				new Person("Ajay", Gender.MALE),
				new Person("Manoj", Gender.MALE),
				new Person("Aastha", Gender.FEMALE),
				new Person("Gopalika", Gender.FEMALE),
				new Person("Pratyusha", Gender.FEMALE),
				new Person("Arpit", Gender.MALE),
				new Person("Ketan", Gender.MALE),
				new Person("Shivam", Gender.MALE),
				new Person("Divya", Gender.FEMALE),
				new Person("Saswat", Gender.MALE)
		);
		
		//Imperative Programming
		List<Person> females = new ArrayList();
		
		for(Person person : persons) {
			if(Gender.FEMALE.equals(person.getGender())) {
				females.add(person);
			}
		}
		
		for(Person female : females) {
			System.out.println(female);
		}
		
		//Declarative approach
		persons.stream()
			.filter(person -> Gender.FEMALE.equals(person.getGender()))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		

	}

}
