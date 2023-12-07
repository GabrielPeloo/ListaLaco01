package listaLaco01;

import java.util.Scanner;

public class ListaLaco0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB, numC, numAB;
		boolean par = false, pos = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o número A: ");
		numA = leia.nextInt ();
		
		if (numA % 2 == 0) {
			par = true;
		}
		if (numA % 2 != 0) {
			par = false;
		} 
		if (numA > 0){
			pos = true;
		}
		if (numA < 0){
			pos = false;
		}
		if (par == true && pos == true) {
			System.out.println(numA + " é par e positivo! ");
		}
		if (par == false && pos == true) {
			System.out.println(numA + " é ímpar e positivo! ");
		}
		if (par == false && pos == false) {
			System.out.println(numA + " é ímpar e negativo! ");
		}
		if (par == true && pos == false) {
			System.out.println(numA + " é par e negativo! ");
		}
	}

}
