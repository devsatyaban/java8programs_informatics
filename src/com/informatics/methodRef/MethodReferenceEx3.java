package com.informatics.methodRef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceEx3 {

	public static void main(String[] args) {
		
		List<User> users = Arrays.asList(new User("Satyaban", "Rath"),
			      new User("Kuresh", "Prusty"), new User("Rathnakar", "Acharya"));
		MyDemoComparator comparator = new MyDemoComparator();
			  //System.out.println(users);
			  
			  //method reference to instance method of existing object
				Comparator<User> c = (s1,s2) ->  1;   
				//Collections.sort(users, c);
			  Collections.sort(users, comparator::compareByFirstName);
			  for(User user : users) {
				  
				  System.out.println(user.getFirstName());
			  }
			  //users.forEach(System.out::println);

	}

}
class MyDemoComparator {
	  public  Integer compareByFirstName(User first, User second) {
	    return first.getFirstName().compareTo(second.getFirstName());
	  }
	  public int compareByLastName(User first, User second) {
	    return first.getLastName().compareTo(second.getLastName());
	}
}