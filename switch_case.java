import java.util.Scanner;

public class switch_case {
    public static void main ( String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button 1 to 3: ");
        int button = sc.nextInt();

        switch(button){
            case 1 :
                System.out.println("hello");
                break;
            case 2 :
                System.out.println("namaste");
                break;
            case 3 :
                System.out.println("bonjour");
            default :
                System.out.println("enter valid button");
        }
    }
}
