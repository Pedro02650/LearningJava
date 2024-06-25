package PrimeiroProjeto;

import java.util.Scanner;

public class Atividade01_Programacao {
	
	
	static String name;
	static double altura;
	static double peso;
	static int idade;
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		name = keyboard.next();
		System.out.println("Digite sua altura: ");
		altura = keyboard.nextDouble();
		System.out.println("Digite seu peso: ");
		peso = keyboard.nextDouble();
		System.out.println("Digite sua idade: ");
		idade = keyboard.nextInt();
		
		System.out.println(name + " "+ idade+" "); 
		
	}
	
	
}
