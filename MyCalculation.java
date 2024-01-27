public class MyCalculation extends Calculation {

  public double Square(double a) {
    return a*a;

  }
  public double Cube(double a){
    return a*a*a;
  }
  public int Factorial(double a){
    int fact = 1;
    for(int i = 1; i <= a; i++){
      fact = fact * i;
    }
    return fact;  
  }

}
