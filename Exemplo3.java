package Exercicios;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero !=10) {
		
		System.out.println("Digite um n�mero: ");
		numero = in.nextInt();
		
		if(numero == 10) {
			System.out.println("Voc� acertou! ");
		}
		else {
			System.out.println("Voc� errou! :( ");
		}
		
	}

}
}
	
