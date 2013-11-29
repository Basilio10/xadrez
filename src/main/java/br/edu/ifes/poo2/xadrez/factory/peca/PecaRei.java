package br.edu.ifes.poo2.xadrez.factory.peca;

public class PecaRei implements Peca {

	private Color color;
	private final int value=100;//e ai fazer o que?
	
	
	public PecaRei(Color color)
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

}
