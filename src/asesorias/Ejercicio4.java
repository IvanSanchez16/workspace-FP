package asesorias;

import java.util.Scanner;

public class Ejercicio4 
{

	public static void main(String[] args) 
	{
		Scanner leer=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Ingrese el primer n�mero : ");
		a=leer.nextInt();
		System.out.println("Ingrese el segundo n�mero : ");
		b=leer.nextInt();
		c=a*b;
		System.out.println("Ingrese el tercer n�mero : ");
		a=leer.nextInt();
		System.out.println("Ingrese el cuarto n�mero : ");
		b=leer.nextInt();
		d=a*b;
		
		
		if(c==d)
			System.out.println("Ambas multiplicaciones fueron iguales");
		else if(c>d)
			System.out.println("La multiplicaci�n entre el primer par de n�meros fue mayor : "+c);
		else
			System.out.println("La multiplicacion entre el segundo par de n�meros fue mayor : "+d);
	}

}
