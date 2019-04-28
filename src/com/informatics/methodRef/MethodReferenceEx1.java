package com.informatics.methodRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceEx1 {

	public static void main(String[] args) {
		 /**** Using Lambda Expression ****/
        System.out.println("--------------------Using Lambda Expression----------------------");
        Predicate<Integer> predicate1 = ( n) -> EvenOddCheck.isEven( n);
        System.out.println(predicate1.test(20));
 
        /**** Using Method Reference **** Reference to static method ***/
        System.out.println("\n---------------------Using Method Reference---------------------");
        Predicate<Integer> predicate2 = EvenOddCheck::isEven;
        System.out.println(predicate2.test(25));
        
       
        /**** Using Method Reference **** Reference to instance method ***/
        IDemo idemo = (s) -> s.length();
        System.out.println(idemo.test("satya"));
        IDemo idemo2 = String::length;
        System.out.println(idemo2.test("satyaban"));
        
        List<String> str = Arrays.asList("a","f","b","g");
        //str.sort((s1,s2) -> s1.compareTo(s2));
        str.sort(String :: compareTo);
        System.out.println(str);
        
	}

}

interface IDemo {
    int test(String word);
}
/*interface Predicate {
    boolean test(int n);
}*/
 
class EvenOddCheck {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
}
