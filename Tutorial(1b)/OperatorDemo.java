public class OperatorDemo {
    public static void main(String[] args) {
       
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));
        System.out.println();

       
        System.out.println("Relational Operators:");
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println();

       
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
        System.out.println();

        
        System.out.println("Bitwise Operators:");
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (b >> 1));
        System.out.println();

        
        System.out.println("Assignment Operators:");
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 2; // c = c % 2
        System.out.println("c %= 2: " + c);
        System.out.println();

        // Unary Operators
        System.out.println("Unary Operators:");
        int d = 10;
        System.out.println("Original d: " + d);
        System.out.println("Pre-increment: " + (++d));
        System.out.println("Post-increment: " + (d++));
        System.out.println("After Post-increment, d: " + d);
        System.out.println("Pre-decrement: " + (--d));
        System.out.println("Post-decrement: " + (d--));
        System.out.println("After Post-decrement, d: " + d);
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b: " + max);
    }
}