package asesorias;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int N=S.nextInt();
		if(N%3==0)
			System.out.println("es multiplo de 3");
		else 
			System.out.println("no es multiplo de 3");
	}

}
