package primeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* >= maior ou igual           <= menor ou igual
		 * > maior                     < menor	 
		 * == igual                    != diferente */
			int idade = 18;
			 if(idade >= 18) {
				 System.out.println("\nVocê é maior de idade");
			 } else {
				 System.out.println("Você é menor de idade");
			 }
			Scanner scanner = new Scanner(System.in);
			//Verificação de desconto
			System.out.println("Quanto você pagou");
			double valor = scanner.nextDouble();
			if(valor >= 200) {
				System.out.println("Você ganhou desconto");
			} else {
				System.out.println("Você não ganhou desconto");
			}
			
			//------------------------------------------------------
			
			String continuar;
			System.out.println("\nDeseja Continuar? ");
			continuar = scanner.next();
			if(continuar == "sim") {
				System.out.println("Você escolheu continuar");
			} else {
				System.out.println("Você escolheu sair");
			}
			
			//------------------------------------------------------
			
			double nota1, nota2;
			System.out.println("\nInforme a nota 1: ");
			nota1 = scanner.nextDouble();
			System.out.println("Informe a nota 2: ");
			nota2 = scanner.nextDouble();
			double media = (nota1 + nota2)/ 2;
			if (media < 7) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Aprovado");
			}
			
			//---------------------------------------------------------------
			/*Aplicação de desconto: Peça o valor da compra para o usuári
			se o valor for maior ou igual a 200, o usuário recebe um
			desconto de 15%, senão não tem desconto. Mostre se ele
			teve algum desconto e quanto deve pagar*/
			
			System.out.println("\nQual é o valor da compra");
			double valorcompra = scanner.nextDouble();
			double desconto = valorcompra-valorcompra*0.15;
			if(valorcompra >= 200) {
				System.out.println("Você ganhou desconto de 15%");
				System.out.printf("O valor final ficou de R$ %.2f%n",desconto);
			} else {
				System.out.println("Você não ganhou desconto");
				System.out.printf("O valor final ficou de R$ %.2f%n",valorcompra);
			}
	}

}
