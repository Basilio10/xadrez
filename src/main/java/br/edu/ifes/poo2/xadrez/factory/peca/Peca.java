package br.edu.ifes.poo2.xadrez.factory.peca;

public interface Peca extends Cloneable
{
	public int getPeca();
	public void move();
	public Color getColor();
	public Peca create();
}
