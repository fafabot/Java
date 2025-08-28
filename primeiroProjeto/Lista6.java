package primeiroProjeto;

import java.util.Scanner;

public class Lista6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Intervalo numérico
		System.out.println("Digite um número qualquer: ");
		int num = scanner.nextInt();
		if(num<=20 && num>=10) {
			System.out.println("Número dentro do intervalo\n");
		} else {
			System.out.println("Número fora do intervalo\n");
		}
		
		System.out.println("------------------------------------------\n");
		
		//2 - Acesso à festa
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você tem ingresso? (true/false): ");
		boolean ingresso = scanner.nextBoolean();

		if(idade >= 18 && ingresso) {
		    System.out.println("Entrada Permitida\n");
		} else {
		    System.out.println("Entrada Negada\n");
		}
		
		System.out.println("------------------------------------------\n");
		
		//3 - Categoria de esporte
		System.out.println("Qual sua idade? ");
		int idade2 = scanner.nextInt();
		if(idade2<18 || idade2>60) {
		    System.out.println("Categoria normal\n");
		} else {
			System.out.println("Categoria especial\n");
		}
				
		System.out.println("------------------------------------------\n");
				
		//4 - Desconto no produto
		System.out.println("Qual o valor da compra? ");
		int valor = scanner.nextInt();
		System.out.println("Você tem ingresso? (true/false): ");
		String pagamento = scanner.next();
		if(valor > 100 && pagamento.equalsIgnoreCase("avista")) {
			System.out.println("Você ganhou 10% de desconto\n");
		} else {
			System.out.printf("Você não ganhou desconto. Valor final da compra: R$ %.2f%n", valor);
		}
		
		System.out.println("------------------------------------------\n");
		
		// 5 - Triagem médica
	    System.out.print("Qual sua temperatura corporal? (ex: 37.5) ");
	    double temperatura = scanner.nextDouble();
	    scanner.next();
	        
	    System.out.print("Você tem sintomas como tosse ou dor de cabeça? (sim/não) ");
	    String temSintomas = scanner.next();
	        
	    if (temperatura >= 38 || temSintomas.equalsIgnoreCase("sim")) {
	        System.out.println("Recomenda-se procurar um médico.\n");
	    } else {
	        System.out.println("Sem sinais preocupantes.\n");
	    }
	    
	    System.out.println("------------------------------------------\n");
		
		 // 6 - Votação
	     System.out.print("Qual a sua idade? ");
	     int idade3 = scanner.nextInt();
	        
	     System.out.print("Você é brasileiro? (sim/não) ");
	     String nacionalidade = scanner.next();
	        
	     if (idade3 >= 16 && nacionalidade.equalsIgnoreCase("sim")) {
	        System.out.println("Você pode votar.\n");
	     } else {
	        System.out.println("Não pode votar.\n");
	     }
	     
	     System.out.println("------------------------------------------\n");
	     
	    // 7 - Bônus de funcionário
	     System.out.print("Quantas horas extras você fez? ");
	     int horasExtras = scanner.nextInt();
	        
	     System.out.print("Quantas faltas você teve? ");
	     int faltas = scanner.nextInt();
	        
	     if (horasExtras > 20 && faltas < 5) {
	        System.out.println("Parabéns, você ganhou o bônus!\n");
	     } else {
	        System.out.println("Infelizmente, você não se qualificou para o bônus.\n");
	     }

	    System.out.println("------------------------------------------\n");
	     
	    // 8 - Autorização para dirigir
	    System.out.print("Qual a sua idade? ");
	    int idade4 = scanner.nextInt();
	        
	    System.out.print("Você possui carteira de motorista? (sim/não) ");
	    String possuiCarteira = scanner.next();
	        
	    if (idade4 >= 18 && possuiCarteira.equalsIgnoreCase("sim")) {
	        System.out.println("Você pode dirigir.\n");
	    } else {
	        System.out.println("Não pode dirigir.\n");
	    }

	    // 9 - Elegibilidade para Bolsa de Estudos
	    System.out.print("Digite a nota média do aluno (0 a 10): ");
	    double notaMedia = scanner.nextDouble();
	        
	    System.out.print("Digite a frequência do aluno (0 a 100%): ");
	    int frequencia = scanner.nextInt();
	        
	    if (notaMedia >= 8.0 && frequencia >= 80) {
	        System.out.println("Bolsa concedida.\n");
	    } else {
	        System.out.println("Bolsa não concedida.\n");
	    }
	    
	    System.out.println("------------------------------------------\n");
	    
	    // 10 - Verificação de Temperatura Ambiente
	    System.out.print("Digite a temperatura atual em °C: ");
	    double temperatura1 = scanner.nextDouble();
	        
	    System.out.print("Digite a umidade atual em %: ");
	    double umidade = scanner.nextDouble();
	        
	    if ((temperatura1 < 18 || temperatura1 > 26) && umidade > 60) {
	        System.out.println("Ajustar climatização.\n");
	    } else {
	        System.out.println("Climatização não necessária.\n");
	    }
	}

}
