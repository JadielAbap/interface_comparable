package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "C:\\Program Files\\eclipse\\temp\\in2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String name = br.readLine(); //ler linha do arquivo
			while (name != null) { //enquanto essa linha na variável name for diferente de nulo
				list.add(name); //vou adicionar esse valor na minha lista
				name = br.readLine(); //depois vou ler próxima linha
			}
			Collections.sort(list); //uma forma de ordenar uma coleção 
			for (String s : list) { //percorrer minha lista
				System.out.println(s);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}