package com.example.sumar;
public class Sumar {
	private final int num1;
	private final int num2;
	
	public Sumar(int num1, int num2) {
		this.num1= num1;
		this.num2 = num2;
	}

	public int getSuma(){
		return num1+ num2;
	}

	public String getContent() {
		return "La suma de "+ num1 + " y " + num2 +" = " + this.getSuma();
	}
}