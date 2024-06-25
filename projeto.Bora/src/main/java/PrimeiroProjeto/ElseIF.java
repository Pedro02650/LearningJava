package PrimeiroProjeto;

public class ElseIF {

	public static void main(String[] args) {
		
		
		boolean cash = false;
		boolean credit = false;
		boolean boleto = true ;
		double price = 10000;
		
		
		if (cash) {
			// If you decided pay with money  "cash" you will gain 15% off
			double off = 10000 - (price * 0.15);
			System.out.println("The price with cash is " + off);
			
			}else if (credit) {
				double taxes = 10000 + (price * 0.10);
				System.out.println("The full price is "+ taxes);
			
				}else if (boleto) {
						double off = 10000 - (price * 0.05);
						System.out.println("The price with cash is " + off);
			
		}
		
		
		
	}
	
}
