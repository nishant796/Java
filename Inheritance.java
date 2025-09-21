//Parent Class
class Animal {
    void eat() {
        System.out.println("Animal eats food. ");
    }
}
//children class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog Bark");
    }
}
//Main class
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // creating object

        //calling method using children class
        myDog.eat();
        myDog.bark();
    }
}