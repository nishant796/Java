import java.util.Scanner;

public class if_else {
    public static void main ( String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("your are Adult");
        } else {
            System.out.println("your are not Adult");
        }

    }
}
