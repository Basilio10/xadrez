package br.edu.ifes.poo2.xadrez.factory.peca;

public abstract class AbstractFactoryPeca implements FactoryPeca {

	public abstract Peca criarPeca(TipoPeca tipoPeca);

}
