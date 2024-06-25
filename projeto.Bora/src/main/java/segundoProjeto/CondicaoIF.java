package segundoProjeto;

public class CondicaoIF {
	public static void main(String[] args) {
		
		System.out.println("***********************");
		System.out.println("Auto Escola");
		System.out.println("***********************");
		
		int idadeCliente = 17;
		int idadeMin = 18;
		int idadeMAX = 80;
		
		if(idadeCliente >= idadeMin && idadeCliente <= idadeMAX) {
			
			System.out.println("Parabens você foi cadastrado com sucesso");
			
		} else { 
			
			System.out.println("Não foi dessa vez que você conseguiu continue tentando");
			
		}
		
		
	}
}
