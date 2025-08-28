package primeiroProjeto;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
//	String nome;
//	System.out.println("Qual o seu nome?");
//	nome = scanner.nextLine();
//	
//	System.out.println("Olá "+nome);
//	//====================================================
//	double salario, aumento;
//	System.out.println("Informe o salário: ");
//	salario = scanner.nextDouble();
//	System.out.println("Informe o aumento: ");
//	aumento = scanner.nextDouble();
//	
//	double total = salario + aumento;
//	System.out.println("O novo salário é: "+ total);
//	//===================================================
//	int numero;
//	System.out.println("Informe um número: ");
//	numero = scanner.nextInt();
//	int divisao = numero / 2;
//	int resto = numero % 2;
//	System.out.println("Número / 2: "+ divisao);
//	System.out.println("Número % 2: "+ resto);
	
//			print
			System.out.print("olá");
			System.out.print("mundo");
			//Println - Pula uma linha depois de mostrar o texto
			System.out.println("Olá");
			System.out.println("Mundo");
			//Printf - formatado
			int idade = 20;
			double salario = 2000.50;
			System.out.println("A idade é: " + idade);
			System.out.printf("A idade é: %d", idade);
			System.out.printf("A idade é %d e o salário é %f", idade , salario);
			System.out.println("A idade é" + idade + "e o salário é" + salario);
			
			// %s = String          %f = float e double   
			// %d = int             %c = char
			double valor = 8.7;
			System.out.printf("Valor %.2f",valor);
			
			
			System.out.println("\n\n");
//			Comparação de texto
			String senha = "1234";
			if(senha.equals("1234")) { //senha == "1234"
				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Acesso Negado");
			}
			
			String palavra = "java";
			String palavra2 = "java";
			if(palavra.equals(palavra2)) {
				System.out.println("foi");
			} else {
				System.out.println("Não foi");
			}
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Informe uma palavra");
			String resposta = scanner.next();
			
			if(resposta.equalsIgnoreCase("Java")) {
				System.out.println("Acertou");
			}
	
	}
	

}
