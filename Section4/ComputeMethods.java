public class ComputeMethods{
    
  public static double fahrenheitToCelsius(double _fahrenheit){
    double celsius = (_fahrenheit - 32) * 5 / 9;
    return celsius;
  }

  public static double hypotenuse(int a, int b){
    double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    return hipotenusa;
  }

}