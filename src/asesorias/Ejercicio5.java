package asesorias;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int n1,n2,n3,d;
		Scanner S=new Scanner(System.in);
		n1=S.nextInt();
		n2=S.nextInt();
		if(n1<n2) {
			n3=n2;
			n2=n1;
			n1=n3;
		}
		d=n1-n2;
		System.out.println("La diferencia es: "+d);
			
		
	}

}
