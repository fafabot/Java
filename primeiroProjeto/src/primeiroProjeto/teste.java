package primeiroProjeto;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 6 - Tipo de Ingresso
        System.out.println("Digite o código do ingresso (1=Inteira, 2=Meia-entrada, 3=VIP): ");
        int ingresso = scanner.nextInt();

        switch (ingresso) {
            case 1:
                System.out.println("Preço: R$50,00");
                break;
            case 2:
                System.out.println("Preço: R$25,00");
                break;
            case 3:
                System.out.println("Preço: R$100,00");
                break;
            default:
                System.out.println("Ingresso inválido");
        }

        // 7 - Escolha de Idioma
        System.out.println("\nDigite o código do idioma (1=Português, 2=Inglês, 3=Espanhol): ");
        int idioma = scanner.nextInt();

        switch (idioma) {
            case 1:
                System.out.println("Saudação: Olá!");
                break;
            case 2:
                System.out.println("Saudação: Hello!");
                break;
            case 3:
                System.out.println("Saudação: Hola!");
                break;
            default:
                System.out.println("Idioma inválido");
        }

        // 8 - Nível de Acesso
        System.out.println("\nDigite o código do nível (1=Usuário, 2=Moderador, 3=Administrador): ");
        int nivel = scanner.nextInt();

        switch (nivel) {
            case 1:
                System.out.println("Permissões: Acesso básico");
                break;
            case 2:
                System.out.println("Permissões: Acesso básico + edição");
                break;
            case 3:
                System.out.println("Permissões: Acesso total");
                break;
            default:
                System.out.println("Nível inválido");
        }

        // 9 - Tipo de Pagamento
        System.out.println("\nDigite o código de pagamento (1=Dinheiro, 2=Cartão de Crédito, 3=Pix): ");
        int pagamento = scanner.nextInt();

        switch (pagamento) {
            case 1:
                System.out.println("Pagamento em dinheiro confirmado");
                break;
            case 2:
                System.out.println("Pagamento com cartão processado");
                break;
            case 3:
                System.out.println("Pagamento via Pix realizado");
                break;
            default:
                System.out.println("Método inválido");
        }

        scanner.close();
    }
}
