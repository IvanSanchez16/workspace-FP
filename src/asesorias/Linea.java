package asesorias;

public class Linea
{
	private Punto origen;
	private Punto destino;
	
	public Linea()
	{
		origen=new Punto(0,0);
		destino=new Punto(1,1);	
	}
	public Linea(Punto origen, Punto destino)
	{
		this.origen=origen;
		this.destino=destino;
	}
	public void setOrigen(Punto origen)
	{
		this.origen=origen;
	}
	public void setDestino(Punto destino)
	{
		this.destino=destino;
	}
	public Punto getOrigen()
	{
		return origen;
	}
	public Punto getDestino()
	{
		return destino;
	}
}
