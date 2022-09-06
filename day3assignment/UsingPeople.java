package com.sonata.day3assignment;

public class UsingPeople {

	public static void main(String[] args) {
		
		//Technical Employee Instance
		TechnicalEmployee t1 = new TechnicalEmployee(22847, "shrinidhi", "JAVA", 20000, 4);
		Address tAdd = new Address(10, "NR COLONY", "Bengaluru", 560004);
		t1.address = tAdd;
		
		//Staff
		Staff s1 = new Staff(25643, "Staff Name", "Staff Title", 12000, 2);
		Address sAdd = new Address(10, "HSR Layout", "Bengaluru", 560076);
		s1.address = sAdd;
		
		//Display all details
		System.out.println(t1);
		System.out.println("\n\n" + s1);
	}
}