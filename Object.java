class Calculator {
    int a;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Object {
    public static void main(String args[]) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println(result);

    }
}

// OBJECT ORIENTED PROGRAMMING
// Every Object has properties and behaviour
// for Object, first we have to create a class

// JDK = Java Development Kit
// JVM = Java Virtual Machine
// JRE = Java Runtime Environment