package myFirstProject;

import java.util.Scanner;

public class FirstEcplipse {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		byte questions, correct;
		float incorrect;
	
		System.out.println("How many questions are in the test?");
		questions = input.nextByte();
		
		System.out.println ("Hoy many correct do you have?");
		correct = input.nextByte();
		
		System.out.println("How many incorrect do you have?");
		incorrect = input.nextByte();
		
		
		System.out.println("Your mark is " + ((correct-(0.5*incorrect))*10)/questions);
		
		
		
	}

}
