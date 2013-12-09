package br.edu.ifes.poo2.xadrez.composite.tabuleiro;

import br.edu.ifes.poo2.xadrez.factory.peca.Peca;

public class MontarTabuleiro extends Tabuleiro {

	private Tabuleiro[][] tabuleiro = new Casa[8][8]; 
	
	
	public void adicionarPeca(Peca peca) 
	{
		
	}
	
	
	public Tabuleiro[][] CriarTabuleiro()
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				this.tabuleiro[i][j] = new Casa();
			}
		}
		return tabuleiro;
	}

}
