package org.java.lessons.products;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int memory;

	public Smartphone(String codice, String nome, String marca, float prezzo, int iva, String imei, int memory) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memory = memory;
	}
	
	//Getter and Setter
	
	public String getImei()
	{
		return imei;
	}

	public void setImei(String imei)
	{
		this.imei = imei;
	}
	
	public int getMemory()
	{
		return memory;		
	}
	
	public void setMemory(int memory)
	{
		this.memory = memory;		
	}
	
	//Methods
	@Override
	public float getPrezzoScontato() {
		float prezzoScontato = super.getPrezzoScontato();
		
		if(getMemory() < 32)
		{
			prezzoScontato *= 0.95;
		}
		return prezzoScontato;
	}
	
	//toString
	@Override
	public String toString() {
		
		return super.toString()  + " | imei: " + getImei()  + " |memory: GB " + getMemory();
	}
}

