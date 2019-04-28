package com.informatics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",68000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        // 1 filtering with legacy approach
       /* List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  
	*/
    
        //2 filtering and mapping <filter takes Predicate( boolean test<T t> , map takes Function (R apply <T t>
        List<Product> productPriceList2 =productsList.stream()  
                .filter(p -> p.price < 30000)// filtering data  
                //.map(p->p.name)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
System.out.println(productPriceList2);  
        









        //3 filtering and iterating
        productsList.stream()  
        .filter(product -> product.price == 30000)  
        .forEach(product -> System.out.println(product.name));    
	
	}

}
