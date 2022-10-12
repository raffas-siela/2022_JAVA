package ObiektyJava;

public class Calculator {
   public void addition(int firstNumber, int secondNumber) {
      System.out.println("suma tych liczb to: " + (firstNumber+secondNumber));
   }
   public void subtration(int firstNumber, int secondNumber) {
      System.out.println("odejmowanie tych liczb to: " + (firstNumber-secondNumber));
   }
   public void multiplication(int firstNumber, int secondNumber) {
      System.out.println("mnożenie tych liczb to: " + (firstNumber*secondNumber));
   }
   public void division(int firstNumber, int secondNumber) {
      System.out.println("dzielenie tych liczb to: " + (firstNumber/secondNumber));
   }
   public void modulo(int firstNumber, int secondNumber) {
      System.out.println("modulo tych liczb to: " + (firstNumber%secondNumber));
   }
}
