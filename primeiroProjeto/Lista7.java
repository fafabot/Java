package primeiroProjeto;

import java.util.Scanner;

public class Lista7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Classificação de Filme
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		if(idade<16 || idade>70) {
		    System.out.println("Classificação especial\n");
		} else {
			System.out.println("Classificação regular\n");
		}
				
		System.out.println("------------------------------------------\n");

		//2 - Promoção de Produto
		System.out.println("Qual o valor do produto? ");
		int valor = scanner.nextInt();
		System.out.println("Qual a quantidade? ");
		int quantidade = scanner.nextInt();
		double total=valor*quantidade;
		if(total>200 && quantidade>5) {
			System.out.println("Você ganhou 15% de desconto.");
			System.out.printf("Valor final da compra: R$ %.2f%n", total*0.85, "\n");
		} else {
			System.out.printf("Você não ganhou desconto. Valor final da compra: R$ %.2f%n", total, "n");
		}
		
		System.out.println("------------------------------------------\n");
		
		//3 - Alerta de Saúde
	    System.out.print("Qual a sua frequência cardíaca (em bpm): ");
	    double bpm = scanner.nextDouble();
	    System.out.print("Você sente tontura?? (sim/não) ");
	    String temSintomas = scanner.next();
	    if (bpm >= 38 || temSintomas.equalsIgnoreCase("sim")) {
	        System.out.println("Recomenda-se procurar um médico.\n");
	    } else {
	        System.out.println("Sem sinais preocupantes.\n");
	    }
	    
	    System.out.println("------------------------------------------\n");
	    
	    //4 - Participação em Concurso
	    System.out.print("Você é residente do estado? (sim ou não): ");
	    String residente = scanner.next();
	    System.out.print("Qual a sua idade? ");
	    int idade2 = scanner.nextInt();
	    if (idade2 >= 18 && idade2 <=30 && residente.equalsIgnoreCase("sim")) {
	       System.out.println("Elegível para o concurso.\n");
	    } else {
	       System.out.println("Não elegível para o concurso.\n");
	    }
	     
	    System.out.println("------------------------------------------\n");
		
		//5 - Recompensa por Desempenho
	    System.out.print("Digite o número de projetos concluídos: ");
	    int projetos = scanner.nextInt();	        
	    System.out.print("Digite o número de erros reportados: ");
	    int erros = scanner.nextInt();
	    if (projetos > 10 && erros < 3) {
	        System.out.println("Recompensa concedida\n");
	    } else {
	        System.out.println("Sem recompensa\n");
	    }

	    //6 - Autorização para Viagem
        System.out.print("Qual sua idade? ");
        int idadeViagem = scanner.nextInt();
        System.out.print("Você possui passaporte válido? (sim ou não): ");
        String passaporte = scanner.nextLine();
        if (idadeViagem >= 18 && passaporte.equalsIgnoreCase("sim")) {
            System.out.println("Viagem autorizada.\n");
        } else {
            System.out.println("Viagem não autorizada.\n");
        }

        System.out.println("------------------------------------------\n");

        //7 - Aprovação em Curso Online
        System.out.print("Qual a nota final? (0 a 100): ");
        int nota = scanner.nextInt();
        System.out.print("Quantas aulas você assistiu? (0 a 50): ");
        int aulas = scanner.nextInt();
        if (nota >= 70 && aulas >= 40) {
            System.out.println("Aprovado.\n");
        } else {
            System.out.println("Reprovado.\n");
        }

        System.out.println("------------------------------------------\n");

        //8 - Controle de Irrigação
        System.out.print("Qual a umidade do solo? (%): ");
        int umidade = scanner.nextInt();
        System.out.print("Qual a temperatura? (°C): ");
        int temperatura = scanner.nextInt();
        if (umidade < 30 || temperatura > 30) {
            System.out.println("Irrigação necessária.\n");
        } else {
            System.out.println("Irrigação não necessária.\n");
        }

        System.out.println("------------------------------------------\n");

        //9 - Inscrição em Feira Profissional
        System.out.print("Qual sua idade? ");
        int idadeFeira = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("Você possui experiência prévia? (sim ou não): ");
        String experiencia = scanner.nextLine();
        if (idadeFeira >= 20 && idadeFeira <= 40 && experiencia.equalsIgnoreCase("sim")) {
            System.out.println("Inscrição aceita.\n");
        } else {
            System.out.println("Inscrição não permitida.\n");
        }
	}

}
