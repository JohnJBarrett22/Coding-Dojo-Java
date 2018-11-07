package com.codingdojo.java.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Doo Be Doo Be Doo!");
		IPhone iPhoneX = new IPhone("X", 100, "T-Mobile", "Ring ring ring!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneX.displayInfo();
		System.out.println(iPhoneX.ring());
		System.out.println(iPhoneX.unlock());
	}

}
