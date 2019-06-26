/*
    Eric Leonardo Hernandez Flores
    Fecha:06/12/2018
 */
package trabajso;
import java.util.Arrays;
import java.util.Random;

public class ArregloHernandezFlores {

	public static void main(String[]args){
		int[]arreglo=new int[10];
		Random rnd=new Random();
		int suma=0;
		long mul=1;
		long mulSum=0;
		int cont=0;
		int contPrimos=0;
		int contPar=0;
		int contImpar=0;

		//ingresa los valores
		for(int i=0;i<arreglo.length;i++){
			arreglo[i]=rnd.nextInt(100)+1;
		}//sumando todo el areglo
		for(int j=0;j<arreglo.length;j++){
			suma=arreglo[j]+suma;
		}       //no entiendo la segunda
		for(int a=0;a<arreglo.length;a++){
			mul=arreglo[a]*mul;   
			mulSum=mul+mulSum;
		}

		//numeros primos
		for (int p=0;p<arreglo.length;p++){       
			for (int q=2;q<arreglo[p];q++){
				if (arreglo[p]%q == 0){// cuenta si resulta 0 mas de 3 veses
					cont = cont+1;// al contar que se divide suma un contador
				}
			}
			if (cont < 1) {
				contPrimos++;              
			}   
			cont=0;
		}

		//par e impar
		for (int z=0;z<arreglo.length;z++){
			if (arreglo[z]%2 == 0){
				contPar = contPar+1;
			}
			else{contImpar++;}
		}
		System.out.println("el areglo contiene");
		System.out.println(Arrays.toString(arreglo));
		Arrays.sort(arreglo);
		System.out.println("el areglo ordenado");
		System.out.println(Arrays.toString(arreglo));
		System.out.println("la suma de todo el arreglo es de "+suma);
		System.out.println("la multiplicación del producto de los arreglo es de "+mulSum);
		System.out.println("La cantidad de numeros primos son de "+contPrimos);
		System.out.println("La cantidad de numeros par es de "+contPar);
		System.out.println("La cantidad de numeros Impar es de "+contImpar);
	}
}
