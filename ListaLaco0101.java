package listaLaco01;

import java.util.Scanner;

public class ListaLaco0101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB, numC, numAB;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o número A: ");
		numA = leia.nextInt ();
		
		System.out.println("Escreva o número B: ");
		numB = leia.nextInt ();
		
		System.out.println("Escreva o número C: ");
		numC = leia.nextInt ();
		
		numAB = numA + numB;
		
		if (numAB > numC) {
			System.out.println("A soma de A + B é maior que C ");
		}
		if (numAB == numC) {
			System.out.println("A soma de A + B é igual a C ");
		} 
		if (numAB < numC){
			System.out.println("A soma de A + B é menor que C");
		}
	}

}
