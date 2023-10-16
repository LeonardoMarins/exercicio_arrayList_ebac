package br.com.ebac;
import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		int saida = 1;
		
		while(saida != 0) {
			String continuar = JOptionPane.showInputDialog("digite 1 para continuar e 0 para sair");
			int continuarI = Integer.parseInt(continuar);
			if(continuarI == 1) {
				String entrada = JOptionPane.showInputDialog("digite o seu nome e o seu sexo se é F ou M separado por ,");
				String[] entradaComSplit = entrada.split(",");
				if(entradaComSplit[1].equalsIgnoreCase("m")) {
					JOptionPane.showMessageDialog(null, "O " + entradaComSplit[0] + " e  do sexo masculino");
				}else {
					JOptionPane.showMessageDialog(null, "A " + entradaComSplit[0] + " e do sexo femenino");
				}
			}else {
				saida = 0;
			}
		}
		
		
		
	}

}
