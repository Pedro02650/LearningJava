package PrimeiroProjeto;

public class SwitchCase {
 
	public static void main(String[] args) {
		
		//  1 CASH | 2 CREDIT | 3 BOLETO
		double creditLimit = 60000;
		double accountBalance = 1000;
		double ProductPrice = 5000;
		
		int option = 2;
		
		
		switch (option) {
		
		case 1: 
			
			if ( accountBalance >= ProductPrice) {
				
				System.out.println("You have successfully purchased the product ");
			} else {
				
				System.out.println("Try a different way or reaching out with your Bank");
			}

			
			break;
		case 2:
			if ( creditLimit >= ProductPrice) {
				
				System.out.println("You have successfully purchased the product ");
			} else {
				
				System.out.println("Try a different way or reaching out with your Bank");
			}
			break;
			
		case 3:
			if ( accountBalance >= ProductPrice) {
				
				System.out.println("You have successfully purchased the product ");
			} else {
				
				System.out.println("Try a different way or reaching out with your Bank");
			}
			break;
			
			default :
				System.out.println("Invalid option");
		
		}
		
		
		
		
	}
	
}
