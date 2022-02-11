package com.simplilearn.ecommerce;

public class OS {

	private long osId;
	private String name;
	public OS() {}
	public OS( String name) {
		this.osId = 0;
		this.name = name;
	}
	public long getOsId() {
		return osId;
	}
	public void setOsId(long osId) {
		this.osId = osId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
