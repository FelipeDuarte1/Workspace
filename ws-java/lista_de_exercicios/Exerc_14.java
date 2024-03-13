package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double temperaturaCelsius, temperaturaFahren;
		
		System.out.print("Qual a temperatura em graus Celsius? ");
		temperaturaCelsius = sc.nextDouble();
		
		temperaturaFahren = (9 * temperaturaCelsius + 160) / 5;
		
		System.out.print("A temperatura em Fahrenheit é " + temperaturaFahren);
		
		sc.close();

	}

}
