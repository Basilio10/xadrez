package br.edu.ifes.poo2.xadrez.facade.jogo;


import java.util.ArrayList;
import java.util.List;








import br.edu.ifes.poo2.xadrez.composite.tabuleiro.MontarTabuleiro;
import br.edu.ifes.poo2.xadrez.composite.tabuleiro.Tabuleiro;
import br.edu.ifes.poo2.xadrez.factory.jogador.*;
import br.edu.ifes.poo2.xadrez.factory.peca.AbstractFactoryPeca;
import br.edu.ifes.poo2.xadrez.factory.peca.Color;
import br.edu.ifes.poo2.xadrez.factory.peca.FactoryPecaBranca;
import br.edu.ifes.poo2.xadrez.factory.peca.FactoryPecaPreta;
import br.edu.ifes.poo2.xadrez.factory.peca.Peca;
import br.edu.ifes.poo2.xadrez.factory.peca.PecaBispo;
import br.edu.ifes.poo2.xadrez.factory.peca.PecaPeao;
import br.edu.ifes.poo2.xadrez.factory.peca.TipoPeca;

public class Jogo 
{
	private List<Jogador> jogadores;
	private List<Peca> pecaPreta;
	private List<Peca> pecaBranca;
	private Tabuleiro tabuleiro;
	
	
	public List<Jogador> CriarJogador(TipoJogador player1,TipoJogador player2)
	{
		this.jogadores = new ArrayList<Jogador>();
		if((player1.equals(TipoJogador.JOGADOR_HUMANO) && player2.equals(TipoJogador.JOGADOR_MAQUINA))||
				(player2.equals(TipoJogador.JOGADOR_HUMANO) && player1.equals(TipoJogador.JOGADOR_MAQUINA)))
		{
			AbstractFactoryJogador jogador = new FactoryJogadores();
			this.jogadores.add(jogador.criarJogador(TipoJogador.JOGADOR_HUMANO));
			this.jogadores.add(jogador.criarJogador(TipoJogador.JOGADOR_MAQUINA));
			return  this.jogadores;
		}
		else
		{
			AbstractFactoryJogador jogador = new FactoryJogadores();
			this.jogadores.add(jogador.criarJogador(TipoJogador.JOGADOR_HUMANO));
			this.jogadores.add(jogador.criarJogador(TipoJogador.JOGADOR_HUMANO));
			return  this.jogadores;
		}
	}
	
	public void CriarPecas(List<Peca> peca,Color color)
	{
		AbstractFactoryPeca pecas;
		if(color.equals(Color.BRANCO))
		{
			pecas = new FactoryPecaBranca();
			pecas.criarPeca(peca);
		}
		else
		{
			pecas = new FactoryPecaPreta();
			pecas.criarPeca(peca);
		}
		
	}
	
	public Tabuleiro[][] CriarTabuleiro()
	{
		this.tabuleiro = new MontarTabuleiro();
		return this.tabuleiro.CriarTabuleiro();
	}
	
	
	public void montarTabuleiro(Tabuleiro[][] tabuleiro,List<Peca>pecaPreta,List<Peca>pecaBranca)
	{
		for(int i = 0; i < 6; i++)
		{
			if(pecaBranca.get(i).toString().equals("PecaPeao"))
			{
				
				tabuleiro[1][0].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][1].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][2].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][3].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][4].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][5].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][6].adicionarPeca(pecaBranca.get(i).create());
				tabuleiro[1][7].adicionarPeca(pecaBranca.get(i).create());
			}
			else 
			{
				if(pecaBranca.get(i).toString().equals("PecaTorre"))
				{
					tabuleiro[0][0].adicionarPeca(pecaBranca.get(i).create());
					tabuleiro[0][7].adicionarPeca(pecaBranca.get(i).create());
				}
				else
				{
					if(pecaBranca.get(i).toString().equals("PecaBispo"))
					{
						tabuleiro[0][2].adicionarPeca(pecaBranca.get(i).create());
						tabuleiro[0][5].adicionarPeca(pecaBranca.get(i).create());
					}
					else
					{
						if(pecaBranca.get(i).toString().equals("PecaCavalo"))
						{
							tabuleiro[0][1].adicionarPeca(pecaBranca.get(i).create());
							tabuleiro[0][6].adicionarPeca(pecaBranca.get(i).create());
						}
						else
						{
							if(pecaBranca.get(i).toString().equals("PecaRainha"))
							{
								tabuleiro[0][3].adicionarPeca(pecaBranca.get(i).create());
							}
							else
							{
								tabuleiro[0][4].adicionarPeca(pecaBranca.get(i).create());
							}
						}
					}
				}
			}
		}
	}
		
		
		
		


	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public List<Peca> getPecaPreta() {
		return pecaPreta;
	}

	public List<Peca> getPecaBranca() {
		return pecaBranca;
	}

	
}

