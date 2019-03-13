package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Dizionario {

	private List<Word> parole = new LinkedList<Word>();
	private String alfabeto= "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,k,z";

	public List<Word> getParole() {
		return parole;
	}

	public Dizionario() {
		this.parole = parole;
	}

	public void addParola(String parolaAliena, String traduzione) {
		
		if(parole.size() >= 1) {
		for(Word w: parole) {
			if(w.equals(parolaAliena) && !w.getTraduzione().contains(traduzione)) {
				w.setTraduzione(traduzione);
				return;
			}
		}
		
		}
		parole.add(new Word(parolaAliena,traduzione));
	}
	
	public String translate(String s) {
		
		String paroleT="";
		
		if(s.contains("?")) {
			for(Word w: parole) {
				if(this.replace(s).contains(w.getParolaAliena()))
					paroleT+= w.getTraduzione()+", ";
			}
		}
		if(!paroleT.equals(""))
			return "Possibili traduzioni: " +paroleT.substring(0,paroleT.length()-2);
		
		if(parole.size() >= 1) {
		for(Word w: parole) {
			if(w.getParolaAliena().equals(s))
				return w.getTraduzione();
		}
		}
		return null;
	}
	
	public List<String> replace(String s) {
		
		String paro="";
		List<String> lista = new LinkedList<String>();
		String c[]= alfabeto.split(",");
		for(int i=0; i< 26; i++) {
			paro = s.replace("?", c[i]);
			lista.add(paro);
		}
		return lista;
	}
}
