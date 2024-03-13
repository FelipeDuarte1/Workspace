package Lista_de_exercicios_2;

import java.util.Scanner;

public class Exerc_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 8;

        int[] vetor = new int[tamanho];
        System.out.println("Digite os valores do vetor: ");

        for (int i = 0; i< tamanho; i++){
            System.out.println("Posição " + i + ":");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Digite a posição X: ");
        int x = sc.nextInt();

        System.out.println("Digite a posição Y: ");
        int y = sc.nextInt();

        if( x >= 0 && x < 8 && y >= 0 && y <8){
            int soma = vetor[x] + vetor[y];
            System.out.println("A soma dos valores nas posições X e Y é: " + soma);
        }
        else{
            System.out.println("Posições invalidas. As posições devem estar entre 0 e 7.");
        }
        
        sc.close();
    }
}
