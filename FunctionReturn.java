public class FunctionReturn {
    //Function with return type
    static int add ( int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {

//        int result = add(3,7); calling function after assigning in new variable
        System.out.println("Sum = " + add(4,6)); //calling function directly
    }
}
