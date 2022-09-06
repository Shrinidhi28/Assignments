package com.sonata.day3assignment.firstQuestion;

public class UsingEmployee {

	public static void main(String[] args) {
		Manager m1 = new Manager(11212, "Manager Name", 400);
		Developer d1 = new Developer(25643, "shrinidhi", 200);
		Tester t1 = new Tester(67543, "Tester Name", 300);
		m1.display();
		d1.display();
		t1.display();
	}
}