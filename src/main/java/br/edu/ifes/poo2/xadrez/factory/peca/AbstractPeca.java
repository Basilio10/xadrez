package br.edu.ifes.poo2.xadrez.factory.peca;

public abstract class AbstractPeca implements Peca {

	public abstract int getPeca();

	public abstract void move();

	public abstract Color getColor();
	
	public abstract Peca create();
	
	
	
	
	
	public Object clone()
	{
		Object obj = null;
		try
		{
			obj = super.clone();
		}
		catch (CloneNotSupportedException ex)
		{
			
		}
		return obj;
	}
	
}
