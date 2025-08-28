package primeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você tem ingresso? (true/false): ");
		boolean ingresso = scanner.nextBoolean();

		if(idade >= 18 && ingresso) {
		    System.out.println("Entrada Permitida");
		} else {
		    System.out.println("Entrada Negada");
		}
		
		System.out.println("------------------------------------------");
		
        System.out.println("Qual sua nota? (0 a 10)");
        double nota = scanner.nextDouble();
        
        System.out.println("Qual sua frequencia? (0 a 100)");
        int frequencia = scanner.nextInt();
        
        if (nota >= 7 || frequencia >= 75) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        System.out.println("------------------------------------------");
        
        //Para logar o usuário precisa responder uma serie de perguntas, *se ele é adm e se está logado
        System.out.println("É admin? (true/false)");
        boolean admin = scanner.nextBoolean();

        System.out.println("Está Logado? (true/false)");
        boolean logado = scanner.nextBoolean();

        if (admin && logado) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso Negado");
        }
        
        System.out.println("------------------------------------------");
        
        //Peça uma letra para o usuário, se ela for A, E, I, O ou U *mostre "vogal", senão, mostre "consoante"
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        // Converte a letra para minúscula para facilitar a comparação
        char letraMinuscula = Character.toLowerCase(letra);

        if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        
	}

}