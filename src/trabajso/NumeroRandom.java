package trabajso;
/*
 * Jonathan Sanchez
 */
import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		Random r = new Random();
		int random[] = new int[10];
		int suma=0;
		long multiplicacion=1;
		int par=0, impar=0;
		
		for(int i = 0; i<random.length; i++){
			random[i] = r.nextInt(100)+1;
		}
		
		int primero=random[0];		
		for(int i = 0; i<random.length; i++){
			System.out.println(random[i]);
			suma+=random[i];
			multiplicacion*=random[i];
		}
		
		System.out.println("-----------------------------------------");
		
		for(int i = 0; i<random.length; i++){
			if(random[i]%2==0){
				System.out.println("Es primo: "+random[i]);
				par++;
			}
			else{
				impar++;
			}
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("La suma de los elementos del arreglo es: "+suma);
		System.out.println("La multiplicacion de los elementos del arreglo es: "+multiplicacion);
		System.out.println("Hay " + par + " numero pares y " + impar + " numero impares");
						
	}	
}
