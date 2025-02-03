package devsagi.semana03.vetores.exercicio02;

import java.util.Scanner;

public class Acao {
    public static void main(String[] args) {
        // receber preços das ações em 5 dias
        Scanner input = new Scanner(System.in);
        double[] precos = new double[5];
        double crescimentoAcumulado, crescimentoPercentual;

        System.out.print("Digite o preço do Dia 1: ");
        precos[0] = input.nextDouble();

        System.out.print("Digite o preço do Dia 2: ");
        precos[1] = input.nextDouble();

        System.out.print("Digite o preço do Dia 3: ");
        precos[2] = input.nextDouble();

        System.out.print("Digite o preço do Dia 4: ");
        precos[3] = input.nextDouble();

        System.out.print("Digite o preço do Dia 5: ");
        precos[4] = input.nextDouble();
        input.close();

        // calcular crescimento diário
        crescimentoAcumulado = 1.0;
        crescimentoAcumulado *= (1 + (precos[1] - precos[0]) / precos[0]);
        crescimentoAcumulado *= (1 + (precos[2] - precos[1]) / precos[1]);
        crescimentoAcumulado *= (1 + (precos[3] - precos[2]) / precos[2]);
        crescimentoAcumulado *= (1 + (precos[4] - precos[3]) / precos[3]);

        // encontrar o percentual desse crescimento
        crescimentoPercentual = (crescimentoAcumulado - 1) * 100;
        System.out.printf("\nCrescimento percentual acumulado em 5 dias: %.2f%%", crescimentoPercentual);
    }
}
