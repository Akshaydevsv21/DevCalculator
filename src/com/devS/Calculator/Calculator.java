package com.devS.Calculator;

import javax.swing.JFrame;

public class Calculator {
	
	public Calculator() {
		JFrame js=new JFrame("Calculator");
		js.setLayout(null);
		js.setSize(700, 700);
		js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		js.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
	}
}
