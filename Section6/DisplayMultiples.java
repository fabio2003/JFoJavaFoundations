/* Nome do Aluno: Fábio Vitório
* RA: 323135349
* Nome do Programa: JFo Section 6
* Data: 30/05/23
*/

import java.util.Scanner;

class DisplayMultiples{
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("\nDigite um número: ");
    int numero = scanner.nextInt();

    System.out.print("\n");
    
    for (int i = 1; i <= 12; i++) {
      int multiplo = numero * i;
      System.out.println(numero + " x " + i + " = " + multiplo);
    }
    
    scanner.close();
  }
}