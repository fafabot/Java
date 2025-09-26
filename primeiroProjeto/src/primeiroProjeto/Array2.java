package primeiroProjeto;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] idade = new int [5];
		idade[0]=20;
		idade[1]=22;
		idade[2]=16;
		idade[3]=30;
		idade[4]=40;
		System.out.println(idade[3]);
		
		Scanner sc = new Scanner(System.in);
		double[] salario = new double[3];
		for(int i=0; i<salario.length; i++) {
			System.out.print("salario "+i+":");
			salario[i] = sc.nextDouble();
			
		}

	}

}
