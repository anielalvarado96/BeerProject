import java.util.Scanner;


public class MathExample {

	public static void main(String[] args) {
		String name = "";
		int age = 0;
		float number = 0.0f;
		float parentAge = 0.0f;
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name = Keyboard.nextLine();
		
		System.out.print("Please enter your age: ");
		age = Keyboard.nextInt();
		 
		System.out.print("Please enter a number between 0.5 and 2.0: ");
		number = Keyboard.nextFloat();
		
		parentAge = age * number;
		
		System.out.println("\n\nYou have told me your name is " + name);
		System.out.println("\n\nYou have provided me the following number " + number);
		System.out.println("\n\nYou have told me your age is " + age);
		System.out.println("\n\nI didn't tell you what I would use the number for, but I have decided to use it to calculate a guess on your parent's approximate age.");
		System.out.println("\n\nI am guessing your parent's age is approximately " + parentAge + "! Was my guess even remotely close? ");
		System.out.println("\n\nThat was a rhetorical question! I don't really care if my guess was correct or not. I am a computer, and I don't even know you. :-)\n");
		System.out.println("This program will now demostrate what will happen to the residual data on the input buffer if you try to imput a string . \n\n ");
		
		String street;
		String city;
		String state;
		String zip;
		
		System.out.print("Enter your street address: ");
		street = Keyboard.nextLine();
		System.out.print("Enter your city: ");
		city = Keyboard.nextLine();
		System.out.print("Enter your state: ");
		state = Keyboard.nextLine();
		System.out.print("Enter your zip: ");
		zip = Keyboard.nextLine();
		
		System.out.println("\n\nDid you even get the chance to enter your street address? I bet you didn't. That's because there was residual data on the input buffer in the form of two enter characters fromn the two prior numbers you entered.\n\nAfter collecting non-string data, the input buffer must be flushed prior to collecting anymore string data. \n\nWe will do that now. ");
		Keyboard.nextLine();
		
		System.out.print("Enter your street address: ");
		street = Keyboard.nextLine();
		System.out.print("Enter your city: ");
		city = Keyboard.nextLine();
		System.out.print("Enter your state: ");
		state = Keyboard.nextLine();
		System.out.print("Enter your zip: ");
		zip = Keyboard.nextLine();
		
		System.out.print("\n" + street + "\n" + city + ", " + state + "  " + zip + "\n\n");
		
		
		

		// TODO Auto-generated method stub

	}

}
