package br.edu.ifes.poo2.xadrez.composite.tabuleiro;

import br.edu.ifes.poo2.xadrez.factory.peca.Peca;

public class Casa extends Tabuleiro {
	
	private Peca peca;
	
	public Casa()
	{
		this.peca=null;
	}
	
	

	@Override
	public void adicionarPeca(Peca peca) {
		this.peca = peca;
	}
	@Override
	public Tabuleiro[][] CriarTabuleiro() {
		// TODO Auto-generated method stub
		return null;
	}

}
