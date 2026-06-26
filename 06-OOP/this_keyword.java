// // Definition of 'this' Keyword:
// The 'this' keyword is a reference variable that refers to
// the current object of a class. It is mainly used to
// differentiate instance variables from method parameters
// having the same name.

// Example:
// this.name = name;

// Here,
// Left Side  -> Instance Variable (Current Object)
// Right Side -> Method Parameter

// Why use 'this'?
// ✔ Refers to the current object.
// ✔ Resolves naming conflicts between instance variables
//    and method parameters.
// ✔ Improves code readability.
// ✔ Can also be used to invoke constructors and methods
//    of the current class (Advanced Concepts).

// //

class Student {

    // ==========================
    // Private Data Members
    // ==========================
    private int rollNo;
    private String name;
    private double marks;

    // ==========================
    // Getter Method
    // Returns the student's name.
    // ==========================
    public String getName() {
        return name;
    }

    // ==========================
    // Setter Method
    // Assigns a value to the name variable.
    // 'this.name' refers to the instance variable.
    // ==========================
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Roll Number
    public int getRollNo() {
        return rollNo;
    }

    // Setter for Roll Number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for Marks
    public double getMarks() {
        return marks;
    }

    // Setter for Marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class GetterSetterDemo {

    public static void main(String[] args) {

        // Creating an object of Student class
        Student obj = new Student();

        // Setting values using Setter methods
        obj.setName("MOHIT SHARMA");
        obj.setRollNo(304);
        obj.setMarks(85.5);

        // Displaying values using Getter methods
        System.out.println("Name      : " + obj.getName());
        System.out.println("Roll No   : " + obj.getRollNo());
        System.out.println("Marks     : " + obj.getMarks());
    }
}

