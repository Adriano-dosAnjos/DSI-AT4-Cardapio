package cardapio.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Impressora{

	public static void imprimir(String nomes, int quantidadePrato, int quantidadeBebida, int quantidadeVinho, double somaPedidoPrato, 
			double somaPedidoBebida, double somaPedidoVinho, String nomePrato, String nomeBebida, String nomeVinho, double totalPedido, String obsPrato, String obsBebida, String obsVinho) 
					throws IOException {
		
		FileWriter arquivoDeSaida = new FileWriter("C:\\Users\\adfer\\OneDrive\\Documentos\\Universidade Positivo\\2° Semestre\\Desenvolvimento de Software 1\\1° Bimestre\\Aulas 09-10 - 31 e 01-09\\Aula 10 - Atividade 04\\pedidos\\pedido-cliente " + nomes + ".txt");
		PrintWriter gravador = new PrintWriter(arquivoDeSaida);
		
		gravador.println ("----------------------------------------PEDIDO---------------------------------------");
		gravador.println ("Cliente: " + nomes + "\n");
		gravador.println ("\tqtde\t\tvalores\t\titem\t\t\t\tobservações\n");
		gravador.println ("\t" + quantidadePrato + "\t\tR$ " + somaPedidoPrato + "\t\t" + nomePrato + "\t\t\t" + obsPrato);
		gravador.println ("\t" + quantidadeBebida + "\t\tR$ " + somaPedidoBebida + "\t\t" + nomeBebida + "\t\t\t" + obsBebida);
		gravador.println ("\t" + quantidadeVinho + "\t\tR$ " + somaPedidoVinho + "\t\t" + nomeVinho + "\t\t\t" + obsVinho);
		gravador.println ("");
	
		gravador.println ("--------------------------------------------------------------------------------------");
		gravador.println ("Total do pedido: R$ " + totalPedido);
		
		gravador.close();
		arquivoDeSaida.close();
		
		System.out.println("");
		System.out.println("Gerado pedido do(a) cliente: " + nomes);
		System.out.println("");
		
	}

}