package br.com.generation.telasamigaveis;

import javax.swing.JOptionPane;

public class TelaAmigavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite umnúmero inteiro: "));
		
		if (numero > 4) {
			JOptionPane.showMessageDialog(null, "O número é maior que 4");
		}else {
			JOptionPane.showMessageDialog(null, "O número é menor que 4");
		}

	}

}
