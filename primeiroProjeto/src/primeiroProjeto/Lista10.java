package primeiroProjeto;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 1 - Contador: Mostre os números de 10 a 30 no console
		int cont1 = 10;
		while (cont1 <= 30) {
		    System.out.println(cont1);
		    cont1++;
		}
		System.out.println("---------------------");

		// 2 - Soma de Números Digitados: Peça 3 números inteiros ao usuário
		int soma2 = 0;
		int cont2 = 1;
		while (cont2 <= 3) {
		    System.out.println("Digite o número " + cont2 + ":");
		    int num = sc.nextInt();
		    soma2 += num;
		    cont2++;
		}
		System.out.println("A soma dos números é: " + soma2);
		System.out.println("---------------------");

		// 3 - Multiplicação de Números Digitados: Peça 5 números
		int mult3 = 1;
		int cont3 = 1;
		while (cont3 <= 5) {
		    System.out.println("Digite o número " + cont3 + ":");
		    int num = sc.nextInt();
		    mult3 *= num;
		    cont3++;
		}
		System.out.println("O resultado da multiplicação é: " + mult3);
		System.out.println("---------------------");

		// 4 - Contar até o número informado
		System.out.println("Digite um número para contar até ele: ");
		int numero4 = sc.nextInt();
		int cont4 = 1;
		while (cont4 <= numero4) {
		    System.out.println(cont4);
		    cont4++;
		}
		System.out.println("---------------------");

		// 5 - Somar os números de 1 a 5
		int cont5 = 1;
		int soma5 = 0;
		while (cont5 <= 5) {
		    soma5 += cont5;
		    cont5++;
		}
		System.out.println("A soma dos números de 1 a 5 é: " + soma5);
		System.out.println("---------------------");

		// 6 - Tabuada
		System.out.println("Digite um número para ver a tabuada: ");
		int numero6 = sc.nextInt();
		int cont6 = 1;
		while (cont6 <= 10) {
		    System.out.println(numero6 + " * " + cont6 + " = " + (numero6 * cont6));
		    cont6++;
		}
		System.out.println("---------------------");
	}
}