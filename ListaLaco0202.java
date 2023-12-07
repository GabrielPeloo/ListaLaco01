package listalaco02;

import java.util.Scanner;

public class ListaLaco0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Float salario, novoSalario, reajuste;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" -- Digite seu nome --");
		nome = leia.nextLine();
		
		System.out.println("# ## ### #### Menu #### ### ## #");
		System.out.println("\n -- Digite 1 para Gerente --");
		System.out.println(" -- Digite 2 para Vendedor --");
		System.out.println(" -- Digite 3 para Supervisor --");
		System.out.println(" -- Digite 4 para Motorista --");
		System.out.println(" -- Digite 5 para Estoquista --");
		System.out.println(" -- Digite 6 para Técnico de TI --");
		opcao = leia.nextInt();
		
		System.out.println(" -- Digite seu salário --");
		salario = leia.nextFloat();
		
		switch (opcao) {
		case 1: 
			reajuste = (float) (0.1 * salario);
			novoSalario = salario + reajuste;
			System.out.println( " Nome: "+ nome +"\n Cargo: " + opcao + "\n Salário: R$"+ novoSalario);
		break;
		
		case 2: 
			reajuste = (float) (0.07 * salario);
			novoSalario = salario + reajuste;
			System.out.println(" Nome: "+ nome +"\n Cargo: " + opcao + "\n Salário: R$"+ novoSalario);
		break;
		
		case 3: 
			reajuste = (float) (0.09 * salario);
			novoSalario = salario + reajuste;
			System.out.println(" Nome: "+ nome +"\n Cargo: " + opcao + "\n Salário: R$"+ novoSalario);
		break;	
		
		case 4: 
			reajuste = (float) (0.06 * salario);
			novoSalario = salario + reajuste;
			System.out.println(" Nome: "+ nome +"\n Cargo: " + opcao + "\n Salário: R$"+ novoSalario);
		break;
		
		case 5: 
			reajuste = (float) (0.05 * salario);
			novoSalario = salario + reajuste;
			System.out.println(" Nome: "+ nome +"\n Cargo: " + opcao + "\n Salário: R$"+ novoSalario);
		break;
		
		case 6: 
			reajuste = (float) (0.08 * salario);
			novoSalario = salario + reajuste;
			System.out.println(" Nome: "+ nome +"\n Cargo: " + opcao + "\n Salário: R$"+ novoSalario);
		break;
		
		default:
			System.out.println(" Opção inválida");
		
		}
	}

}
