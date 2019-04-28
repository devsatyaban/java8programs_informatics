package com.informatics.lambdaDemo;

public class Apple {
	private String color;
	private float weight;
	
	Apple(String color, float weight){
		this.color = color;
		this.weight = weight;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "color:"+color+",weight:"+weight;
	}
	
}
