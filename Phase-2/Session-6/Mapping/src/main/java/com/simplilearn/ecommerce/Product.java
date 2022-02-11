package com.simplilearn.ecommerce;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {

	private long id;
	private String name;
	private BigDecimal price;
	private Date dateAdded;
	private List<Color> colors;
	private Map finance;
	private Set<OS> os;
	private Collection<ScreenSizes> screenSizes;
	public Product() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public Map getFinance() {
		return finance;
	}
	public void setFinance(Map finance) {
		this.finance = finance;
	}
	public Set<OS> getOs() {
		return os;
	}
	public void setOs(Set<OS> os) {
		this.os = os;
	}
	public Collection<ScreenSizes> getScreenSizes() {
		return screenSizes;
	}
	public void setScreenSizes(Collection<ScreenSizes> screenSizes) {
		this.screenSizes = screenSizes;
	};
	
}
