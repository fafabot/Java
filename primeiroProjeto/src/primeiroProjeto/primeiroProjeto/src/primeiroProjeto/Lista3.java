package primeiroProjeto;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // 1 - Resultado de dois números
        	System.out.println("Digite o primeiro número: ");
        	int num1 = scanner.nextInt();
        	System.out.println("Digite o segundo número: ");
        	int num2 = scanner.nextInt();
        
        	int soma = num1+num2;
        	
        	System.out.println("Soma: " + soma);
        
        	
        // 2 - Divisão e Resto
        	System.out.println("\nDigite o primeiro número: ");
        	int numdiv1 = scanner.nextInt();
        	System.out.println("Digite o segundo número (não pode ser zero para divisão): ");
        	int numdiv2 = scanner.nextInt();
        
        	double divisao = numdiv1/numdiv2;
        	int resto = numdiv1%numdiv2;
        	
        	if (num2 != 0) {
        		System.out.println("Divisão: " + divisao);
        		} else {
        			System.out.println("Não é possível dividir por zero!");
        		}
        	System.out.println("Resto: " + resto);
        
        	
        // 3 -Perímetro de um triângulo
        	System.out.println("\nDigite o valor da Hipotenusa: ");
            double hipo = scanner.nextDouble();
            System.out.println("Digite o valor do Cateto Adjacente: ");
            double ca = scanner.nextDouble();
            System.out.println("Digite o valor do Cateto Oposto: ");
            double co = scanner.nextDouble();
            
            double prt = hipo+ca+co;
            
            System.out.println("O perímetro do triângulo é: "+prt);
        
            
        // 4 - Calculadora de Gorjeta
            System.out.println("\nDigite o valor da conta: ");
            double conta = scanner.nextDouble();

            System.out.println("Digite a porcentagem de gorjeta desejada: ");
            double porcentagem = scanner.nextDouble();

            double gorjeta = conta * (porcentagem / 100);
            double total = conta + gorjeta;

            System.out.printf("Valor da gorjeta: R$ %.2f%n", gorjeta);
	        System.out.printf("Total a pagar: R$ %.2f%n", total);
            
        // 5 - Calculadora de área de círculo
            System.out.println("\nDigite em metros o raio do circulo: ");
            double raio = scanner.nextDouble();
            double raio2 = Math.pow(raio,2);
            double area = (3.14159/raio2);
            String area2 = String.format("%.2f", area);
            System.out.println("A área do circulo é: "+area2+"m²");
            
        // 6 - Conversor de idade em dias
            System.out.println("\nDigite sua idade em anos: ");
            int anos = scanner.nextInt();
            System.out.println("Digite os meses adicionais: ");
            int meses = scanner.nextInt();
            System.out.println("Digite os dias adicionais: ");
            int dias = scanner.nextInt();

            int totalDias = (anos * 365) + (meses * 30) + dias;

            System.out.println("Você viveu aproximadamente " + totalDias + " dias.");
    		
    	// 7 - Calculadora de pagamento por hora
            System.out.println("\nDigite a quantidade de horas que trabalhadas: ");
    		double hora =  scanner.nextDouble();
    		System.out.println("Agora, informe qual valor pago por hora: ");
    		double pagamento = scanner.nextDouble();
    		
    		double salario = hora * pagamento;
    		double imposto = salario * 0.10;
    		double salarioLiquido = salario - imposto;
    		
    		System.out.println("Seu salário bruto é: " + salario);
    		System.out.println("Seu salário com impostos é: "+ salarioLiquido);
	}
}
            