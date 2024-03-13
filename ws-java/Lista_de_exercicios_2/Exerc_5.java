package Lista_de_exercicios_2;

import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 10;

        double[] numerosReais = new double[tamanho];
        double[] quadrados = new double[tamanho];

        System.out.println("Digite " + tamanho + " numeros reais: ");
        for (int i = 0; i< tamanho; i++){
            numerosReais[i] = sc.nextDouble();
        }

        for (int i = 0; i< tamanho; i++){
            quadrados[i] = numerosReais[i] * numerosReais[i];    
        }
        System.out.println("Conjunto de numeros reais>");
        imprimirVetor(numerosReais);

        System.out.println("Conjunto de quadrados:");
        imprimirVetor(quadrados);

        sc.close();
    }
    public static void imprimirVetor(double[]vetor){
        for (double elemento : vetor){
            System.out.println(elemento + " ");
        }
    }
}
