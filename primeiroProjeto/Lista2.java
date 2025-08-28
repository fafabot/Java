package primeiroProjeto;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        // 1 - Resultado de dois números
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número (não pode ser zero para divisão): ");
        double num2 = scanner.nextDouble();
        
        double soma = num1+num2;
        double sub = num1-num2;
        double mult = num1*num2;
        double div = num1/num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        if (num2 != 0) {
            System.out.println("Divisão: " + div);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }
        
        // 2 - Cálculo de temperatura
        System.out.println("\nInforme a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        // 3 - Conversão de valor
        System.out.println("\nInforme o valor em reais: ");
        double real = scanner.nextDouble();
        double dolar = real / 5.70;
        System.out.println("Valor em dólar: " + dolar);
        
        // 4 - Área do retângulo
        System.out.println("\nInforme a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("Área do retângulo: " + area);
        
        // 5 - Conversor de idade
        System.out.println("\nInforme sua idade em anos: ");
        int idade = scanner.nextInt();
        int meses = idade * 12;
        System.out.println("Você viveu aproximadamente " + meses + " meses.");
        
        // 6 - Conversor de minutos para segundos
        System.out.println("\nInforme um tempo em minutos: ");
        int minutos = scanner.nextInt();
        int segundos = minutos * 60;
        System.out.println("Isso equivale a " + segundos + " segundos.");
        
        // 7 - Custo da compra
        System.out.println("\nInforme o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Informe a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        double custoTotal = preco * quantidade;
        System.out.println("O custo total da compra é: R$ " + custoTotal);
        
        // 8 - Divisão de uma conta de restaurante
        System.out.println("\nInforme o valor total da conta: ");
        double conta = scanner.nextDouble();
        System.out.println("Informe o número de pessoas: ");
        int pessoas = scanner.nextInt();
        double valorPorPessoa = conta / pessoas;
        System.out.println("Cada pessoa deve pagar R$ " + valorPorPessoa);
        
        // 9 - Cálculo de troco
        System.out.println("\nInforme o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.println("Informe o valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();
        double troco = valorPago - valorCompra;
        System.out.println("O troco é: R$ " + troco);
    	}
	}

