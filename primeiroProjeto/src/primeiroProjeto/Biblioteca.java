package primeiroProjeto;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	String nome;
	System.out.println("Qual o seu nome?");
	nome = scanner.nextLine();
	
	System.out.println("Olá "+nome);
	//====================================================
	double salario, aumento;
	System.out.println("Informe o salário: ");
	salario = scanner.nextDouble();
	System.out.println("Informe o aumento: ");
	aumento = scanner.nextDouble();
	
	double total = salario + aumento;
	System.out.println("O novo salário é: "+ total);
	//===================================================
	int numero;
	System.out.println("Informe um número: ");
	numero = scanner.nextInt();
	int divisao = numero / 2;
	int resto = numero % 2;
	System.out.println("Número / 2: "+ divisao);
	System.out.println("Número % 2: "+ resto);
	}
	

}
