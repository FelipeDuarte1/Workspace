package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		double x,y, xerox, folhas;
		
		System.out.print("Quantas folhas serão feitas xerox? ");
		folhas = sc.nextDouble();
		
		x = 0.5;
		y = 0.3;
		
		if (folhas > 200)
			xerox = folhas * y;
		else
			xerox = folhas * x;
		
		System.out.print("O valor total é de " + xerox);
		sc.close();

	}

}
