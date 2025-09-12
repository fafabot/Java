package primeiroProjeto;

import java.util.Scanner;

		public class Lista11 {

		  public static void main(String[] args) {
			  
		    Scanner sc = new Scanner(System.in);

		    // Exercício 1 - Contador
		    System.out.println("--- Exercício 1 - Contador ---");
		    int contador = 1;
		    do {
		      System.out.println(contador);
		      contador += 2;
		    } while (contador <= 31);
		    System.out.println("------------------------------");

		    // Exercício 2 - Adivinhação de número
		    System.out.println("--- Exercício 2 - Adivinhação ---");
		    int numero;
		    do {
		      System.out.println("Adivinhe o número. Digite um número:");
		      numero = sc.nextInt();
		    } while (numero != 100);
		    System.out.println("Parabéns, você acertou!");
		    System.out.println("------------------------------");

		    // Exercício 3 - Menu interativo
		    System.out.println("--- Exercício 3 - Menu Interativo ---");
		    int opcao;
		    do {
		      System.out.println("Menu:");
		      System.out.println("1 - Continuar");
		      System.out.println("2 - Sair");
		      System.out.println("Escolha uma opção:");
		      opcao = sc.nextInt();

		      if (opcao == 1) {
		        System.out.println("Você escolheu continuar!");
		      } else if (opcao != 2) {
		        System.out.println("Opção inválida. Tente novamente.");
		      }
		    } while (opcao != 2);
		    System.out.println("Você escolheu sair. O programa foi encerrado.");
		    System.out.println("------------------------------");

		    // Exercício 4 - Classificação de números
		    System.out.println("--- Exercício 4 - Classificação ---");
		    int i = 0;
		    do {
		      System.out.println("Informe um número:");
		      int num = sc.nextInt();
		      if (num < 10) {
		        System.out.println("Tipo A");
		      } else if (num < 20) {
		        System.out.println("Tipo B");
		      } else {
		        System.out.println("Fora da Categoria");
		      }
		      i++;
		    } while (i < 5);
		    System.out.println("------------------------------");
		    
		    // Exercício 5 - Temperatura do forno
		    System.out.println("--- Exercício 5 - Temperatura do Forno ---");
		    int temperatura;
		    do {
		        System.out.println("Informe a temperatura atual do forno:");
		        temperatura = sc.nextInt();
		        if (temperatura >= 200) {
		            System.out.println("ALERTA: A temperatura está muito alta! Por favor, reduza o calor.");
		        }
		    } while (temperatura >= 200);
		    System.out.println("A temperatura está na faixa segura. Tudo certo!");
		    System.out.println("------------------------------");

		    // Exercício 6 - Verificação de bateria
		    System.out.println("--- Exercício 6 - Verificação de Bateria ---");
		    int nivelBateria;
		    do {
		        System.out.println("Informe o nível da bateria (em porcentagem):");
		        nivelBateria = sc.nextInt();
		        if (nivelBateria <= 20) {
		            System.out.println("ALERTA: Bateria baixa! Por favor, carregue o dispositivo.");
		        }
		    } while (nivelBateria <= 20);
		    System.out.println("Nível de bateria acima de 20%. Bom para uso!");
		    System.out.println("------------------------------");

		    // Exercício 7 - Deseja fazer uma conta?
		    System.out.println("--- Exercício 7 - Fazer uma Conta ---");
		    String resposta;
		    do {
		      System.out.println("Deseja fazer uma conta? (sim/não)");
		      resposta = sc.next();
		      if (resposta.equalsIgnoreCase("sim")) {
		        System.out.println("Digite o primeiro número:");
		        int num1 = sc.nextInt();
		        System.out.println("Digite o segundo número:");
		        int num2 = sc.nextInt();
		        int soma = num1 + num2;
		        System.out.println("A soma é: " + soma);
		      } else if (!resposta.equalsIgnoreCase("não")) {
		        System.out.println("Opção inválida. Por favor, responda 'sim' ou 'não'.");
		      }
		    } while (resposta.equalsIgnoreCase("sim"));
		    
		    System.out.println("fim.");
	}
}