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
        
         
         Concerto concerto = new Concerto(titolo, dataInput, postiTotali );
     
         System.out.println("il totale dei posti sono: " + evento.getpostiTotali());
     
         ProgrammEventi programmi = new ProgrammEventi (titolo);

         programmi.aggiungiEvento(evento,concerto);
         
         
       System.out.println("[1] Fare una prenotazione ");
       System.out.println("[2] Disdire una prenotazione");
       System.out.println("[3] Informazioni sugli eventi");
       System.out.println("[4] Elimina tutti gli eventi creati");
       
       int scelta = input.nextInt();

       switch (scelta) {
         case 1 : 
         //---------------PRENOTA---------------
         System.out.print("Quante prenotazioni vuoi fare? ");
         evento.postiPrenotati = input.nextInt();
         evento.prenota();
         System.out.println("Posti prenotati: " + evento.getpostiPrenotati());
         System.out.println("Posti disponibili: " + (evento.getpostiTotali() - evento.getpostiPrenotati()));
         //------------------------------------- 
         break;
         
         case 2 : 
         //---------------DISDICI---------------
         System.out.print("Quante prenotazioni vuoi disdire? ");
         evento.postiPrenotati = input.nextInt();
          evento.disdici();
          System.out.println("Posti disponibili: " + (evento.getpostiTotali() - evento.getpostiPrenotati()));
         //-------------------------------------
          break;
          
         case 3 : 
         programmi.totEventi();
         break;
         
         case 4:
        	 programmi.stopEventi();
        	 System.out.println("Tutti gli eventi sono stati cancellati" + programmi.getEventi());
        	 break; 
         }
   
       
         input.close();
         
	}       
	}

