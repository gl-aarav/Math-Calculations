import java.util.Scanner;
public class TestCalculation {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 .32
    MyCalculation calculate = new MyCalculation();
    int Operation;
    double one=0, two=0;
    System.out.println("Do you want to add-> 1, subtract-> 2, multiply-> 3, divide-> 4, Square -> 5, Cube -> 6, or Factorial -> 7");
    Operation = in.nextInt();
    System.out.println("Enter the first number");
    one = in.nextDouble();
    if (Operation<4){
    System.out.println("Enter the second number");
    two = in.nextDouble();
  }

    if (Operation == 1) {
      System.out.println("The sum is: " + calculate.add(one, two)); 

    }
    if (Operation == 2) {
      System.out.println("The difference is: " + calculate.subtract(one, two)); 
    }
    if (Operation == 3) { 
      System.out.println("The product is: " + calculate.multiply(one, two));
    }
    if (Operation == 4) {
      System.out.println("The quotient is: " + calculate.divide(one, two)); 
    }
    if (Operation==5){
      System.out.println("The squared result is: " + calculate.Square(one)); 
    }
    if (Operation==6){
      System.out.println("The cubed result is: " + calculate.Cube(one)); 
    }
    if (Operation==7){
      System.out.println("The factorial result is: " + calculate.Factorial(one)); 
    }


  }

}