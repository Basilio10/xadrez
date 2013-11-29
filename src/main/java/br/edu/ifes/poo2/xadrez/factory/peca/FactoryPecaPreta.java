package br.edu.ifes.poo2.xadrez.factory.peca;

public class FactoryPecaPreta extends AbstractFactoryPeca 
{

	@Override
	public Peca criarPeca(TipoPeca tipoPeca) {
		if(tipoPeca.equals(TipoPeca.peao))
		{
			return new PecaPeao(Color.preta);
		}
		else
		{
			if(tipoPeca.equals(TipoPeca.torre))
			{
				return new PecaTorre(Color.preta);
			}
			else
			{
				if(tipoPeca.equals(TipoPeca.cavalo))
				{
					return new PecaCavalo(Color.preta);
				}
				else
				{
					if(tipoPeca.equals(TipoPeca.bispo))
					{
						return new PecaBispo(Color.preta);
					}
					else
					{
						if(tipoPeca.equals(TipoPeca.rainha))
						{
							return new PecaRainha(Color.preta);
						}
						else
						{
							return new PecaRei(Color.preta);
						}
					}
				}
			}
		}
	}

}
