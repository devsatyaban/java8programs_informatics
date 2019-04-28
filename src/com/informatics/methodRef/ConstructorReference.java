package com.informatics.methodRef;

import java.util.function.BiConsumer;

public class ConstructorReference {

	public static void main(String[] args) {
		 /**** Using Lambda Expression ****/
        System.out.println("--------------------Using Lambda Expression----------------------");
        BiConsumer<Integer, Integer> addtion1 = (a, b) -> new MathOperations(a, b);
        addtion1.accept(10, 20);
 
        /**** Using Method Reference ****/
        System.out.println("\n---------------------Using Method Reference---------------------");
        BiConsumer<Integer, Integer> addtion2 = MathOperations::new;
        addtion2.accept(50, 20);
	}

}
class MathOperations {
    public MathOperations(int a, int b) {
    	System.out.println("MathOperations(-,-) starts");
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }
}