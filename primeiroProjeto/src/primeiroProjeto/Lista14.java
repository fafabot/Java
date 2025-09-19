package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Contador de 1 a 10
        System.out.println("Exercício 1:");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        System.out.println();

        // 2 - Soma de 1 a 100
        int soma = 0;
        for (int b = 1; b <= 100; b++) {
            soma += b;
        }
        System.out.println("Exercício 2: Soma de 1 a 100 = " + soma + "\n");

        // 3 - Pares de 1 a 20
        System.out.println("Exercício 3: Números pares de 1 a 20:");
        for (int c = 1; c <= 20; c++) {
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }
        }
        System.out.println("\n");

        // 4 - Tabuada de um número
        System.out.print("Exercício 4 - Digite um número para ver a tabuada: ");
        int n1 = sc.nextInt();
        for (int d = 1; d <= 10; d++) {
            System.out.println(n1 + " x " + d + " = " + (n1 * d));
        }
        System.out.println();

        // 5 - Contar divisíveis por 3
        int contador = 0;
        for (int e = 1; e <= 50; e++) {
            if (e % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Exercício 5: Quantidade de números divisíveis por 3 entre 1 e 50 = " + contador + "\n");

        // 6 - Números ímpares até N
        System.out.print("Exercício 6 - Digite um número N: ");
        int n2 = sc.nextInt();
        System.out.println("Números ímpares de 1 até " + n2 + ":");
        for (int f = 1; f <= n2; f++) {
            if (f % 2 != 0) {
                System.out.print(f + " ");
            }
        }
        System.out.println("\n");

        // 7 - Multiplicação de 5 valores
        int resultado = 1;
        System.out.println("Exercício 7 - Digite 5 valores:");
        for (int g = 1; g <= 5; g++) {
            System.out.print("Valor " + g + ": ");
            int valor = sc.nextInt();
            resultado *= valor;
        }
        System.out.println("Resultado da multiplicação = " + resultado + "\n");

        // 8 - Premiação da empresa
        System.out.println("Exercício 8 - Anos de empresa de 10 funcionários:");
        for (int h = 1; h <= 10; h++) {
            System.out.print("Digite os anos de empresa do funcionário " + h + ": ");
            int anos = sc.nextInt();
            if (anos > 10) {
                System.out.println("Parabéns! Você irá receber um prêmio");
            } else {
                System.out.println("Quase lá");
            }
        }

        sc.close();
    }
}
