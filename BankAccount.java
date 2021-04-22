

public class BankAccount {

	public static void main(String[] args) {
		
		String fName = "", mI = "", lName = "", street = "", apt = "", city = "", state = "", zip = "", acctNum = "";
		double startBal = 0.0, transAmt = 0.0, endBal = 0.0;
		char acctType = ' ', transType = ' ';
		float intRate = 0.0f;
		boolean posBal = false;
		
		fName = "Aniel";
		mI = "I";
		lName = "Alvarado";
		acctType = 'A';
		street = "374 E. Blackwell";
		apt = "374";
		city = "Dover";
		state = "NJ";
		zip = "07801";
		startBal = 25.00;
		transAmt = 15.00;
		transType = 'D';
		endBal = startBal + transAmt;
		intRate = 0.01f;
		posBal = true;
		
		System.out.print("*************************************************************\n");
		System.out.print("*          Welcome to my Bank account Aplication            *\n");
		System.out.print("*                Written by : Aniel Alvarado                *\n");
		System.out.print("*************************************************************\n");
		
		System.out.print("Account Owner: " + fName + " " + mI + " " + lName + "\n\n");
		
		System.out.print("Account Type: " + acctType + "\n");
		System.out.print("Account Number: " + acctNum + "\n\n");
		
		System.out.print("customer address: ");
		System.out.println(street);
		System.out.println(apt);
		System.out.println(city + ", " + state + " " + zip + "\n");
		
		System.out.printf("Starting Account Balance: $%.2f\n", startBal);
		System.out.println("Transaction Type: " + transType);
		System.out.printf("Transaction Amount: $%.2f\n", transAmt);
		System.out.printf("Ending Account Balance: $%.2f\n\n");
		
		System.out.printf("Since it is %s that we have a positive balance of $%.2f,\n", posBal, endBal);
		System.out.println("we can assume we will earn interest on this balance at a rate of " + intRate);
		System.out.printf("If the balance never changes over the next year, we will earn $%.2f\n\n", (endBal * intRate));
		
		System.out.print("*****************************************************************\n");
		System.out.print("*           Thank you for using my Bank Account Aplication      *\n");
		System.out.print("*                 This aplication will now terminate            *\n");
		System.out.print("*****************************************************************\n");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
