package primeiroProjeto;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	contagem("Bom dia!", 5);
    	contagem("*****", 3);
        
    }
    
    public static void contagem(String frase, int vezes) {
        for (int i = 1; i <= vezes; i++) {
            System.out.println(frase);
        }
    }
}
