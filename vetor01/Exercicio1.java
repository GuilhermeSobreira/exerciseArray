package vetor01;

import java.util.Arrays;
import java.util.Scanner;


public class Exercicio1 {
	public static void main(String[] args) {
	        String[] nome = new String[10];
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um nome a lista: ");
	            nome [i] = scanner.nextLine();	        }

	        Arrays.sort(nome);

	        System.out.println("\n\nLista em ordem alfabética:");
	        for (String n : nome) {
	            System.out.println(n);
	        }
	    }
	}