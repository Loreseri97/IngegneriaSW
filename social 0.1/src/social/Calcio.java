package social;

public class Calcio extends Categoria {
	
	//dichiarazione delle variabili
	private char sesso;
	private int et�_min;
	private int et�_max;
	String CONST="Sesso utente=%c\nRange et� utente(%d-%d)";
	
	
	//costruttore vuoto 
	public Calcio ()
	{
	
	}
	
	//stampa caratteristiche specifiche della categoria calcio
	public String toStringCalcio()
	{
		return String.format(CONST,sesso,et�_min,et�_max);
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
	public int getEt�_min() 
	{
		return et�_min;
	}
	public void setEt�_min(int et�_min) 
	{
		this.et�_min = et�_min;
	}
	public int getEt�_max()
	{
		return et�_max;
	}
	public void setEt�_max(int et�_max) 
	{
		this.et�_max = et�_max;
	}

}
