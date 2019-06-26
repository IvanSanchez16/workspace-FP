package asesorias;

public class Asesorias {

	public static void main(String[] args) 
	{
		Punto origen=new Punto();
		Punto destino=new Punto(3,4);
		System.out.println("La coordenada x del punto origen es :"+origen.getX());
		System.out.println("La coordenada y del punto origen es :"+origen.getY());
		System.out.println("La coordenada x del punto destino es :"+destino.getX());
		System.out.println("La coordenada y del punto destino es :"+destino.getY());
		Linea linea=new Linea(origen,destino);
		
		System.out.println("La distancia de la linea es : "+distancia(linea));
		

	}
	public static double distancia(Linea linea1)
	{
		double distancia, x1, y1;
		x1=linea1.getDestino().getX()-linea1.getOrigen().getX();
		y1=linea1.getDestino().getY()-linea1.getOrigen().getY();
		distancia=Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2));
		return distancia;
	}
}
