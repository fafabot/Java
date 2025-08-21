package primeiroProjeto;

import java.util.Scanner;

public class Lista5 {

	public static void main(String[] args) {

		Scanner	scanner = new Scanner(System.in);

		   // --- Exercício 1: Classificação de Idade
		   	System.out.print("Digite a idade: ");
		       int idade = scanner.nextInt();
		       if (idade < 12) {
		    	   System.out.println("Faixa etária: Criança");
		       } else if (idade < 17) {
		           System.out.println("Faixa etária: Adolescente");
		       } else if (idade < 59) {
		           System.out.println("Faixa etária: Adulto");
		       } else {
		           System.out.println("Faixa etária: Idoso");
		       }
		       
		    // --- Exercício 2: Avaliação de Temperatura
		       System.out.print("Digite a temperatura em Celsius: ");
		       double temperatura = scanner.nextDouble();

		       if (temperatura < 10) {
		           System.out.println("Avaliação: Muito Frio");
		       } else if (temperatura < 20) {
		           System.out.println("Avaliação: Frio");
		       } else if (temperatura < 30) {
		           System.out.println("Avaliação: Agradável");
		       } else {
		           System.out.println("Avaliação: Muito Quente");
		       }

		    // --- Exercício 3: Sistema de Notas Escolares
		       System.out.print("Digite a nota (de 0 a 100): ");
		       int nota = scanner.nextInt();

		       if (nota > 90) {
		           System.out.println("Nota correspondente: A");
		       } else if (nota > 80) {
		           System.out.println("Nota correspondente: B");
		       } else if (nota > 70) {
		           System.out.println("Nota correspondente: C");
		       } else if (nota > 60) {
		           System.out.println("Nota correspondente: D");
		       } else {
		           System.out.println("Nota correspondente: F");
		       }

		    // --- Exercício 4: Verificação de Senha
		        System.out.print("Digite a senha: ");
		        String senha = scanner.next();

		        if (senha.equals("admin")) {
		            System.out.println("Acesso permitido!");
		        } else {
		            System.out.println("Acesso negado!");
		        }
		    
		     // --- Exercício 5: Comparação de Nomes
			      System.out.print("Digite o primeiro nome: ");
			      String nome1 = scanner.next();
			       
			      System.out.print("Digite o segundo nome: ");
			      String nome2 = scanner.next();
			      if (nome1.equals(nome2)) {
			           System.out.println("Os nomes são iguais.");
			      } else {
			          System.out.println("Os nomes são diferentes.");
			      }
			       
			    // --- Exercício 6: Jogo da Cor Favorita
			       System.out.print("Digite sua cor favorita: ");
			       String cor = scanner.next();
			       if (cor.equalsIgnoreCase("azul")) {
			           System.out.println("Boa escolha!");
			       } else if (cor.equalsIgnoreCase("vermelho")) {
			           System.out.println("Cor vibrante!");
			       } else if (cor.equalsIgnoreCase("verde")) {
			           System.out.println("Cor da natureza!");
			       } else {
			           System.out.println("Cor não cadastrada.");
			       }
			       
			    // --- Exercício 7: Verificação de Vogal
			       System.out.print("Digite uma letra: ");
			       String letra = scanner.next();

			       if (letra.equalsIgnoreCase("a")) {
			           System.out.println("É uma vogal.");
			       } else if (letra.equalsIgnoreCase("e")) {
			    	   System.out.println("É uma vogal.");
			       } else if (letra.equalsIgnoreCase("i")) {
			    	   System.out.println("É uma vogal.");
			       } else if (letra.equalsIgnoreCase("o")) {
			    	   System.out.println("É uma vogal.");
			       } else if (letra.equalsIgnoreCase("u")) {
			    	   System.out.println("É uma vogal.");
			       }
			       else {
			           System.out.println("Não é vogal.");
			       }

			    
		    }
		}
