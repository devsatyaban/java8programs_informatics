package com.informatics.lambdaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo2 {

	public static void main(String[] args) {

		System.out.println("inside main");
			List<String> gamesList = new ArrayList<String>();  
			List<String> gamesList1 = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        
	        //System.out.println("------------Iterating by passing lambda expression--------------"); 
	        /*Consumer<String> c = (t5) -> {System.out.println(t5);};
	        gamesList.forEach(c);*/
	        
	        System.out.println("------------Iterating forEach--------------"); 
	        gamesList.forEach(  (games) -> {System.out.println(games);
	        								gamesList1.add(games);
	        								int y = games.length();
	        								System.out.println(y);
	        								});  
	        System.out.println(gamesList1.size());
	}

}
interface I{
	public default  void test1(){
		
	}
	public default  void test2(){
		
	}
	public static  int test3(){
	return 0;
	}
	public static  int test4(){
		return 0;
		}
}