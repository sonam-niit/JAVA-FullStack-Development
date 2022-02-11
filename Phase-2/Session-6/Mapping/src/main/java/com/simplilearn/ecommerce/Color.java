package com.simplilearn.ecommerce;

public class Color {

	private long colorId;
	private String name;
	
	public Color() {}

	public Color(String name) {
		this.colorId = 0;
		this.name = name;
	}

	public long getColorId() {
		return colorId;
	}

	public void setColorId(long colorId) {
		this.colorId = colorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
