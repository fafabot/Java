package primeiroProjeto;

import java.util.Scanner;

public class FuncaoParametro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		saudacao("Rafael");
		saudacao("Júlia");
		repetir("Senai", 5);

	}
	
	public static void saudacao(String nome) {
		System.out.println("Olá " + nome);
	}
	
	public static void repetir(String texto, int vezes) {
		for(int i = 1; i <= vezes; i++) {
			System.out.println(texto);
		}
	}
	public static void classificacao(int idade) {
		if (idade <= 12) {
			System.out.println("Criança");
		} else {
			System.out.println("Não é criança");
		}
	}

}