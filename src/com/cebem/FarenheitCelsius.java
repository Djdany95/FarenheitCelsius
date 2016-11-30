package com.cebem;

import java.util.*;

public class FarenheitCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		char opc;
		byte flag = 0;

		do {
			System.out.println("  Conversor de Temperaturas");
			System.out.println("------------------------------");
			System.out.println("c- Celsius a Farenheit");
			System.out.println("f- Farenheit a Celsius");
			cadena = sc.nextLine();
			opc = cadena.charAt(0);

			if (opc == 'c') {
				System.out.println("Conversor de Celsius a Farenheit ");
				System.out.println("Introduzca grados Celsius: ");
				double cent = sc.nextInt();
				double faren = 32 + ((9 * cent) / 5);
				System.out.println(cent + " Grados Celsius son: " + faren + " Grados Farenheit.");
				flag = 0;
			} else if (opc == 'f') {
				System.out.println("Conversor de Farenheit a Celsius");
				System.out.println("Introduzca grados Farenheit: ");
				double faren = sc.nextInt();
				double cent = (faren - 32) * 5 / 9;
				System.out.println(faren + " Grados Farenheit son: " + cent + " Grados Celsius.");
				flag = 0;
			} else {
				System.out.println("Error, Introduzca c o f.");
				System.out.println("");
				flag = 1;
			}
		} while (flag == 1);
	}

}
