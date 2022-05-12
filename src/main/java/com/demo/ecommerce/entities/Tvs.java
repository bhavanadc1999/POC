package com.demo.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Tvs {

	@Id

	private int tvId;

	private String brandName;

	private String type;

	private String displayType;

	private String displaySize;

	private int price;

	public Tvs() {};

	public Tvs(int tvId, String brandName, String type, String displayType, String displaySize, int price) {

		super();

		this.tvId = tvId;

		this.brandName = brandName;

		this.type = type;

		this.displayType = displayType;

		this.displaySize = displaySize;

		this.price = price;

	}

	public int getTvId() {
		return tvId;
	}

	public void setTvId(int tvId) {
		this.tvId = tvId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
