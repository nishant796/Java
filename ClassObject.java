// creating Class
class car {
    String brand;
    int speed;

    //Creating method
    void drive(){
        System.out.println(brand + " is driving at speed " + speed + " km/h");
    }
}
public class ClassObject {
    public static void main(String[] args) {
        //Creating Object
        car myCar = new car();

        //Initializing the Object Properties
        myCar.brand = "BMW" ;
        myCar.speed = 120 ;

        //calling the method
        myCar.drive();

    }
}
