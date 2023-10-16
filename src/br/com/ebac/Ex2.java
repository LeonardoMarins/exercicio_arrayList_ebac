package br.com.ebac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList();
		int saida = 1;
		
		while(saida != 0) {
			String continuar = JOptionPane.showInputDialog("quer continuar cadastrando o nome digite 1"
					+ " ou 0 para sair");
			int continuarI = Integer.parseInt(continuar);
			if(continuarI == 1) {
				String nome = JOptionPane.showInputDialog("entre com um nome");
				nomes.add(nome);
			}else {
				saida = 0;
			}
		}
		
		Collections.sort(nomes);
		for(String nome: nomes) {
			System.out.println(nomes);
		}

	}

}
