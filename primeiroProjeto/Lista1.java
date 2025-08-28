public class MyClass {
  public static void main(String args[]) {
      
    System.out.println("Situação 1: Cálculo para empresa\n");
    //Cálculo para empresa
    double instalacao = 300.00;
    double limpeza = 150.00;
    double manutencao = 499.99;
    double empresa = instalacao+limpeza+manutencao;
    System.out.println("A pagar para empresa: " + empresa + "\n\n");
    
    System.out.println("Situação 2: Cálculo de salário\n");
    //Cálculo de salário
    double horaria = 35.00;
    double diaria = horaria*8;
    System.out.println("Salário diário: " + diaria + "\n\n");
    
    System.out.println("Situação 3: Caixas de bombons\n");
    //Caixas de bombons 
    int cx_bombom = 27;
    int bombons = cx_bombom*16;
    System.out.println("A quantidade de bombons é " + bombons + "\n\n");
    
    System.out.println("Situação 4: Garrafas de água\n");
    //Garrafas de água
    int vendas = 300;
    int cx_garrafa = 20;
    int cxs_garrafa = vendas/cx_garrafa;
    System.out.println("A quantidade de caixas usadas é " + cxs_garrafa + "\n\n");
    
    System.out.println("Situação 5: Cálculo para camisetas\n");
    //Cálculo para camisetas 
    int camisetas1 = 120;
    int vendas_cam = 80;
    double faturamento = vendas_cam*30.00;
    int camisetas_final = camisetas1-vendas_cam;
    System.out.println("A quantidade de camisetas restantes é " + camisetas_final + " e o faturamento foi de " + faturamento + "\n\n");
    
    System.out.println("Situação 6: //Dobro e Metade\n");
    //Dobro e Metade
    double num1 = 3.00;
    double dobro = num1*num1;
    double metade = num1/2;
    System.out.println("O dobro do número escolhido é " + dobro + " e a metade é " + metade);
  }
}
 