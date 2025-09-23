// File: RuntimePolymorphismDemo.java

// Parent class
class Parent {
    void display() {
        System.out.println("This is the Parent class display method.");
    }
}

// Child class
class Child extends Parent {
    // Overriding display() method
    @Override
    void display() {
        System.out.println("This is the Child class display method (Overridden).");
    }
}

// Main class to test runtime polymorphism
public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        // Parent reference but Child object
        Parent obj = new Child();

        // Runtime polymorphism: which display() gets called
        // is decided at runtime (Child's method will run)
        obj.display();
    }
}
