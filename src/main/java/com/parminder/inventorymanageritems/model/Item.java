package com.parminder.inventorymanageritems.model;

public class Item {
	private int id;
	private String name;
	private String description;
	private String active;
	
	public Item(int id, String name, String description, String active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}


}
