package org.java.lessons;

import java.util.Random;
import java.util.Scanner;

import org.java.lessons.products.Cuffie;
import org.java.lessons.products.Prodotto;
import org.java.lessons.products.Smartphone;
import org.java.lessons.products.Televisore;

public class Carrello {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		boolean isMember = false;
		System.out.print("Hai la tessera del nostro negozio? (si/no): ");
		String tessera = sc.nextLine();
		if(tessera.equals("si"))
			isMember = true;
		
		System.out.println("quanti prodotti vuoi acquistare?");
		int LNG = sc.nextInt();
		int counterProdotti = 0;
		
		Prodotto[] carrello = new Prodotto[LNG];
		
		
		
		while (counterProdotti < LNG) {
			
			System.out.println("Che prodotto vuoi acquistare?  1:Smartphone | 2:televisore | 3:cuffie");
		String choice = sc.nextLine();
		
			switch (choice) {
			case "1": {
	
				String codice = "A" + rnd.nextInt(100000,1000000);
	
				System.out.print("Marca: ");
				String marca = sc.nextLine();
	
				System.out.print("Nome prodotto: ");
				String nome = sc.nextLine();		
	
				System.out.print("Memoria: ");
				int memory = sc.nextInt();	
	
				String imei = "B" + rnd.nextInt(100000,1000000);
	
				float prezzo = (rnd.nextFloat() * 400) + 100;
				int iva = rnd.nextInt(4, 26);
	
				Smartphone s1 = new Smartphone(codice, nome, marca, prezzo, iva, imei, memory);	
				carrello[counterProdotti++] = s1;
	
	
				break;
	
			}
			case "2": 
			{
				String codice = "A" + rnd.nextInt(100000,1000000);
	
				System.out.print("Marca: ");
				String marca = sc.nextLine();
	
				System.out.print("Nome prodotto: ");
				String nome = sc.nextLine();		
	
				int altezza = rnd.nextInt(30,180);			
				int larghezza = rnd.nextInt(30,180);	
				int profondity = rnd.nextInt(30,180);	
	
				boolean smart = rnd.nextBoolean();
	
				float prezzo = (rnd.nextFloat() * 400) + 100;
				int iva = rnd.nextInt(4, 26);
	
				Televisore t1 = new Televisore(codice, nome, marca, prezzo, iva, altezza, larghezza, profondity, smart);
	
				carrello[counterProdotti++] = t1;
				break;
	
			}
			case "3":
			{
				String codice = "A" + rnd.nextInt(100000,1000000);
	
				System.out.print("Marca: ");
				String marca = sc.nextLine();
	
				System.out.print("Nome prodotto: ");
				String nome = sc.nextLine();		
	
				System.out.println("colore");
				String colore = sc.nextLine();
	
				boolean isWireless = false;
				System.out.print("Wireless? (si/no): ");
				String wireless = sc.nextLine();
				if(wireless.equals("si"))
					isWireless = true;
	
				float prezzo = (rnd.nextFloat() * 400) + 100;
				int iva = rnd.nextInt(4, 26);
	
				Cuffie c1 = new Cuffie(codice, nome, marca, prezzo, iva, colore, isWireless);
	
				carrello[counterProdotti++] = c1;
				break;
	
	
			}
	
			}
		
		
		
		}
		float sum = 0;
		for(int i = 0; i < counterProdotti; i++)
		{
			
			Prodotto item = carrello[i];
			System.out.println("articolo: " + item);
			
			if(isMember)
			{
				sum += item.getPrezzoScontato();
				System.out.println("prezzo scontato: " + item.getPrezzoScontato());
			}
			else
			{
				sum += item.getPrezzoConIva();
			}
			
			
		}
		System.out.println("Totale: " + String.format("%.2f", sum) + "€" );
		
		
		
				
	}
}
