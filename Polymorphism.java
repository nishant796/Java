//creating class
class Calculator {
    //passing 2 parameter in method
    int add ( int a, int b) {
        return a + b;
    }
    //passing 3 parameters in same method
    int add ( int a, int b, int c) {
        return a + b + c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        //creating object
        Calculator calc = new Calculator();

        //calling method
        System.out.println("Sum of 2 numbers: " + calc.add(5,5));
        System.out.println("Sum of 3 Numbers: " + calc.add(3,2,3));
    }
}
