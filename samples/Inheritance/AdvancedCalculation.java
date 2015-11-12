package Inheritance;

public class AdvancedCalculation extends BasicCalculation {

   int z;

   public void multiply(int x, int y) {
      z = x * y;
      System.out.println(x + " * " + y + " = " + z);
   }

   public void divide(int x, int y) {
      z = x / y;
      System.out.println(x + " / " + y + " = " + z);
   }
   
}  
