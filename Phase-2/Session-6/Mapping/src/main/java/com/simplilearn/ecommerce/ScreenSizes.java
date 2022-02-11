package com.simplilearn.ecommerce;

public class ScreenSizes {

	private long screenId;
	private String size;
	public ScreenSizes() {}
	public ScreenSizes(String size) {
		this.screenId = 0;
		this.size = size;
	}
	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
