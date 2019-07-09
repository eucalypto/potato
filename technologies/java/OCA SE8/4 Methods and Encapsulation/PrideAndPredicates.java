/*
This file is actually about lambdas, the first step to functional programming.

The one important sentence for lambdas is:

 ***Lambdas work with interfaces that have *only one* abstract method.***

Such interfaces are called "functional interface".

Lambdas (anonymous functions) are usually passed around like objects. But in
Java this is restricted: Java allows lambdas to be passed only to methods that
expect a functional interface as input parameter.

In other words: lambdas can replace an object that implements a functional
interface.
*/

public class PrideAndPredicates {
    public static void main(String[] args) {
        int[] numbers = {123, 1, 34, 43, 42, 314, 121, 88};

        // Loop over numbers and print if they are larger than 100
        for (int number : numbers) {
            printIfLargerThan(number, 100);
        }

        // On the one hand, this is general, because we can give the minimum
        // prinntable bound as a second parameter. On the other hand,
        // printIfLargerThan() is limited to this one operation.

        // Now we are doing the same loop as above, but using lambda with
        // printIfCheck().
        for (int number : numbers) {
            printIfCheck(number, n -> n > 100);
        }
        //  We could have implemented an extra checker class that implements
        //  the interface TruthChecker and given instead of the lambda.

        // This example is very unnecessary! Instead of defining an interface,
        // a member using this interface, and a lambda; we could just have
        // used the if (number > 100) in the loop itself!.

    }

    // Prints first argument if it's larger than the second one
    static void printIfLargerThan(int num, int min) {
        if (num > min) System.out.println(num);
    }

    // This method expects an int and an object implementing the interface
    // TruthChecker, and this interface enforces that this object has a method
    // called check().
    static void printIfCheck(int num, TruthChecker bacon) {
        if (bacon.check(num)) System.out.println(num);
    }

}

interface TruthChecker {
    boolean check(int num);
}

