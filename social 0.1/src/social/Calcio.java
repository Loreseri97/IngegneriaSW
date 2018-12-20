package social;

import it.unibs.fp.mylib.InputDati;

public class Calcio extends Categoria {
	
	//dichiarazione delle variabili
	private char sesso;
	private int età_min;
	private int età_max;
	private String CONST="Sesso utente=%c\nRange età utente(%d-%d)";
	private String nomeCat="Calcio";
	
	//costruttore vuoto 
	public Calcio ()
	{
	
	}
	
	//costuttore per inizializzare le caratteristiche specifiche della categoria calcio
	public Calcio(char sesso,int min,int max) {
		super();
		this.nome_cat=nomeCat;
		this.titolo=InputDati.leggiStringa("Inserisci titolo(facolatitivo)");
		this.numero_partecipanti=InputDati.leggiInteroPositivo("Inserire numero partecipanti(obl)");
		this.anno_i=InputDati.leggiInteroPositivo("inserire anno inizio evento");
		this.mese_i=InputDati.leggiInteroPositivo("inserire mese inizio evento");
		this.giorno_i=InputDati.leggiInteroPositivo("inserire giorno inizio evento");
		this.luogo=InputDati.leggiStringaNonVuota("inserire luogo dell'evento");
		this.anno_t=InputDati.leggiInteroPositivo("inserire anno fine evento");
		this.mese_t=InputDati.leggiInteroPositivo("inserire mese fine evento");
		this.giorno_t=InputDati.leggiInteroPositivo("inserire giorno fine evento");
		//ecc..
		this.sesso=InputDati.leggiChar("inserire sesso utente");
		this.età_min=min;
		this.età_max=max;
		
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
