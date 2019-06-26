package asesorias;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		/*
		int[] Arreglo= {8,6,7,1,2,12,6};
		int mayor=Arreglo[0];
		for(int i=1;i<Arreglo.length;i++) {
			if(Arreglo[i]>mayor)
				mayor=Arreglo[i];
		}
		System.out.println("el mayor es: "+mayor);
		*/
		String[] Nombres= new String[5];
		for(int i=0;i<Nombres.length;i++) {
			System.out.println("Nombre #"+(i+1));
			Nombres[i]=S.next();
		}
		
		for(int i=0;i<Nombres.length;i++) {
			for(int j=i;j<Nombres.length;j++) {
				if(Nombres[i].compareToIgnoreCase(Nombres[j])>0) {
					String aux=Nombres[j];
					Nombres[j]=Nombres[i];
					Nombres[i]=aux;
				}
			}
		}
		
		for(int i=0;i<Nombres.length;i++)
			System.out.println(Nombres[i]);
			
	}

}
