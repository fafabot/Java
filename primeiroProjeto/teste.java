package primeiroProjeto;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner	scanner = new Scanner(System.in);

			System.out.print("Digite uma letra: ");
	        char letra = scanner.next().toLowerCase().charAt(0);

	        if (letra == 'a') {
	            System.out.println("É uma vogal.");
	        } else {
	            System.out.println("Não é vogal.");
	        }
	}

}
