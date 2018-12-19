package social;

public class Calcio extends Categoria {
	
	//dichiarazione delle variabili
	private char sesso;
	private int età_min;
	private int età_max;
	String CONST="Sesso utente=%c\nRange età utente(%d-%d)";
	
	
	//costruttore vuoto 
	public Calcio ()
	{
	
	}
	
	//stampa caratteristiche specifiche della categoria calcio
	public String toStringCalcio()
	{
		return String.format(CONST,sesso,età_min,età_max);
	}
	
	//setter e getter
	public char getSesso()
	{
		return sesso;
	}
	public void setSesso(char sesso) 
	{
		this.sesso = sesso;
	}
	public int getEtà_min() 
	{
		return età_min;
	}
	public void setEtà_min(int età_min) 
	{
		this.età_min = età_min;
	}
	public int getEtà_max()
	{
		return età_max;
	}
	public void setEtà_max(int età_max) 
	{
		this.età_max = età_max;
	}

}
