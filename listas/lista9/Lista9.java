package primeiroProjeto;

import java.util.Scanner;

public class Lista9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 - Contador
		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++;
		}

		System.out.println("\n---------------------------\n");

		// 2 - Contagem regressiva
		int numero1 = 10;
		while (numero1 >= 1) {
			System.out.println(numero1);
			numero1--;
		}

		System.out.println("\n---------------------------\n");

		// 3 - Sequência numérica
		int numero2 = 0;
		while (numero2 <= 100) {
			System.out.println(numero2);
			numero2 += 5;
		}

		System.out.println("\n---------------------------\n");

		// 4 - Mostrando mensagem
		int numero3 = 0;
		while (numero3 <= 5) {
			System.out.println("Eu gosto de Java");
			numero3++;
		}

		System.out.println("\n---------------------------\n");

		// 5 - Soma de Números Digitados
		int soma = 0;
		int valor;
		int contador = 1;

		System.out.println("Digite 5 números: ");
		while (contador <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			contador++;
		}
		System.out.println("A soma dos números é: " + soma);

		System.out.println("\n---------------------------\n");

		// 6 - Validação de Senha
		System.out.println("Digite a senha: ");
		int senha = scanner.nextInt();

		while (senha != (1234)) {
			System.out.println("Teste novamente");
			senha = scanner.nextInt();
		}
		System.out.println("Você acertou a senha!");

		// 7 - Contagem Regressiva
		System.out.println("Digite um número: ");
		int numero5 = scanner.nextInt();;
		while (numero5 >= 1) {
			System.out.println(numero5);
			numero5--;
		}

		System.out.println("\n---------------------------\n");
	}

}
