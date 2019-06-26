package asesorias;
import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double IVA = 10/100;
        int articulo = 0;
        double subtotal;
        double total;
        
        System.out.print("Ingrese la cantidad de artículos a comprar");
        articulo=s.nextInt();
        subtotal = articulo * 10;
        total = subtotal * IVA + subtotal;
        System.out.println("El precio de su compra es de $" +total);
        
        
               
        
    }
    
}