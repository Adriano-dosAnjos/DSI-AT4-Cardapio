package cardapio.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import cardapio.dominio.Bebida;
import cardapio.dominio.Prato;

public class Relatorio {
	
	public static void processar(List<Prato> listaDePratos) throws FileNotFoundException {
	
		Scanner leitor = new Scanner (System.in);
		
		int opcao = 0;
		
		do {
			
			System.out.println ("MENU");
			System.out.println ("");
			System.out.println ("Digite 1 para acessar o Cardapio dos pratos");
				opcao = leitor.nextInt();
				
			switch(opcao) {
			case 1:
				
				System.out.println ("teste");
				
				
				/*for (Prato prato : listaDePratos) {
					System.out.println(prato.getNomePrato());
					System.out.println(prato.getValorPrato());
				}*/
				
				break;
			case 2:
				
				break;
			default:
				
				break;
				
			}
			
		} while (opcao == 5);
	}
	
}

	/*
	public static void processar(List<Bebida> listaDeBebidas) throws FileNotFoundException {
		
		
		
	} */
		// TODO Auto-generated method stub
		
	
	/*
	public static void processar(List<Prato> listaDePratos) throws IOException {
			
		Scanner leitor = new Scanner (System.in);
		
			int opcao = 0;
			
		
		
		do {
			
			System.out.println ("MENU");
			System.out.println ("");
			System.out.println ("Digite 1 para acessar o Cardapio dos pratos");
				opcao = leitor.nextInt();
				
			switch(opcao) {
			case 1:
				
				for (Prato prato : listaDePratos) {
					System.out.println(prato.getNomePrato());
					System.out.println(prato.getValorPrato());
				}
				
				break;
			case 2:
				
				break;
			default:
				
				break;
				
			}
				
		} while (opcao == 5);
		
		}
		*/
	
