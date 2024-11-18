package com.calderon.device;

public class Main {

	public static void main(String[] args) {
		System.out.println( "START. Empieza el programa");
		System.out.println();
		
		Device device1 = new Device("Frigorífico","Fagor",399.99D);
		System.out.println(device1.toString());
		System.out.println();
		
		Mobile mobile1 = new Mobile("F300", "Samsung", 300.00D, "a1");
		System.out.println(mobile1.toString());
		System.out.println();
		
		Computer computer1 =new Computer ("Bang&OLufsen", "HP", 700.99, "INTEL");
		System.out.println(computer1.toString());
		System.out.println();
		
		System.out.println( "Acaba el programa. END");

	}

}
