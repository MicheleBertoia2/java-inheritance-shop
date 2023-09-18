package org.java.lessons.products;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto( String codice, String nome, String marca, float prezzo, int iva)
	{
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	//Getter and Setter
	
	public String getCodice()
	{
		return codice;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public float getPrezzo()
	{
		return prezzo;
	}
	
	public void setPrezzo(float prezzo)
	{
		this.prezzo = prezzo;
	}
	
	public int getIva()
	{
		return iva;
	}
	
	public void setIva(int iva)
	{
		this.iva = iva;
	}
	
	//Methods
	
	public String getPrezzoNoIva()
	{
		return prezzo + "€";
	}
	
	public float getPrezzoScontato()
	{
		
		
		
		//return ((isMember == true)  ? getPrezzoConIva() - ((getPrezzoConIva() * 2) / 100) : getPrezzoConIva()) ;
		return getPrezzoConIva() - ((getPrezzoConIva() * 2) / 100);
	}
	
	public float getPrezzoConIva()
	{
		
		return getPrezzo() + ( (getPrezzo() * getIva()) / 100);
	}
	
	//ToString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cod: " + getCodice() + " | nome: " + getNome()  + " | marca: " + getMarca()  + " | prezzo: " + String.format("%.2f", getPrezzoConIva())  + " | iva: " + getIva() ;
	}
	
}
