package Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice {
	
	public static void main(String[] args) {
	
	List<Person> people = Arrays.asList(
		new Person("Ajay", "MALE", 23),
		new Person("Vijaya", "FEMALE", 24),
		new Person("Mohit", "MALE", 24),
		new Person("Ketan", "MALE", 25),
		new Person("Aastha", "FEMALE", 24)
	);
	
	//Using basic Java7 features
	
//	//Sort List by name
//	Collections.sort(people, new Comparator<Person>() {
//
//		@Override
//		public int compare(Person p1, Person p2) {
//			return p1.getName().compareTo(p2.getName());
//		}
//	});
//		
//	//Print all the persons in the list
//	for(Person person : people) {
//		System.out.println(person );
//	}
//	
//	//Print all the person whose name starts with A
//		for(Person person : people) {
////			if(person.getName().charAt(0) == 'A') {
//			if(person.getName().startsWith("A")) {
//				System.out.println(person);
//			}
//		}
	
	
	//Using Lambdas
	
	//Sort all the names
	//Since Comparator is a functional interface we can make use of lambdas to solve this problem
	Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
	
	
	//Print all the persons in the list
	for(Person person : people) {
		System.out.println(person);
	}
		
	
	}
	
}
