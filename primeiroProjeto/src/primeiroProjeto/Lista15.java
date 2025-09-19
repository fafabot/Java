package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Criando um vetor
        String[] fruta = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Fruta[" + i + "]: ");
            fruta[i] = sc.next();
        }
        System.out.println("Mostrando os valores armazenados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(fruta[i]);
        }

        // 2 - Vetor de números inteiros
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Número[" + i + "]: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Mostrando os valores armazenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        // 3 - Mostrando os valores na ordem inversa
        int[] valores = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Valor[" + i + "]: ");
            valores[i] = sc.nextInt();
        }
        System.out.println("Mostrando na ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.println(valores[i]);
        }

        // 4 - Maiores que 100
        int[] lista = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Número[" + i + "]: ");
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (lista[i] > 100) {
                System.out.println(lista[i] + " é maior do que 100");
            }
        }

        // 5 - Procurando um valor no vetor
        int[] vetor = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Número[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Digite um número para procurar: ");
        int procurado = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 8; i++) {
            if (vetor[i] == procurado) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Número encontrado no vetor!");
        } else {
            System.out.println("Número NÃO encontrado no vetor!");
        }

        // 6 - Nome e idade de 5 pessoas
        String[] nomes = new String[5];
        int[] idades = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome[" + i + "]: ");
            nomes[i] = sc.next();
            System.out.print("Idade[" + i + "]: ");
            idades[i] = sc.nextInt();
        }
        System.out.println("Mostrando nomes e idades:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " tem " + idades[i] + " anos");
        }

        // 7 - Identificação de idade
        int[] idadeVetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade[" + i + "]: ");
            idadeVetor[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (idadeVetor[i] < 18) {
                System.out.println(idadeVetor[i] + " -> você é menor de idade");
            }
        }

        // 8 - Aumento em massa
        double[] salarios = new double[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Salário[" + i + "]: ");
            salarios[i] = sc.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            if (salarios[i] <= 2500) {
                System.out.println("Salário " + salarios[i] + " -> você receberá um aumento");
            }
        }
    }
}
