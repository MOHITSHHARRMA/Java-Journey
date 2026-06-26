

What is Encapsulation?
- Encapsulation means hiding the data of a class.
- Data members are made private.
- They can only be accessed using Getter and Setter methods.

Getter  -> Used to retrieve (read) data.
Setter  -> Used to modify (write) data.
*/

class Human {

    // Private data members (Cannot be accessed directly outside the class)
    private int age;
    private String name;

    // Setter Method
    // Used to assign/update the value of age.
    public void setAge(int age) {
        this.age = age;   // 'this.age' refers to the instance variable.
    }

    // Getter Method
    // Used to return the value of age.
    public int getAge() {
        return age;
    }

    // Setter Method
    // Used to assign/update the value of name.
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method
    // Used to return the value of name.
    public String getName() {
        return name;
    }
}

public class GetterSetterDemo {

    public static void main(String[] args) {

        // Creating an object of Human class.
        Human obj = new Human();

        // Setting values using Setter methods.
        obj.setAge(22);
        obj.setName("MOHIT SHARMA");

        // Retrieving values using Getter methods.
        System.out.println("Age  : " + obj.getAge());
        System.out.println("Name : " + obj.getName());
    }
}
