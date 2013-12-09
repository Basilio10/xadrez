import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.poo2.xadrez.facade.jogo.*;
import br.edu.ifes.poo2.xadrez.factory.jogador.TipoJogador;
import br.edu.ifes.poo2.xadrez.factory.peca.*;
public class main {

	public static void main(String[] args)
	{
		List<Peca> pecaPreta = new ArrayList<Peca>();
		List<Peca> pecaBranca = new ArrayList<Peca>();
		
		Jogo jogo = new Jogo();
		System.out.println(jogo.CriarJogador(TipoJogador.JOGADOR_HUMANO,TipoJogador.JOGADOR_MAQUINA).toString());
		jogo.CriarPecas(pecaPreta,Color.BRANCO);
		jogo.CriarPecas(pecaBranca,Color.PRETO);
		
		
		jogo.montarTabuleiro(jogo.CriarTabuleiro(),pecaBranca,pecaPreta);
		
	}

}
