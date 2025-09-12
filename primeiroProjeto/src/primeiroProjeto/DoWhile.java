package primeiroProjeto;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 11;
		do {
		  System.out.println("Do..While");
		} while (contador <= 10);

		while (contador <= 10) {
		  System.out.println("While");
		}
		System.out.println("--------------------");
		int numero = 0;
		do {
		  System.out.println(numero);
		  numero += 5; //+5
		} while (numero < 20);
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in); //java.util

		int secreto = 5;
		int escolha = 0;
		do {
		  System.out.println("Escolha um número:");
		  escolha = sc.nextInt();
		  if (escolha > secreto) {
		    System.out.println("é menor");
		  } else if (escolha < secreto) {
		    System.out.println("é maior");
		  }
		} while (secreto != escolha);
		System.out.println("Acertouu");
		System.out.println("--------------------");
		System.out.println("Escolha uma opção do menu");
		System.out.println("1 - Ficar na navegação");
		System.out.println("2 - Sair da navegação");
		int opcao = sc.nextInt();
		do {
		  System.out.println("Escolha novamente uma opção do menu");
		  opcao = sc.nextInt();
		} while (opcao != 2);
		
		System.out.println("------------------------");
		int idade;
		int cont = 1;
		do {
		  System.out.println("Informe uma idade");
		  idade = sc.nextInt();
		  if (idade <= 12) {
		    System.out.println("CRIANÇA");
		  } else {
		    System.out.println("NÃO É CRIANÇA");
		  }
		  cont++;
		} while (cont <= 5);
		
		System.out.println("-------------------------");
		int nota;
		int cont2=1;
		do {
			System.out.println("Informe a nota");
			nota=sc.nextInt();
			if(nota<5) {
				System.out.println("nota ruim");
			} else {
				System.out.println("nota boa");
			}
			cont++;
		} while (cont2<=3);
		System.out.println("Diario fechado");
	}
}
	
