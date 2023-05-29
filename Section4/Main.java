class Main {
  public static void main(String[] args) {
    
    ComputeMethods methods = new ComputeMethods();
    
    System.out.println("Temperatura em celsius é: " + 
                      methods.fahrenheitToCelsius(75)
    );

    System.out.println("\nA hypotenusa é: " + 
                      methods.hypotenuse(3, 4)
    );
  }
}