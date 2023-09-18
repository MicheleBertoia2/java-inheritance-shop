package org.java.lessons.products;

public class Cuffie extends Prodotto {
	private String colore;
	
	private boolean wireless;

	public Cuffie(String codice, String nome, String marca, float prezzo, int iva, 
						String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		
		this.colore = colore;
		this.wireless = wireless;
	}
	
	//Getter and Setter
	
	public String getColore()
	{
		return colore;
	}

	public void setAltezza(String colore)
	{
		this.colore = colore;
	}

	
	public boolean isWireless()
	{
		return wireless;
	}
	
	public void setIfSmart(boolean wireless)
	{
		this.wireless = wireless;
	}
	
	//Methods
	
	@Override
	public float getPrezzoScontato() {
		float prezzoScontato = super.getPrezzoScontato();
		
		if(!isWireless())
		{
			prezzoScontato *=  0.93;
		}
		return prezzoScontato;
	}

	//toString
	@Override
	public String toString() {
		
		return super.toString()  + " | colore: " + getColore()  + " | wireless: " + (isWireless() ? "si" : "no");
	}
}
