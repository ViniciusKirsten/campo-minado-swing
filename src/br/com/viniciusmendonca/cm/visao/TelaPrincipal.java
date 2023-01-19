package br.com.viniciusmendonca.cm.visao;

import javax.swing.JFrame;

import br.com.viniciusmendonca.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16,13,100);//(16,13)480 quadrados
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null); // centralizar a tela sem nenhuma referencia
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //fechar assim que cliclar no "x"
		setVisible(true);
	}
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
