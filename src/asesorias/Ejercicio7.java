package asesorias;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int Suma=0,N;
		System.out.println("Largo del arreglo");
		N=S.nextInt();
		int[] A=new int[N];
		for(int i=0;i<A.length;i++) {
			System.out.println("Ingrese #"+(i+1));
			A[i]=S.nextInt();
			Suma+=A[i];
		}
		
		System.out.println("El resultado de la suma es: "+Suma);
	}

}
