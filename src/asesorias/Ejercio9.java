package asesorias;

import java.util.Scanner;

public class Ejercio9 {

	//static String S="Hola";
	public static void main(String[] a) {
		/*
		int[] arreglo= {1,4,7,2,9,1,6};
		int[] arreglo2= {5,8,7,3,1,4,9,8};
		int[] arreglo3= {9,3,1,6,8,3,6,2,3};
	
		ImprimirArreglo(arreglo);
		System.out.println();
		ImprimirArreglo(arreglo2);
		System.out.println();
		ImprimirArreglo(arreglo3);
		
		System.out.println("Arreglo 1 suma = "+	SumaArreglo(arreglo)	);
		System.out.println("Arreglo 2 suma = "+	SumaArreglo(arreglo2)	);
		System.out.println("Arreglo 3 suma = "+	SumaArreglo(arreglo3)	);
		
		int numero=10;
		numero=CambiarNumero(numero);
		System.out.println(numero);
		Scanner S=new Scanner(System.in);
		int [] A1=new int[10];
		int[] A2=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.print("posicion "+i+" ");
			A1[i]=S.nextInt();
		}
		for(int i=0;i<10;i++) {
			System.out.print("posicion "+i+" ");
			A2[i]=S.nextInt();
		}
		ProductosVectores(A1,A2);
		*/
		System.out.println(ContarMinusculas("Hola Mundo"));
		System.out.println(ContarMinusculas("Martin"));
		System.out.println(ContarMinusculas("FJSADNAJSDH"));
	}
	
	public static void ProductosVectores(int[] A,int[] B) {
		for(int i=0;i<A.length;i++) 
			System.out.println("El producto de la multiplicacion en la posicion "+i+"= "+(A[i]*B[i]));
	}
	
	
	public static int ContarMinusculas(String Palabra) {
		int contador=0;
		char c;
		for(int i=0;i<Palabra.length();i++) {
			c=Palabra.charAt(i);
			if(c>96 && c<123)
				contador++;
		}
		return contador;
	}
	
	
	
	
	
	public static int SumaArreglo(int[] A) {
		int suma=0;
		for(int i=0;i<A.length;i++)
			suma+=A[i];
		return suma;
	}
	
	public static void ImprimirArreglo(int[] A) {
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]);
	}
	

	public static int CambiarNumero(int n) {
		n=2000;
		return n;
	}
	
	
	
}
