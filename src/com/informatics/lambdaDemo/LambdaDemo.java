package com.informatics.lambdaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("red", 100),new Apple("green", 101)
				,new Apple("green", 102),new Apple("yellow", 105),new Apple("red", 110));
		
		//List<Apple> appleList = filterAppleByweight(apples, 101); //approach 1
		
		//List<Apple> appleList = filterRedApple(apples); //approach 2
		
		//List<Apple> appleList = filterApple(apples, "green"); //approach 3
		
		//using abstract methodology
		//List<Apple> appleList =  filter(apples, new GreenApplepredicate());//approach 4
		//List<Apple> appleList =  filter(apples, new HeavyAppplelepredicate());//approach 4
		
		
		//using anonymous class
		/*List<Apple> appleList =  filter(apples, new ApplePredicate() {
									@Override
										public boolean test(Apple a) {
										return "green".equals(a.getColor());
										}
										});*///approach 5
		
		//using  lambda expression
		//List<Apple> appleList = filter(apples, ( apple) -> apple.getColor().equals("green")); ////approach 6
		List<Apple> appleList = filter(apples, ( apple) -> apple.getWeight() > 102); ////approach 6
		
		//iterating through appleList 
		appleList.forEach(System.out::println);
		
	}
	
	
	public static List<Apple> filter(List<Apple> apples , ApplePredicate ap)
	{
		List<Apple> listapple = new ArrayList<Apple>();
		for(Apple a : apples){
			if(ap.test(a)) {
				listapple.add(a);
			}
			
		}
		return listapple;
	}
	public static List<Apple> filterRedApple(List<Apple> apples)
	{
		List<Apple> listapple = new ArrayList<Apple>();
		for(Apple a : apples){
			if(a.getColor().equals("red")) {
				listapple.add(a);
			}
			
		}
		return listapple;
	}
	
	public static List<Apple> filterApple(List<Apple> apples, String color)
	{
		List<Apple> listapple = new ArrayList<Apple>();
		for(Apple a : apples){
			if(a.getColor().equals(color)) {
				listapple.add(a);
			}
			
		}
		return listapple;
	}
	
	public static List<Apple> filterAppleByweight(List<Apple> apples, float weight)
	{
		List<Apple> listapple = new ArrayList<Apple>();
		for(Apple a : apples){
			if(a.getWeight() > weight) {
				
				listapple.add(a);
			}
			
		}
		return listapple;
	}

}
