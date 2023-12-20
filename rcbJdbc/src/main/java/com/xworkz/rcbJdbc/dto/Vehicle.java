package com.xworkz.rcbJdbc.dto;

public class Vehicle {

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private String color;
	private String type;
	private int model;

	public Vehicle(int id, String name, String color, String type, int model) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.type = type;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public int getModel() {
		return model;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", color=" + color + ", type=" + type + ", year=" + model + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + model;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (model != other.model)
			return false;
		return true;
	}

}
