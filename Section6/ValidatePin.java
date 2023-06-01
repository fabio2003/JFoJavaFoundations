/* Nome do Aluno: Fábio Vitório
* RA: 323135349
* Nome do Programa: JFo Section 6
* Data: 30/05/23
*/

import java.util.Scanner;

class ValidatePin{
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int pinCorreto = 1234; 
    boolean pinValido = false;
    
    while (!pinValido) {
      System.out.print("\nDigite o seu PIN: ");
      int pinInserido = scanner.nextInt();
        
      if (pinInserido == pinCorreto) {
        pinValido = true;
        System.out.println("\n-> PIN válido. Acesso permitido!");
      } else {
        System.out.println("\n-> PIN inválido. Tente novamente.");
      }
    }
    scanner.close();
  }
}