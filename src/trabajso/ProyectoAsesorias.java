package trabajso;
import java.util.Scanner;
import java.util.Random;
public class ProyectoAsesorias {
/*
 * Martin
 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random aleatorio = new Random(System.currentTimeMillis());
		int suma = 0, c = 1, contador = 0, primos = 0, pares = 0, impares = 0;
		double producto = 1;
		int[] numero = new int[100];
		System.out.println("Ingrese la cantidad de numeros a generar:");
		int cantidad = s.nextInt();

		for(int i = 0; i < cantidad; i++)
		{
			contador = 0;
			numero[i] = aleatorio.nextInt(100)+1;
			System.out.println("Numero " + c + ": " + numero[i]);
			suma += numero[i];
			producto *= numero[i];
			c += 1;
			if(numero[i] % 2 == 0)
			{
				pares += 1;
			}
			else
			{
				impares += 1;
			}
			for(int j = 1; j <= numero[i]; j++)
			{
				if((numero[i] % j) == 0)
				{
					contador++;
				}
			}
			if(contador <= 2)
			{
				primos += 1;
			}



		}
		System.out.println("La suma de todos los numeros  es: " + suma);
		System.out.println("El producto de todos los numeros es: " + producto);
		System.out.println("La cantidad de numeros primos es " + primos);
		System.out.println("La cantidad de numeros pares es " + pares);
		System.out.println("La cantidad de numeros impares es " + impares);






	}

}
