package asesorias;

import java.util.Random;

public class Ejercicio10 {
	
	public static void main(String a[]) {
		int [][] M=new int [5][6];
		Random R=new Random();
		int suma=0, sumafilas;
		for(int i=0;i<M.length;i++) {
			sumafilas = 0;
			for(int j=0;j<M[0].length;j++) {
				M[i][j]=R.nextInt(10)+1;
				System.out.print(M[i][j]+"\t");
				suma+=M[i][j];
				sumafilas += M[i][j];  
			}
			System.out.println(" = "+sumafilas);
		}
		System.out.println(suma);
	}
}