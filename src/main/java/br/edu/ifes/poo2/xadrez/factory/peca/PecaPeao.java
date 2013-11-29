package br.edu.ifes.poo2.xadrez.factory.peca;

public class PecaPeao implements Peca 
{
	
	private final int value=1;
	private Color color;
	
	public PecaPeao(Color color)
	{
		this.setColor(color);
	}
	
	public int getPeca() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void move() {
		// TODO Auto-generated method stub

	}

	public Color getColor() {
		return this.color;
	}
	
	private void setColor(Color color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

}
