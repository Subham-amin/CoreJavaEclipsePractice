package com.Nongeneric;

public class Nongeneric {

	Object object;

	public Nongeneric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nongeneric(Object object) {
		super();
		this.object = object;
	}

	public Object getObct() {
		return object;
	}

	public void setOb(Object object) {
		this.object = object;
	}

	void showType() {
		System.out.println("Type of the object is " + object.getClass().getName());
	}
}
