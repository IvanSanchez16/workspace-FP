package asesorias;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int N,N1=0,Mayor;
		System.out.println("Cuantos números se compararan");
		N=S.nextInt();
	    Mayor=0;
		int c=0;
		
		while(c<N) {
			System.out.println("Ingrese número "+(c+1));
			N1=S.nextInt();
			if(Mayor<N1) {
				Mayor=N1;
			}
			c=c+1; //c++; //c+=1;
		}
		
		System.out.println("El mayor es: "+Mayor);
	}

}
