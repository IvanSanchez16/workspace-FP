package asesorias;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int Mayor,A,B,C,D,E;
		System.out.println("Ingrese numero A");
		A=S.nextInt();
		System.out.println("Ingrese numero B");
		B=S.nextInt();
		System.out.println("Ingrese numero C");
		C=S.nextInt();
		System.out.println("Ingrese numero D");
		D=S.nextInt();
		System.out.println("Ingrese numero E");
		E=S.nextInt();
		
		Mayor=A;
		
		if(B>Mayor) {
			Mayor=B;
		} 
		if(C>Mayor) {
			Mayor=C;
		}
		if(D>Mayor) {
			Mayor=D;
		}
		if(E>Mayor) {
			Mayor=E;
		}
		
		System.out.println("El mayor es: "+Mayor);
	}

}
