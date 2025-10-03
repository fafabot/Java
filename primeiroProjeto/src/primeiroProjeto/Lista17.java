package primeiroProjeto;

import java.util.Scanner;

public class Lista17 {

	public static void main(String[] args) {
		// 1 – Criando uma matriz simples
				Scanner sc = new Scanner(System.in);
				int[][] matriz1 = new int[2][3];

				// Preenchendo a matriz
				for (int i = 0; i < 2; i++) {
				    for (int j = 0; j < 3; j++) {
				        System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				        matriz1[i][j] = sc.nextInt();
				    }
				}

				// Exibindo a matriz
				System.out.println("\nMatriz completa:");
				for (int i = 0; i < 2; i++) {
				    for (int j = 0; j < 3; j++) {
				        System.out.print(matriz1[i][j] + " ");
				    }
				    System.out.println();
				}


				// 2 – Nomes em uma tabela
				String[][] nomes = new String[3][2];
				sc.nextLine(); // limpar buffer

				for (int i = 0; i < 3; i++) {
				    for (int j = 0; j < 2; j++) {
				        System.out.print("Digite o nome da posição [" + i + "][" + j + "]: ");
				        nomes[i][j] = sc.nextLine();
				    }
				}

				System.out.println("\nTabela de nomes:");
				for (int i = 0; i < 3; i++) {
				    for (int j = 0; j < 2; j++) {
				        System.out.print(nomes[i][j] + "\t");
				    }
				    System.out.println();
				}


				// 3 – Mostrando a diagonal principal
				int[][] matriz3 = new int[3][3];

				for (int i = 0; i < 3; i++) {
				    for (int j = 0; j < 3; j++) {
				        System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				        matriz3[i][j] = sc.nextInt();
				    }
				}

				System.out.println("\nDiagonal principal:");
				for (int i = 0; i < 3; i++) {
				    System.out.println(matriz3[i][i]);
				}


				// 4 – Procurando um número
				int[][] matriz4 = new int[3][3];

				for (int i = 0; i < 3; i++) {
				    for (int j = 0; j < 3; j++) {
				        System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				        matriz4[i][j] = sc.nextInt();
				    }
				}

				System.out.print("\nDigite um número para procurar: ");
				int numero = sc.nextInt();

				boolean encontrado = false;

				for (int i = 0; i < 3; i++) {
				    for (int j = 0; j < 3; j++) {
				        if (matriz4[i][j] == numero) {
				            System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
				            encontrado = true;
				        }
				    }
				}

				if (!encontrado) {
				    System.out.println("Número não encontrado na matriz.");
				}


				// 5 – Elementos maiores que 10
				int[][] matriz5 = new int[4][3];

				for (int i = 0; i < 4; i++) {
				    for (int j = 0; j < 3; j++) {
				        System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				        matriz5[i][j] = sc.nextInt();
				    }
				}

				System.out.println("\nValores maiores que 10:");
				for (int i = 0; i < 4; i++) {
				    for (int j = 0; j < 3; j++) {
				        if (matriz5[i][j] > 10) {
				            System.out.println("[" + i + "][" + j + "] = " + matriz5[i][j]);
				        }
				    }
				}

	}

}
