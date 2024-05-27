package org.milestone.gestore;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 



public class Concerto extends Evento{
	
	private double prezzo;
	LocalTime ora = LocalTime.now();
	

	public  Concerto(String titolo, LocalDate data, int postiTotali) {
		super(titolo, data, postiTotali);
		this.ora = ora;
		this.prezzo = (double)(Math.random() * 1000);  
	 
	}

	//-------------------GETTERS AND SETTERS---------------------------
	
	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	
	//----------------------------------------------------------------
	
	
	
	
	
	

	//-------------------DATA, ORA e PREZZO FORMATTATA-----------------------
	public String formatted() {
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter oraFormatter = DateTimeFormatter.ofPattern("HH:mm");
	return getData().format(dataFormatter) + " " + ora.format(oraFormatter);
	
	}
	
	//formattazione della stringa. "%.2f€" indica che il prezzo deve essere formattato con un numero con due cifre decimali
	   public String getPrezzoFormattato() {
	        return String.format("%.2f€", prezzo);
	    }
	//---------------------------------------------------------------
	
	@Override
	public String toString(){
		
		return formatted() + " - " + getTitolo() + " - " + getPrezzoFormattato();
	}
	

}
