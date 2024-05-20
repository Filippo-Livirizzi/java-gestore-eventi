package org.milestone.gestore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*
 * 
-	titolo
-	data
-	numero di posti in totale
-	numero di posti prenotati

 */
public class Evento {
	private String titolo;
	private LocalDate date;
	private int postiTotali;
	private int postiPrenotati = 0;
	


	
	public Evento() {
		this.titolo = titolo;
		this.postiPrenotati = postiPrenotati;
		this.postiTotali = postiTotali;
		this.date = date;
			    
		//-------------DATA-----------------------
	
		LocalDate ld = LocalDate.now(); // data non formattata
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date = ld.format(formatDate);
		System.out.println(date); //data formattata
	    //----------------------------------------

		
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	/*
	 * aggiunge uno ai posti prenotati.
	 *  Se l’evento è già passato o non ha posti disponibili deve restituire un messaggio di avviso
	 */
	
	public void prenota() {
		if(postiPrenotati >= postiTotali) {
			System.out.println("Mi dispiace l'evento è pieno");
		} else {
		this.postiPrenotati++;
		}
	}
	/*
	 * disdici: riduce di uno i posti prenotati. 
	 * Se l’evento è già passato o non ci sono prenotazioni restituisce un messaggio di avviso.
	 */
	public void disdici() {
		if (postiPrenotati<= postiTotali ) {
			System.out.println("Non risultano prenotazioni");
		}else {
			postiPrenotati--;
		}	
	}
	
	@Override
	public String toString() {
		return titolo + date;
		
	}
		
}
	
	
