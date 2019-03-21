package com.project;

public class Projector {

	String maker;
	String model;
	int size;
	String color;

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Projector(String maker, String model, int size, String color) {
		super();
		this.maker = maker;
		this.model = model;
		this.size = size;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Projector [maker=" + maker + ", model=" + model + ", size=" + size + ", color=" + color + "]";
	}

}
