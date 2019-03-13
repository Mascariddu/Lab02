package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Word {

	private String parolaAliena;
	private List<String> traduzione = new LinkedList<String>();
	//private String traduzione;
	
	public Word(String parolaAliena, String traduzione) {
		this.parolaAliena = parolaAliena;
		this.traduzione.add(traduzione);
		//this.traduzione = traduzione;
		// 6 car8ino
	}
	
	public String getParolaAliena() {
		return parolaAliena;
	}
	
	public void setParolaAliena(String parolaAliena) {
		this.parolaAliena = parolaAliena;
	}
	
	public String getTraduzione() {
		String s="";
		if(traduzione.size() >= 1) {
		for(String p: traduzione)
			s+= p +", ";
		}
		return s.substring(0,s.length()-2);
		//return this.traduzione;
	}
	
	public void setTraduzione(String traduzione) {
		this.traduzione.add(traduzione);
		//this.traduzione = traduzione;
	}
	
	public boolean equals(String s) {
		if(s.equals(parolaAliena))
			return true;
		else return false;
	}
}
