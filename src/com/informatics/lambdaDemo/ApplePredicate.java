package com.informatics.lambdaDemo;

public interface ApplePredicate {
	boolean test(Apple a);
	

}



class GreenApplepredicate implements ApplePredicate{

	@Override
	public boolean test(Apple a) {
		return a.getColor().equals("green");
	}
	
}

class HeavyAppplelepredicate implements ApplePredicate{

	@Override
	public boolean test(Apple a) {
		return a.getWeight() > 100;
	}
	
}
