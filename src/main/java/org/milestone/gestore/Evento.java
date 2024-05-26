package org.milestone.gestore;


import java.time.LocalDate;




public class Evento {
	protected String titolo;
	protected LocalDate data;
	protected int postiTotali;
	protected int postiPrenotati = 0;

	public Evento(String titolo, LocalDate data, int postiTotali) {
		this.titolo = titolo;
		this.postiPrenotati = 0;
		this.postiTotali = postiTotali;
		this.data = data;

		  if(postiTotali<0) {
			  System.out.println("il numero dei posti non può essere negativo");
		  }
		  else {
			  this.postiTotali = postiTotali;
		  }
				 
	}

	//-------------------GETTERS AND SETTERS---------------------------
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getpostiTotali() {
		return postiTotali;
	}

	public int getpostiPrenotati() {
		return postiPrenotati;
	}

	//----------------------------------------------------------------

	
	//-------------DATA-----------------------------------------------
	public boolean dataValida() {
		LocalDate oggi = LocalDate.now();
		return !data.isBefore(oggi);
	}
    //-----------------------------------------------------------------
	
	
	//-------------COSTRUTTORI PRENOTA E DISDICI-----------------------
	public void prenota() {
		if(postiPrenotati >= postiTotali) {
			System.out.println("Mi dispiace l'evento è pieno");
		}
	}
	
	public void disdici() {
		if (postiPrenotati<= 0 ) {
			System.out.println("Non risultano prenotazioni");
		}
	}
	//----------------------------------------------------------------
	
	
	@Override
	public String toString() {
		return titolo + " "+ data;
		
	}
		
}
	
	
