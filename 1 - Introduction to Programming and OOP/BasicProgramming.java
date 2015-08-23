public class HelloWorld {
  public static void main(String args[]) {
    //Output using System.out.println
    System.out.println("Hello, world!");

    /* The following lines will show
    how to declare variables and assign values to them*/

    int age = 21;
    double tempetature = 98.6;
    String name = "John Doe";

    System.out.println("My name is" + name);
    System.out.println("I am " + age + "years old.");

    //The following lines will show how to perform mathematical operations

    int a = 11;
    int b = 7;
    int sum = a + b;
    int difference = a - b;
    int product = a * b;
    int remainder = a % b;

    //The following lines show how to perform more decimally accurate math operations

    double x = 147.65;
    double y = 71;
    double quotient = x / y;

    System.out.println("The sum of " + a + " and " + b + " is " + sum);
    System.out.println("The difference between " + a + " and " + b + " is " + difference);

  }
}
