package br.edu.ifes.poo2.xadrez.factory.jogador;

public class FactoryJogadores extends AbstractFactoryJogador {

	public Jogador criarJogador(TipoJogador jogador) {
		if(jogador.equals(TipoJogador.JOGADOR_HUMANO))
		{
			return new JogadorHumano();
		}
		else
		{
			return new JogadorMaquina();
			
		}
	}

}
