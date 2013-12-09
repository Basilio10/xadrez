package br.edu.ifes.poo2.xadrez.factory.peca;

import java.util.List;

public abstract class AbstractFactoryPeca implements FactoryPeca {
	
	protected PecaPeao peao;
	protected PecaBispo bispo;
	protected PecaCavalo cavalo;
	protected PecaRainha rainha;
	protected PecaRei rei;
	protected PecaTorre torre;
	
	public abstract void criarPeca(List<Peca> peca);
	
	

	
		
	
	
}
