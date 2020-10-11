package com.vti.entity;

public class InvValidAgeLessZero extends Exception {
	private static final long serialVersionUID = 1L;

	public InvValidAgeLessZero(String message) {
		super(message);
	}
}
