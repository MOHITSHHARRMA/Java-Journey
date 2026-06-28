/*
 * Program: Multilevel Inheritance in Java
 *
 * Definition:
 * Multilevel Inheritance is a type of inheritance in which a class
 * inherits another child class. It forms a chain of inheritance.
 *
 * Calc -> Advcalc -> Veryadvcalc
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

class Veryadvcalc extends Advcalc {

    public int power(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
}

public class Demo {

    public static void main(String[] args) {

        Veryadvcalc obj = new Veryadvcalc();

        int r1 = obj.add(5, 5);
        int r2 = obj.sub(90, 50);
        int r3 = obj.multi(56, 32);
        int r4 = obj.divide(70, 10);
        int r5 = obj.power(4, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
