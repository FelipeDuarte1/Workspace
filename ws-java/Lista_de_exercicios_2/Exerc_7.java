package Lista_de_exercicios_2;

import java.util.Scanner;

public class Exerc_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]valores = new int[6];
        System.out.println("Digite 6 valores inteiros ");

        for (int i=0; i< 6; i++){
            System.out.println("Valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        System.out.println("Valores na ordem inversa:");

        for(int i = 5; i >=0; i--){
            System.out.println(valores[i]);
        }
        sc.close();
    }
}
