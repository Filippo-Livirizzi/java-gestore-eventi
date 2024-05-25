package org.milestone.gestore;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;




public class Mainp {

	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		 System.out.print("Inserisci il titolo dell'evento: ");
         String titolo = input.nextLine();
         
         System.out.print("Inserisci la data dell'evento (dd/MM/yyyy): ");
         String data = input.nextLine();
         
         LocalDate dataInput = LocalDate.parse(data, formatter);
         
         
         System.out.print("Inserisci il numero di posti totali: ");
         int postiTotali = input.nextInt();
         
         
         Evento evento = new Evento(titolo, dataInput, postiTotali);
         
         if (evento.dataValida()) {
             System.out.println("La data dell'evento \"" + evento.getTitolo() + "\" è disponibile.");
         } else {
             System.out.println("La data dell'evento \"" + evento.getTitolo() + "\" è già passata.");
         }
         
        
        
         System.out.println("Evento creato! " );
         System.out.println(evento.toString() );
       
         System.out.println("il totale dei posti sono: " + evento.getpostiTotali());
         
         //---------------PRENOTA---------------
         System.out.print("Quante prenotazioni vuoi fare? ");
         input.nextInt();
         evento.prenota();
         //-------------------------------------         
         
         System.out.println("Posti prenotati: " + evento.getpostiPrenotati());
         System.out.println("Posti disponibili: " + (evento.getpostiTotali() - evento.getpostiPrenotati()));
         
         //---------------DISDICI---------------
         System.out.print("Quante prenotazioni vuoi disdire? ");
          input.nextInt();
          evento.disdici();
         //-------------------------------------
          
         System.out.println("Posti disponibili: " + (evento.getpostiTotali() - evento.getpostiPrenotati()));

         
         Concerto concerto = new Concerto(titolo, dataInput, postiTotali );

         
         System.out.println(concerto.toString());
         
         input.close();
         
	}       
	}

