package devsagi.semana03.vetores.exercicio04;

import java.util.Scanner;

public class FechamentoDeAcao {
    public static void main(String[] args) {
        // receber os preços de fechamento
        Scanner input = new Scanner(System.in);
        float[] precos = new float[10];

        // variáveis para maior e menor preço
        float maiorValor, menorValor;
        maiorValor = precos[0];
        menorValor = precos[0];

        // identificar maior e menor preço
        // resultados
        System.out.printf("Maior preço registrado: %.2f\n", maiorValor);
        System.out.printf("Menor preço registrado: %.2f\n", menorValor);
    }
}
