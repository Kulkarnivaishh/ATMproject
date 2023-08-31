package com.jbk;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int atmnumber=12345;
	int atmpin=123;
	Scanner sc=new Scanner(System.in);
	System.out.println("Emter ATM number:");
	
	int atmnumber1=sc.nextInt();
	System.out.println("Enter pin:");
	int pin=sc.nextInt();
	if(atmnumber==atmnumber&&(atmpin==pin)){
		System.out.println("Validtion done");
	}
	else {
		System.out.println("incorrect atm number or pin");
	}
}
}
