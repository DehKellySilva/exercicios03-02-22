package exercicioJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int op;
	Scanner leia = new Scanner(System.in);
	
	ArrayList <String> estoque = new ArrayList();
	
	do
	{
		System.out.println("\n-----------------------------------------------");
		System.out.println("\n1- Deseja adicionar algum item ao estoque?");
		System.out.println("\n2- Deseja remover algum item do estoque?");
		System.out.println("\n3- Deseja atualizar algum item do estoque?");
		System.out.println("\n4- Exibir todos os itens do estoque?");
		System.out.println("\n-----------------------------------------------");
		System.out.println("Digite o número da sua opção: ");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\nEscreva o nome do item que deseja adicionar: ");
			String item = leia.nextLine();
			estoque.add(item);
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nEscreva o nome do item que deseja remover: ");
			String item1 = leia.nextLine();
			if(estoque.contains(item1)) 
			{
				estoque.remove(item1);
			}
			else 
			{
				System.out.println("\nItem não existe!!!");
			}
			System.out.println(estoque);
			break;
			
		case 3:
			leia.nextLine();
			System.out.println("Digite o nome do item que deseja atualizar: ");
			String valida = leia.nextLine();
			System.out.println("Digite o nome do item substituto: ");
			String substitui = leia.nextLine();
			if(estoque.contains(valida)) 
			{
				estoque.remove(valida);
				estoque.add(substitui);
			}
			else
			{
				System.out.println("\nItem inválido!!!");
			}
			System.out.println(estoque);
			break;
			
		case 4:
			System.out.println("\nLista de todos od itens do estoque: ");
			System.out.println(estoque);
			break;
			
			default:
				if(op==0)
				{
					System.out.println("\nObrigada por utilizar a plataforma...");
				}
				else
				{
					System.out.println("\nOpção inválida. Tente novamento");
				}
		}
	}
	
	while(op!=0);
	}
}
