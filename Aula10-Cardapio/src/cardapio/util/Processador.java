package cardapio.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cardapio.dominio.Prato;

public class Processador {
	
	public static List<Prato> lerPrato(String nomeArquivo) throws IOException {
		
		//ENTRADA, será lido: pratos e preços - separados por ";"
		
			File arquivoPratos = new File("C:\\Users\\adfer\\OneDrive\\Documentos\\Universidade Positivo\\2° Semestre\\Desenvolvimento de Software 1\\1° Bimestre\\Aulas 09-10 - 31 e 01-09\\Aula 10 - Atividade 04\\pratos.txt");
			Scanner leitor = new Scanner(arquivoPratos);
			leitor.nextLine();
			
			List<Prato> listaDePratos = new ArrayList<>();
			
	
			while (leitor.hasNext()) {
				
				String linha = leitor.nextLine();
				String[] partes = linha.split(";");
				
				Prato prato = new Prato();
				prato.setNomePrato(partes[0]);
				prato.setValorPrato(Double.parseDouble(partes[1]));
				
				listaDePratos.add(prato);
			}
			
			Relatorio.processar(listaDePratos);
			leitor.close();
			
			return listaDePratos;
	}
	
}
