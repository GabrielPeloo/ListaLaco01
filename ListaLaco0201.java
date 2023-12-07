package listalaco02;

import java.util.Scanner;

public class ListaLaco0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, quantidade, preco;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### Menu #### ### ## #");
		System.out.println("\n -- Digite 1 para Cachorro Quente --");
		System.out.println(" -- Digite 2 para X-Salada --");
		System.out.println(" -- Digite 3 para X-Bacon --");
		System.out.println(" -- Digite 1 para Bauru --");
		System.out.println(" -- Digite 2 para Refrigerante --");
		System.out.println(" -- Digite 3 para Suco de laranja --");
		opcao = leia.nextInt();
		
		System.out.println(" -- Digite a quantidade desejada --");
		quantidade = leia.nextInt();
		
		switch (opcao) {
		case 1: 
			preco = 10 * quantidade;
			System.out.println("O total do seu pedido é R$"+ preco);
		break;
		
		case 2: 
			preco = 15 * quantidade;
			System.out.println("O total do seu pedido é R$"+ preco);
		break;
		
		case 3: 
			preco = 18 * quantidade;
			System.out.println("O total do seu pedido é R$"+ preco);
			
		case 4: 
			preco = 12 * quantidade;
			System.out.println("O total do seu pedido é R$"+ preco);
		break;
		
		case 5: 
			preco = 8 * quantidade;
			System.out.println("O total do seu pedido é R$"+ preco);
		break;
		
		case 6: 
			preco = 13 * quantidade;
			System.out.println("O total do seu pedido é R$"+ preco);
		break;
		
		default:
			System.out.println("Opção inválida");
		
		}
	}

}
