package com.demo.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Watches {

	@Id

	private int watchId;

	private String brandName;

	private String watchType;

	private String bandType;

	private String waterResistant;

	private int price;

	public Watches() {};

	public Watches(int watchId, String brandName, String watchType, String bandType, String waterResistant,

			int price) {

		super();

		this.watchId = watchId;

		this.brandName = brandName;

		this.watchType = watchType;

		this.bandType = bandType;

		this.waterResistant = waterResistant;

		this.price = price;

	}

	public int getWatchId() {
		return watchId;
	}

	public void setWatchId(int watchId) {
		this.watchId = watchId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getWatchType() {
		return watchType;
	}

	public void setWatchType(String watchType) {
		this.watchType = watchType;
	}

	public String getBandType() {
		return bandType;
	}

	public void setBandType(String bandType) {
		this.bandType = bandType;
	}

	public String getWaterResistant() {
		return waterResistant;
	}

	public void setWaterResistant(String waterResistant) {
		this.waterResistant = waterResistant;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
