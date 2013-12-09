package br.edu.ifes.poo2.xadrez.factory.peca;


import java.util.List;



public class FactoryPecaBranca extends AbstractFactoryPeca {

	@Override
	public void criarPeca(List<Peca> peca) {
		
		
		peao = new PecaPeao(Color.BRANCO);
		bispo = new PecaBispo(Color.BRANCO);
		cavalo = new PecaCavalo(Color.BRANCO);
		rainha = new PecaRainha(Color.BRANCO);
		rei = new PecaRei(Color.BRANCO);
		torre = new PecaTorre(Color.BRANCO);
		
		peca.add(peao);
		peca.add(torre);
		peca.add(bispo);
		peca.add(cavalo);
		peca.add(rainha);
		peca.add(rei);
		
	}



}
