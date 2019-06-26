package asesorias;

public class Punto 
{
	private int x;
	private int y;
	
	public Punto()
	{
		x=0;
		y=0;
	}
	public Punto(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int Y)
	{
		y=Y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}
