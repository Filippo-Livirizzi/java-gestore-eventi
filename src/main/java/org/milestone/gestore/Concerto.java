package org.milestone.gestore;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.lang.Math;



public class Concerto extends Evento{
	
	protected double price;
	LocalTime ora = LocalTime.now();
	 SimpleDateFormat formatOra = new SimpleDateFormat("HH:mm:ss");
	

	public  Concerto(String titolo, LocalDate data, int numeroPostiTotale) {
		super(titolo, data, numeroPostiTotale);
		this.ora = ora;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	//-------------formatto il prezzo utilizzando "Math.round(x)" che arrotonda x al numero più vicinino
	 double formatPrice = Math.round(price);
	
	
	
	
	@Override
	public String toString(){
		
		return titolo + data + formatPrice + formatOra ;
	}
	

}
