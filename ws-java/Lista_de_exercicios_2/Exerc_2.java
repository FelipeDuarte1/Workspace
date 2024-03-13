package Lista_de_exercicios_2;

import java.util.Scanner;

public class Exerc_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalClientes = 150;

        double totalCedulas = 0;
        double totalCheques = 0;
        double totalCartao = 0;

        for (int i = 0; i < totalClientes; i++){
            System.out.println("Cliente " + (i + 1) +":" );

            System.out.println("Valor pago em cedulas: ");
            var cedulas = sc.nextDouble();
            totalCedulas += cedulas;

            System.out.println("Valor pago em cheques: ");
            var cheques = sc.nextDouble();
            totalCheques += cheques;

            System.out.println("Valor pago em cartões: ");
            var cartao = sc.nextDouble();
            totalCartao += cartao;
        }

        double receitaTotal = totalCartao + totalCedulas + totalCheques;

        System.out.println("\nTotal de pagamentos em cédulas: R$" + totalCedulas);
        System.out.println("Total de pagamentos em cheques: R$" + totalCheques);
        System.out.println("Total de pagamentos em cartões de crédito: R$" + totalCartao);
        System.out.println("Receita total da danceteria: R$" + receitaTotal);

        sc.close();
    }
}
