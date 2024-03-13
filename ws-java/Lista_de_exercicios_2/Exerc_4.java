package Lista_de_exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_4 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner(System.in);

	int somaIdade = 0;
     int somaIdadeHomens = 0;
        int totalMulheres = 0;
        int totalHomens = 0;
        double somaAlturaMulheres = 0;
        int totalPessoas18_35 = 0;

        int totalHabitantes = 2;

        for (int i = 0; i < totalHabitantes; i++) {
            System.out.println("Digite o sexo (0 - feminino, 1 - masculino): ");
            int sexo = scanner.nextInt();

            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite a altura em metros: ");
            double altura = scanner.nextDouble();

            somaIdade += idade;

            if (sexo == 0) {
                somaAlturaMulheres += altura;
                totalMulheres++;
            } else {
                somaIdadeHomens += idade;
                totalHomens++;
            }

            if (idade >= 18 && idade <= 35) {
                totalPessoas18_35++;
            }
        }

        double mediaIdadeGrupo = (double) somaIdade / totalHabitantes;
        double mediaAlturaMulheres = totalMulheres != 0 ? somaAlturaMulheres / totalMulheres : 0;
        double mediaIdadeHomens = totalHomens != 0 ? (double) somaIdadeHomens / totalHomens : 0;
        double percentual18_35 = (double) totalPessoas18_35 / totalHabitantes * 100;

        System.out.println("Média da idade do grupo: " + mediaIdadeGrupo + " anos");
        System.out.println("Média da altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("Média da idade dos homens: " + mediaIdadeHomens + " anos");
        System.out.println("Percentual de pessoas com idade entre 18 e 35 anos: " + percentual18_35 + "%");

        scanner.close();
	}
}
