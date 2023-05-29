import java.util.Scanner;

class JFo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("* COR * ");
    System.out.print("-> Informe um número: ");
    int numero = input.nextInt();
    
    if (numero >= 380 && numero < 450) {
      System.out.print("-> Violeta");
    }else if (numero >= 450 && numero < 495) {
      System.out.print("-> Azul");
    }else if (numero >= 495 && numero < 570) {
      System.out.print("-> Verde");
    }else if (numero >= 570 && numero < 590) {
      System.out.print("-> Amarelo");
    }else if (numero >= 590 && numero < 620) {
      System.out.print("-> Laranja");
    }else if (numero >= 620 && numero <= 750) {
      System.out.print("-> Vermelho");
    }else {
      System.out.print("-> Cor inválida");
    }

    System.out.println("\n\n* SEMÁFORO * ");
    System.out.print("-> Informe a cor: ");
    String corAtual = input.next();

    if(corAtual.equalsIgnoreCase("Vermelho")) {
       System.out.print("-> Próxima cor: Verde");
    }else if (corAtual.equalsIgnoreCase("Verde")) {
       System.out.print("-> Próxima cor: Amarelo");
    }else if (corAtual.equalsIgnoreCase("Amarelo")) {
       System.out.print("-> Próxima cor: Vermelho");
    }else {
      System.out.print("-> Cor inválida");
    }
  }
}