
import java.util.Scanner;

public class SellBeer {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		boolean hasId = false, proves21 = false, hasBalance = true;
		double price = 0.0, subtotal = 0.0, salesTax = 0.0, grandTotal = 0.0, amtTendered = 0.0, balance = 0.0;
	    amtTendered = 0.0, balance = 0.0;
	    int quantity = 0;
	    final float NJ_TAX_RATE = 0.07;
	
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("************************************************************");
		System.out.println("*            Welcome to the sell Beer Aplication           *");
		System.out.println("*                Written by: Aniel Alvarado                *");
		System.out.println("*                 Date Written: 09/30/2020                 *");
		System.out.println("************************************************************");
		
		System.out.print("Do you have ID? (true or false)");
		hasId = keyboard.nextBoolean();
		

		// CREATING BINARY DECISION STRUCTURE TO EVALUATE HASID
		if (hasId)
		{
		
			//establishes true path
			System.out.print("Does ID Prove >= 21? (true or false)");
			proves21 = keyboard.nextBoolean();
		
			if (proves21)
			{
				System.out.println("Hand ID back to the customer");
				
				System.out.print("Enter price: $");
				price = keyboard.nextDouble();
				
				System.out.print("Enter Quantaty(Whole numbers only): ");
				quantity = keyboard.nextInt();
				
				subtotal = price * quantity;
				salesTax = subtotal *  salesTax;
				grandTotal = subtotal + salesTax; 
				
				System.out.println("\nSubtotal: $" + subtotal + "\nSales Tax: $" + salesTax + "\nGrand Total: $" + grandTotal);
				balance = grandTotal;
				
				do
				{
					System.out.print("Enter Amount Tendere: $");
					amtTendered = keyboard.nextDouble();
					
					balance = grandTotal - amtTendered;
					
					System.out.println("Blance Remaining: $" + balance);
					
				}//end of loop body
				
				while(balance > 0);
				
				if(balance < 0)
				{
					//true path body
					System.out.println("Change due: $" + (balance * -1));
					
					System.out.println("\nGive the change Due to tyhe Customer!");
				}//end true path change due and entire selection structure
					

				System.out.println("Give the Beer to the customer!");
				
				System.out.println("Thank the Customer for their Purchase!");
				
				
			}//ends nested true path proves21
			else
			{
				System.out.print("You may not purchase beer until you are 21 or older.\n");
				
				System.out.println("Hand ID back to the customer");
				
				
				
			}//ends nested false path and entire nested proves21 selection structure
			
				
		}// ends true path hasId
		else
		{
			// establishes false path
		}//ends false path and entire hasId decision structure
		
		// TODO Auto-generated method stub

	}//ends main method

}//ends sellBeer 
