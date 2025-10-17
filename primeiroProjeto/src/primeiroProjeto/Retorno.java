package primeiroProjeto;

import java.util.Scanner;

public class Retorno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(saudacao("Juliana"));
		linha();
		int resultado = numeroFavorito();
		System.out.println(resultado);
		linha();
		int dobro = dobro(7);
		System.out.println("O dobro é: "+dobro);
		linha();
		System.out.println("Qual seu salario? ");
		double salario = sc.nextDouble();
		System.out.println("Qual foi o seu aumento de salário? ");
		double aumento = sc.nextDouble();
		
		double novoSalario = aumento(salario, aumento);
		System.out.println("Novo salário: R$ "+novoSalario);

	}
	public static void linha() {
		System.out.println("-------------------------------------------------");
	}
	public static String saudacao(String nome) {
		return "Olá "+nome;
	}
	public static int numeroFavorito() {
		return 5;
	}
	public static int dobro(int numero) {
		return numero*2;
	}
	public static double aumento(double sal, double aum) {
		double novoSalario = sal + aum;
		return novoSalario;
	}
	
	
}