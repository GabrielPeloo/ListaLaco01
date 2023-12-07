package listalaco02;

import java.util.Scanner;

public class ListaLaco0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Float saldo = (float) 1000, saque, deposito;
		Scanner leia = new Scanner(System.in);
				
		System.out.println("# ## ### #### Operação #### ### ## #");
		System.out.println("\n -- Digite 1 para Operação - Saldo --");
		System.out.println(" -- Digite 2 para Operação - Saque --");
		System.out.println(" -- Digite 3 para Operação - Depósito --");
		opcao = leia.nextInt();
				
		switch (opcao) {
		case 1: 
			System.out.println(" Operação - Saldo \n Saldo: " + saldo);
		break;
		
		case 2: 
			System.out.println("Quanto você deseja sacar ?");
			saque = leia.nextFloat();
			if (saque <= saldo) {
			saldo = (float) (saldo - saque);
			System.out.println(" Operação - Saque \n Novo Saldo: "+ saldo);
			} else {
				System.out.println(" Saldo insuficiente! ");
			}
		break;
		
		case 3:
			System.out.println("Quanto você deseja depositar ?");
			deposito = leia.nextFloat();
			saldo = (float) (deposito + saldo);
			System.out.println(" Operação - Deposito \n Novo Saldo: " + saldo);
		break;
		
		default:
			System.out.println(" Opção inválida");
		
		}
	}

}
