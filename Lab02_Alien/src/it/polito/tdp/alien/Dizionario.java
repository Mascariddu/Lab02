package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Dizionario {

	private List<Word> parole = new LinkedList<Word>();

	public List<Word> getParole() {
		return parole;
	}

	public Dizionario() {
		this.parole = parole;
	}

	public void addParola(String parolaAliena, String traduzione) {
		
		if(parole.size() >= 1) {
		for(Word w: parole) {
			if(w.equals(parolaAliena) /*&& !w.getTraduzione().contains(traduzione)*/) {
				w.setTraduzione(traduzione);
				return;
			}
		}
		
		}
		parole.add(new Word(parolaAliena,traduzione));
	}
	
	public String translate(String s) {
		
		if(parole.size() >= 1) {
		for(Word w: parole) {
			if(w.getParolaAliena().equals(s))
				return w.getTraduzione()/*.substring(0,w.getTraduzione().length()-2)*/;
		}
		}
		return null;
	}
}
