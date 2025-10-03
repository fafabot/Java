package primeiroProjeto;

public class Lista18 {

	public static void main(String[] args) {
		apresentacao();
        separador();
        frase();
        separador();
        imprimirValores();
        separador();
        mostrarVogais();
        separador();
        quadrado();
        separador();
        numerosPares();
        separador();
        contagemRegressiva();
        separador();
        triangulo();
        separador();
        diasSemana();
    }

    // 1 – Apresentação
    public static void apresentacao() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("FAFABOTTTT!!!!");
        }
    }

    // 2 – Exibindo uma frase
    public static void frase() {
        System.out.println("if you, ever start to wonderrr, why all the rain and all the thunder follows her arround.");
    }

    // 3 – Imprimindo valores
    public static void imprimirValores() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 4 – Mostrando as vogais
    public static void mostrarVogais() {
        System.out.println("A E I O U");
    }

    // 5 – Desenhando um quadrado
    public static void quadrado() {
        for(int i = 0; i < 5; i++) {
            System.out.println("* * * * *");
        }
    }

    // 6 – Imprimindo números pares
    public static void numerosPares() {
        for(int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    // 7 – Exibindo uma contagem regressiva
    public static void contagemRegressiva() {
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");
    }

    // 8 – Desenhando um triângulo
    public static void triangulo() {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9 – Mostrando os dias da semana
    public static void diasSemana() {
        System.out.println("Segunda-feira");
        System.out.println("Terça-feira");
        System.out.println("Quarta-feira");
        System.out.println("Quinta-feira");
        System.out.println("Sexta-feira");
        System.out.println("Sábado");
        System.out.println("Domingo");
    }

    // Função separadora (extra)
    public static void separador() {
        System.out.println("--------------------");
    }
}