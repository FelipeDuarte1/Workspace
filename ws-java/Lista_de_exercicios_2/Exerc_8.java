package Lista_de_exercicios_2;

import java.util.Scanner;

public class Exerc_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int legal = 3;
        double[] notas = new double[legal];

        System.out.println("Digite as notas dos " +legal +" alunos:");

        for(int i = 0 ; i < legal; i++){
            System.out.println("Nota do aluno" + (i+1) +": ");
            notas[i] = sc.nextDouble();
        }
        double soma = 0;

        for (int i = 0; i < legal; i++){
            soma += notas[i];
        }
        double media = soma / legal;

        System.out.println("A media geral das notas é: " + media);
        sc.close();
    }
}
