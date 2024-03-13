package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double nota1, nota2, nota3, mediaPonderada;
		
		System.out.print("Digite o nome do aluno: ");
		nome = sc.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		mediaPonderada = (nota1 * 2 + nota2 * 4 + nota3 * 6) / 12;
		
		System.out.println("Nome do aluno = " + nome);
		System.out.println("Media ponderada = " + mediaPonderada);
		
		sc.close();
		

	}

}
