package PrimeiroProjeto;

public class UsingWhile {

	public static void main(String[] args) {

		int referenc = 1;
		int destiny = 10;
		
		
		/*while (referenc < destiny) {
			
			System.out.println(referenc);
			referenc += 1;
			System.out.println(referenc);
			
		}
		*/
		
		while (referenc < destiny) {
			destiny -= 1;
			System.out.println(destiny);
		}
		
	}

}
