package br.edu.ifes.poo2.xadrez.factory.peca;

public class PecaPeao extends AbstractPeca
{
	
	private final int value=1;
	private Color color;
	

	public Peca create()
	{
		return (Peca) this.clone();
	}
	
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
	
	


	
	
	@Override
	public String toString()
	{
		
		String b[] = this.getClass().getName().split("\\.");
		
		return String.format("%s",b[b.length-1]);
	}
}
