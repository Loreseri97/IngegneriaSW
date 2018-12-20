package social;

import it.unibs.fp.mylib.InputDati;

public class Calcio extends Categoria {
	
	//dichiarazione delle variabili
	private char sesso;
	private int et�_min;
	private int et�_max;
	private String CONST="Sesso utente=%c\nRange et� utente(%d-%d)";
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
		this.et�_min=min;
		this.et�_max=max;
		
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
