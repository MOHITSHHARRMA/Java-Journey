// Parent Class
class Animal {

    // Method of Animal class
    public void animal() {
        System.out.println("ANIMAL SPEAKS");
    }
}

// Dog class inherits Animal class
class Dog extends Animal {

    // Method specific to Dog class
    public void dog() {
        System.out.println("DOG BARKS");
    }
}

// Cat class inherits Animal class
class Cat extends Animal {

    // Method specific to Cat class
    public void cat() {
        System.out.println("CAT SPEAKS AS MEOW");
    }
}

public class Demo {

    public static void main(String args[]) {

        /*
         * Creating an object of Dog class.
         * Note:
         * - We write 'new Dog()' because objects are created from CLASSES.
         * - 'dog()' is only a method, not a class.
         * - Java is case-sensitive:
         *      Dog  -> Class Name (Capital D)
         *      dog() -> Method Name (small d)
         */
        Dog obj = new Dog();

        // Calling Dog class method
        obj.dog();

        // Calling inherited method from Animal class
        obj.animal();

        /*
         * Creating an object of Cat class.
         * Again, object is created using the class name (Cat),
         * not the method name (cat()).
         */
        Cat obj1 = new Cat();

        // Calling Cat class method
        obj1.cat();

        // Calling inherited method from Animal class
        obj1.animal();
    }
}




















1. Hierarchical Inheritance:
   One parent class is inherited by multiple child classes.

           Animal
          /      \
        Dog      Cat

2. Objects are always created using the CLASS name.
   Example:
       Dog obj = new Dog();

3. Methods are never used to create objects.
   Example:
       obj.dog();   // Correct (Method Call)

4. Java is Case-Sensitive.
   Dog  -> Class Name
   dog() -> Method Name

5. 'new' keyword is used to create an object of a class.

6. Child classes inherit all accessible methods and variables from the parent class.
