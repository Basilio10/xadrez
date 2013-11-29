package br.edu.ifes.poo2.xadrez.factory.peca;

public class FactoryPecaBranca extends AbstractFactoryPeca {

	@Override
	public Peca criarPeca(TipoPeca tipoPeca) {
		if(tipoPeca.equals(TipoPeca.peao))
		{
			return new PecaPeao(Color.branca);
		}
		else
		{
			if(tipoPeca.equals(TipoPeca.torre))
			{
				return new PecaTorre(Color.branca);
			}
			else
			{
				if(tipoPeca.equals(TipoPeca.cavalo))
				{
					return new PecaCavalo(Color.branca);
				}
				else
				{
					if(tipoPeca.equals(TipoPeca.bispo))
					{
						return new PecaBispo(Color.branca);
					}
					else
					{
						if(tipoPeca.equals(TipoPeca.rainha))
						{
							return new PecaRainha(Color.branca);
						}
						else
						{
							return new PecaRei(Color.branca);
						}
					}
				}
			}
		}
	}


}
