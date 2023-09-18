package org.java.lessons.products;

public class Televisore extends Prodotto {
	private int altezza;
	private int larghezza;
	private int profondità;
	private boolean smart;

	public Televisore(String codice, String nome, String marca, float prezzo, int iva, 
						int altezza, int larghezza, int profondità, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondità = profondità;
		this.smart = smart;
				
		
	}
	
	//Getter and Setter
	
	public int getAltezza()
	{
		return altezza;
	}

	public void setAltezza(int altezza)
	{
		this.altezza = altezza;
	}
	
	public int getLarghezza()
	{
		return larghezza;		
	}
	
	public void setLarghezza(int larghezza)
	{
		this.larghezza = larghezza;		
	}
	
	public int getProfondity()
	{
		return profondità;
	}

	public void setProfondity(int profondity)
	{
		this.profondità = profondity;
	}
	
	public boolean isSmart()
	{
		return smart;
	}
	
	public void setIfSmart(boolean smart)
	{
		this.smart = smart;
	}
	
	//Methods
	public String getDimensions()
	{
		return getAltezza() + "Hx" + getLarghezza() + "Lx" + getProfondity() + "P";
	}
	
	@Override
	public float getPrezzoScontato() {
		float prezzoScontato = super.getPrezzoScontato();
		
		if(!isSmart())
		{
			prezzoScontato *= 0.9;
		}
		return prezzoScontato;
	}
	
	//toString
	@Override
	public String toString() {
		
		return super.toString()  + " | dimensioni: " + getDimensions()  + " | smart: " + (isSmart() ? "si" : "no");
	}
}
