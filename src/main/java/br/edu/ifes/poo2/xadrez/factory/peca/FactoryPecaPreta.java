package br.edu.ifes.poo2.xadrez.factory.peca;


import java.util.List;

public class FactoryPecaPreta extends AbstractFactoryPeca 
{

	@Override
	public void criarPeca(List<Peca> peca){
		
		
		peao = new PecaPeao(Color.PRETO);
		bispo = new PecaBispo(Color.PRETO);
		cavalo = new PecaCavalo(Color.PRETO);
		rainha = new PecaRainha(Color.PRETO);
		rei = new PecaRei(Color.PRETO);
		torre = new PecaTorre(Color.PRETO);
		
		peca.add(peao);
		peca.add(torre);
		peca.add(bispo);
		peca.add(cavalo);
		peca.add(rainha);
		peca.add(rei);
		
	}


}
