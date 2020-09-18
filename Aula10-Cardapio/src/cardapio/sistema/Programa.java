package cardapio.sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cardapio.dominio.Bebida;
import cardapio.dominio.Prato;
import cardapio.dominio.Vinho;
import cardapio.util.Impressora;

public class Programa{
	
	public static void main(String[] args) throws IOException  {
			
		Scanner leitor = new Scanner (System.in);
		Scanner leitor2 = new Scanner (System.in);
		
		int opcao = 0, pedidoPrato = 0, quantidadePrato = 0, pedidoBebida = 0, quantidadeBebida = 0, pedidoVinho = 0, quantidadeVinho = 0;
		String nomes;
		String nomePrato = "", nomeBebida = "", nomeVinho = "";
		double valorPrato = 0, valorBebida = 0, valorVinho = 0;
		String obsPrato = "";
		String obsBebida = "", obsVinho = "";
		double valorPedidoPrato, valorPedidoBebida, valorPedidoVinho;
		double somaPedidoPrato = 0, somaPedidoBebida = 0, somaPedidoVinho = 0, totalPedido = 0;
		
		System.out.println ("\t\tBEM VINDO AO LANCHI'S");
		System.out.println ("");
		System.out.println ("\t\tComo posso te chamar? ");
			nomes = leitor2.next();
		
			do {
				System.out.println ("");
				System.out.println (nomes + ",\nDigite o número do Cardápio que deseja vizualizar");
				System.out.println ("");
				System.out.println ("Digite 1 - Cardápio dos Pratos");
				System.out.println ("Digite 2 - Cardápio das Bebidas");
				System.out.println ("Digite 3 - Cardápio dos Vinhos");
				System.out.println ("Digite 4 - Fizalizar pedido");
				System.out.println ("");
				System.out.println ("Digite 0 - Sair ");
					opcao = leitor2.nextInt();
					
					int contador = 1;
					
				switch(opcao) {
				case 1:
					
					File arquivoPratos = new File("C:\\Users\\adfer\\OneDrive\\Documentos\\Universidade Positivo\\2° Semestre\\Desenvolvimento de Software 1\\1° Bimestre\\Aulas 09-10 - 31 e 01-09\\Aula 10 - Atividade 04\\pratos.txt");
					leitor = new Scanner(arquivoPratos);
					leitor.nextLine();
					
					List<Prato> listaDePratos = new ArrayList<>();
					
					while (leitor.hasNext()) {
						
						String linha = leitor.nextLine();
						String[] partes = linha.split(";");
						
						
						Prato prato = new Prato();
						prato.setNomePrato(partes[0]);
						prato.setValorPrato(Double.parseDouble(partes[1]));
						prato.setCodigoPrato(contador);
						
						listaDePratos.add(prato);
						contador++;
					}
					
					System.out.println ("\t\tCARDÁPIO DE PRATOS\n\n");
					System.out.println ("\tcodigo\t\tpreço\t\t\tPrato");
					for (Prato prato : listaDePratos) {
						System.out.println("\t" + prato.getCodigoPrato() + "\t\tR$ " + prato.getValorPrato() + "\t\t\t" + prato.getNomePrato());
					}
					
					System.out.println("\n\n\t\t\t\tDigite o codigo do prato desejado: ");
						pedidoPrato = leitor2.nextInt();
				
					System.out.println ("\n\t\t\t\tQuantidade: ");
						quantidadePrato = leitor2.nextInt();					
					
						
					System.out.println ("\n\t\t\t\tAdicionar observações: ");
							obsPrato = leitor2.next();	
						
					for (Prato prato : listaDePratos) {
						if (pedidoPrato == prato.getCodigoPrato()) {
							System.out.println ("\n\t\t------escolha-----\n");
							
							nomePrato = prato.getNomePrato();
							valorPrato = prato.getValorPrato();
							
							System.out.println ("quantidade: " + quantidadePrato + "\t\t\tprato: " + nomePrato);
							
							valorPedidoPrato = quantidadePrato * valorPrato;
							somaPedidoPrato = somaPedidoPrato + valorPedidoPrato;
							
							System.out.println ("\n---------------------------------------------------------------------");
							System.out.println ("Valor total dos pratos R$: " + valorPedidoPrato);
							
						}
						
					}
						
					System.out.println ("\n\n\t\tDigite 0 para voltar ao MENU: ");
						opcao = leitor2.nextInt();

					break;
				case 2:
					
					File arquivoBebidas = new File ("C:\\Users\\adfer\\OneDrive\\Documentos\\Universidade Positivo\\2° Semestre\\Desenvolvimento de Software 1\\1° Bimestre\\Aulas 09-10 - 31 e 01-09\\Aula 10 - Atividade 04\\bebidas-tabuladas.txt");
					leitor = new Scanner(new FileInputStream(arquivoBebidas));
					leitor.nextLine();
					
					List<Bebida> listaDeBebidas = new ArrayList<>();
					
					while (leitor.hasNext()) {
						
						String linha = leitor.nextLine();
						String[] partes = linha.split("\t");
						
						Bebida bebida = new Bebida();
						bebida.setValorBebida(Double.parseDouble(partes[0].replaceAll(",",".")));
						//leitor.nextDouble();
						bebida.setNomeBebida(partes[1]);
						bebida.setCodigoBebida(contador);
						
						listaDeBebidas.add(bebida);
						contador++;
					}
					
					System.out.println ("\t\tCARDÁPIO DE BEBIDAS\n\n");
					System.out.println ("\titem\t\tpreço\t\t\tBebidas");
					for (Bebida bebida : listaDeBebidas) {
						System.out.println("\t" + bebida.getCodigoBebida() + "\t\tR$ " + bebida.getValorBebida() + "\t\t\t" + bebida.getNomeBebida());
					}
					
					System.out.println("\n\n\t\t\t\tDigite o codigo da bebida desejada: ");
						pedidoBebida = leitor2.nextInt();
					
					System.out.println ("\n\t\t\t\tQuantidade: ");
						quantidadeBebida = leitor2.nextInt();
					
					System.out.println ("\n\t\t\t\tAdicionar observação: ");
						obsBebida = leitor2.next();
					
					for (Bebida bebida : listaDeBebidas) {
						if (pedidoBebida == bebida.getCodigoBebida()) {
							System.out.println ("\n\t\t------escolha-----\n");
							
							nomeBebida = bebida.getNomeBebida();
							valorBebida = bebida.getValorBebida();
							
							System.out.println ("quantidade: " + quantidadeBebida + "\t\t\tbebida: " + nomeBebida);
							
							valorPedidoBebida = quantidadeBebida * valorBebida;
							somaPedidoBebida = somaPedidoBebida + valorPedidoBebida;
							
							System.out.println ("\n---------------------------------------------------------------------");
							System.out.println ("Valor total das bebidas R$: " + valorPedidoBebida);
						}	
					}
				
					System.out.println ("\n\n\t\tDigite 0 para voltar ao MENU: ");
						opcao = leitor2.nextInt();
					
					break;
				case 3:
					
					File arquivoVinhos = new File ("C:\\Users\\adfer\\OneDrive\\Documentos\\Universidade Positivo\\2° Semestre\\Desenvolvimento de Software 1\\1° Bimestre\\Aulas 09-10 - 31 e 01-09\\Aula 10 - Atividade 04\\vinhos-tabulados.txt");
					leitor = new Scanner(arquivoVinhos);
					leitor.nextLine();
					
					List<Vinho> listaDeVinhos = new ArrayList<>();
					
					while (leitor.hasNext()) {
						
						String linha = leitor.nextLine();
						String[] partes = linha.split("\t");
						
						Vinho vinho = new Vinho();
						vinho.setValorVinho(Double.parseDouble(partes[0]));
						//leitor.nextDouble();
						vinho.setNomeVinho(partes[1]);
						vinho.setCodigoVinho(contador);
						
						listaDeVinhos.add(vinho);
						contador++;
					}
					
					System.out.println ("\t\tCARDÁPIO DE VINHOS\n\n");
					System.out.println ("\titem\t\tpreço\t\t\tVinho");
					for (Vinho vinho : listaDeVinhos) {
						System.out.println("\t"+ vinho.getCodigoVinho() + "\t\tR$ " + vinho.getValorVinho() + "\t\t\t" + vinho.getNomeVinho());
					}
					
					System.out.println("\n\n\t\t\t\tDigite o codigo do vinho desejado: ");
						pedidoVinho = leitor2.nextInt();
					
					System.out.println ("\n\t\t\t\tQuantidade: ");
						quantidadeVinho = leitor2.nextInt();
						
					System.out.println ("\n\t\t\t\tAdicionar observação: ");
						obsVinho = leitor2.next();
					
					for (Vinho vinho : listaDeVinhos) {
						if (pedidoVinho == vinho.getCodigoVinho()) {
							System.out.println ("\n\t\t------escolha-----\n");
							
							nomeVinho = vinho.getNomeVinho();
							valorVinho = vinho.getValorVinho();
							
							System.out.println ("quantidade: " + quantidadeVinho + "\t\t\tvinho: " + nomeVinho);
							
							valorPedidoVinho = quantidadeVinho * valorVinho;
							somaPedidoVinho = somaPedidoVinho + valorPedidoVinho;
							
							System.out.println ("\n---------------------------------------------------------------------");
							System.out.println ("Valor total dos vinhos R$: " + valorPedidoVinho);
						}
					}
					
					System.out.println ("\n\n\t\tDigite 0 para voltar ao MENU: ");
						opcao = leitor2.nextInt();
				
					break;
				case 4:
					
					totalPedido = somaPedidoPrato + somaPedidoBebida + somaPedidoVinho;
					
					System.out.println ("----------------------------------------PEDIDO---------------------------------------");
					System.out.println ("Cliente: " + nomes + "\n");
					System.out.println ("\tqtde\t\tvalores\t\titem\t\t\t\tobservações\n");
					System.out.println ("\t" + quantidadePrato + "\t\tR$ " + somaPedidoPrato + "\t\t" + nomePrato + "\t\t\t" + obsPrato);
					System.out.println ("\t" + quantidadeBebida + "\t\tR$ " + somaPedidoBebida + "\t\t" + nomeBebida + "\t\t\t" + obsBebida);
					System.out.println ("\t" + quantidadeVinho + "\t\tR$ " + somaPedidoVinho + "\t\t" + nomeVinho + "\t\t\t" + obsVinho);
					System.out.println ("");
					
					System.out.println ("--------------------------------------------------------------------------------------");
					System.out.println ("Total do pedido: R$ " + totalPedido);
					
					break;
				default:
					System.out.println ("OPÇÃO INVALIDA! Digite novamente");
					break;
				}
				
			} while (opcao == 0);
			
			Impressora.imprimir(nomes, quantidadePrato, quantidadeBebida, quantidadeVinho, somaPedidoPrato, somaPedidoBebida, somaPedidoVinho,
					nomePrato, nomeBebida, nomeVinho, totalPedido, obsPrato, obsBebida, obsVinho);
	}
	
}
