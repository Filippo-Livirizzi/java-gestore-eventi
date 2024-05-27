package org.milestone.gestore;

import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {

	private String titolo;
	private List<Evento> eventi; 
	
	public ProgrammEventi(String titolo){
		this.titolo = titolo;
		this.eventi = new ArrayList<>();
	}

	//-------------------GETTERS AND SETTERS---------------------------
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	//----------------------------------------------------------------
	
	//-------------------------un metodo che aggiunge alla lista un Evento-------------------
	public void aggiungiEvento (Evento evento, Concerto concerto) {
		eventi.add(evento);
		eventi.add(concerto);
	}
	//---------------------------------------------------------------------------------------

	//-----------------------un metodo che restituisce quanti eventi sono presenti nel programma---------------------------------
	
	public void totEventi() {
		System.out.println("Gli eventi presenti sono in totale: " + eventi.size() );
		
		//ciclo for che stampa il contenuto dell'array
		for (int i = 0; i < eventi.size(); i++) {
		      System.out.println("I nomi degli eventi sono: " + eventi.get(i));
		    }
	}
	//---------------------------------------------------------------------------------------------------------------------------
	
	//----------------------un metodo che svuota la lista di eventi--------------------------------------------------------------
	
	public void stopEventi () {
		System.out.println("Tutti gli eventi sono stati cancellati.");
		eventi.clear();
		System.out.println("totale eventi presenti: " + eventi.size());
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

}

