/*
 * Program: Single Inheritance in Java
 *
 * Definition:
 * Single Inheritance is a type of inheritance in which one child class
 * inherits the properties and methods of one parent class using the
 * 'extends' keyword.
 *
 * Parent Class  : Calc
 * Child Class   : Advcalc
 *
 * Features:
 * - Demonstrates code reusability.
 * - Establishes an IS-A relationship.
 * - Child class can access all public and protected members of the parent class.
 *
 * Example:
 * Advcalc extends Calc
 */

class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class Advcalc extends Calc {

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}

public class Demo {

    public static void main(String[] args) {

        Advcalc obj = new Advcalc();

        int r1 = obj.add(5, 5);
        int r2 = obj.sub(90, 50);
        int r3 = obj.multi(56, 32);
        int r4 = obj.divide(70, 10);

        System.out.println("Addition       : " + r1);
        System.out.println("Subtraction    : " + r2);
        System.out.println("Multiplication : " + r3);
        System.out.println("Division       : " + r4);
    }
}
