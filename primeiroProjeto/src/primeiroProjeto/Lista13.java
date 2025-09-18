package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1 - Contador
		for (int i = 10; i <= 30; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		//2 - Classificação de Idades
		for (int c = 1; c <= 10; c++) {
			System.out.println("Digite a idade "+c+": ");
			int idade = sc.nextInt();
			if (idade >= 18) {
				System.out.println("Maior de idade");
			} else {
				System.out.println("Menor de idade");
			}
		}
		
		//3 - Eleição
		for (int d = 1; d <= 5; d++) {
			System.out.println("Digite o voto "+ d +": ");
			int voto = sc.nextInt();
			if (voto == 1 || voto == 2 || voto == 3 || voto == 4) {
                System.out.println("Voto Válido Registrado");
            } else if (voto == 5) {
                System.out.println("Voto Nulo Registrado");
            } else if (voto == 6) {
                System.out.println("Voto em Branco Registrado");
            } else {
                System.out.println("Código inválido. Por favor, digite um número entre 1 e 6.");
                d--; // Decrementa 'd' para que o usuário tente novamente
            }
        }
			
		 // 4 - Repetição de Frase:
	    sc.nextLine();
	    System.out.print("Digite uma frase: ");
	    String frase = sc.nextLine();
	    System.out.print("Digite um número: ");
	    int vezes = sc.nextInt();
	    for (int a = 1; a <= vezes; a++) {
	        System.out.println(frase);
	    }



	    System.out.println("-----------");

	    // 5 - Sequência:
	    for (int b = 50; b >= 30; b--) {
	        System.out.println(b);
	    }

	    System.out.println("-----------");

	    // 6 - Números Alternados:
	    for (int f = 1; f <= 50; f += 2) {
	        System.out.println(f);
	    }

	    System.out.println("-----------");

	    // 7 - Aprovado ou Reprovado:
	    for (int g = 1; g <= 5; g++) {
	        System.out.println("Digite a nota " + g + ": ");
	        double nota = sc.nextDouble();
	        if (nota >= 6) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }
	    }

	    System.out.println("-----------");

	    // 8 - Categoria de Idade:
	    for (int h = 1; h <= 5; h++) {
	        System.out.println("Digite a idade da pessoa " + h + ": ");
	        int idade = sc.nextInt();
	        if (idade <= 12) {
	            System.out.println("Criança");
	        } else if (idade <= 17) {
	            System.out.println("Adolescente");
	        } else if (idade <= 59) {
	            System.out.println("Adulto");
	        } else {
	            System.out.println("Idoso");
	        }
	    }

	    System.out.println("-----------");

	    // 9 - Número Positivo ou Negativo:
	    for (int j = 1; j <= 7; j++) {
	        System.out.println("Digite o número " + j + ": ");
	        int num = sc.nextInt();
	        if (num > 0) {
	            System.out.println("Positivo");
	        } else if (num < 0) {
	            System.out.println("Negativo");
	        } else {
	            System.out.println("Zero");
	        }
	    }
	}
}