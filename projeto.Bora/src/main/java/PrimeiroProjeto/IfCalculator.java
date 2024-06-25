package PrimeiroProjeto;

public class IfCalculator {

	 public int soma(int a, int b) {
	        return a + b;
	    }
	
	public static void main(String[] args) {
		
		int numbA =1;
		int numbB= 2;
	
		IfCalculator calc = new IfCalculator();
		int result = calc.soma(numbA, numbB);
		System.out.println(result);
	}
}
