package devsagi.semana02.loops.exercicio03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /* A sequência de Fibonacci segue a seguinte ordem:
         * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
         * Repare que cada termo é a somatória dos dois anteriores, sendo que os dois primeiros são 0 e 1.
         * Faça um programa que imprima os termos da sequência de Fibonacci menores que o valor digitado. */

        Scanner input = new Scanner(System.in);
        int numero;
        int termo1 = 0;
        int termo2 = 1;
        int auxiliar;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();
        input.close();

        System.out.print("Sequência de Fibonacci: " + termo1);

        if (termo2 < numero) {
            System.out.print(", " + termo2);
        }

        auxiliar = termo1 + termo2;
        while (auxiliar < numero) {
            System.out.print(", " + auxiliar);

            termo1 = termo2;
            termo2 = auxiliar;
            auxiliar = termo1 + termo2;
        }
    }
}
