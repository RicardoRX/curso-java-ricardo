package aula0009;

import java.util.Scanner;

public class aula0009 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtração, multi, divi ;
		
		System.out.println("insira um numero: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira outro numero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		subtração = num1 - num2;
		System.out.println("O resultado da subtração é: " + subtração);
		
		multi = num1 * num2;
		divi = num1 / num2;
		
		System.out.println("O resultado da multiplicação é: " + multi);
		System.out.println("O resultado da divisão é: " + divi);

	}

}
