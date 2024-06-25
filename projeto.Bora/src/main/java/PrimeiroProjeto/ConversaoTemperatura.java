package PrimeiroProjeto;

import java.util.Scanner;

public class ConversaoTemperatura {
	
	
		static double result;
	
		public static void main(String[] args) {
	
			ConversaoTemp calc = new ConversaoTemp();
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			double F;
			
			System.out.println("Digite a temperatura em fahrenheit: ");
			F = keyboard.nextDouble();
			result = calc.conversaoFC(F);
			System.out.println(result);
			
			
			
			
		}
	
	}
