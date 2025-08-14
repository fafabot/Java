package primeiroProjeto;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		     // 5 - Calculadora de área de círculo
	            System.out.println("\nDigite em metros o raio do circulo: ");
	            double raio = scanner.nextDouble();
	            double raio2 = Math.pow(raio,2);
	            double area = (3.14159/raio2);
	            System.out.printf("A área do circulo é: %.2f",area,"m²");
	            System.out.printf("A área do circulo é: %.2f",area,"m²");
		    }
		}