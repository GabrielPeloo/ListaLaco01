package listalaco02;

import java.util.Scanner;

public class ListaLaco0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Float num1, num2, resultado;
		Scanner leia = new Scanner(System.in);
		

		System.out.println(" -- Digite o primeiro número --");
		num1 = leia.nextFloat();
		
		System.out.println(" -- Digite o segundo número --");
		num2 = leia.nextFloat();
		
		System.out.println("# ## ### #### Operação #### ### ## #");
		System.out.println("\n -- Digite 1 para soma --");
		System.out.println(" -- Digite 2 para subtração --");
		System.out.println(" -- Digite 3 para multiplicação --");
		System.out.println(" -- Digite 4 para divisão --");
		opcao = leia.nextInt();
				
		switch (opcao) {
		case 1: 
			resultado = (float) (num1 + num2);
			System.out.println("O resultado de "+ num1 +" + "+num2+ " = " + resultado);
		break;
		
		case 2: 
			resultado = (float) (num1 - num2);
			System.out.println("O resultado de "+ num1 +" - "+num2+ " = " + resultado);
		break;
		
		case 3: 
			resultado = (float) (num1 * num2);
			System.out.println("O resultado de "+ num1 +" * "+num2+ " = " + resultado);
		break;
		
		case 4: 
			resultado = (float) (num1 / num2);
			System.out.println("O resultado de "+ num1 +" / "+num2+ " = " + resultado);
		break;
		
		
		default:
			System.out.println(" Opção inválida");
		
		}
	}

}
