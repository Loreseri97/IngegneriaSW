package social;

import it.unibs.fp.mylib.InputDati;

public class Categoria 
{
	//definizione variabili obbligatorie e non obbligatore 
	protected String nome_cat;
	protected String titolo;
	protected int numero_partecipanti;
	protected int anno_t,mese_t,giorno_t;
	protected String luogo;
	protected int anno_i,mese_i,giorno_i;
	protected int ora,minuti;
	protected int durata;
	protected float quota;
	protected String extra;
	protected int anno_f,mese_f,giorno_f;
	protected int ora_conclusione,minuti_conclusione;
	protected String note;

	protected final String CONST="Nome categoria: %s \nTitolo: %s \nNumero partecipanti: %d"
			+ " \nTermine iscrizione: %d-%d-%d \nLuogo: %s\n"
			+ "Data inizio: %d-%d-%d\nOra inizio: %d:%d\nDurata: %d\nQuota:%f\n"
			+ "Compreso nella quota: %s\nData fine evento: %d-%d-%d\n"
			+ "Ora conclusione evento: %d:%d\nNote: %s";
	
	//costruttore vuoto e costruttore per dare valore alle variabili
	public Categoria()
	{
		  
	}
	public Categoria(String nomeCat,String _titolo,int numeroP,int annoT,int meseT,int giornoT,String _luogo,
			          int annoI,int meseI, int giornoI,int _ora ,int _minuti,int _durata,float _quota, String _extra,
			          int annoF, int meseF,int giornoF,int oraConclusione, int minutiConclusione,String _note)
	{
		nome_cat=nomeCat;
		titolo=_titolo;
		numero_partecipanti=numeroP;
		anno_t=annoT; mese_t=meseT;giorno_t=giornoT;
		luogo=_luogo;
		anno_i=annoI; mese_i=meseI; giorno_i=giornoI;
		ora=_ora; minuti=_minuti;
		durata=_durata;
		quota=_quota;
		extra=_extra;
		anno_f=annoF ; mese_f=meseF; giorno_f=giornoF;
	    ora_conclusione=oraConclusione; minuti_conclusione=minutiConclusione;
	    note=_note;
		
			
		  
	}
	
	//stampa a video tutte le caratteristiche di categoria
	public String toStringCategoria() 
	{
		return String.format(CONST,nome_cat,titolo,numero_partecipanti,anno_t,mese_t,giorno_t,
				luogo,anno_i,mese_i, giorno_i,ora, minuti,durata,quota,extra,anno_f,mese_f,
				giorno_f,ora_conclusione, minuti_conclusione,note );
		
	}
	
	
	//setter e getter
	public String getTitolo() 
	{
		return titolo;
	}
	public void setTitolo(String titolo)
	{
		this.titolo= titolo;
	}
	public String getNome_cat()
	{
		return nome_cat;
	}
	public void setNome_cat(String nome_cat)
	{
		this.nome_cat = nome_cat;
	}
	public int getNumero_partecipanti() 
	{
		return numero_partecipanti;
	}
	public void setNumero_partecipanti(int numero_partecipanti)
	{
		this.numero_partecipanti = numero_partecipanti;
	}
	public int getAnno_t() 
	{
		return anno_t;
	}
	public void setAnno_t(int anno_t)
	{
		this.anno_t = anno_t;
	}
	public int getMese_t() 
	{
		return mese_t;
	}
	public void setMese_t(int mese_t)
	{
		this.mese_t = mese_t;
	}
	public int getGiorno_t()
	{
		return giorno_t;
	}
	public void setGiorno_t(int giorno_t)
	{
		this.giorno_t = giorno_t;
	}
	public String getLuogo()
	{
		return luogo;
	}
	public void setLuogo(String luogo) 
	{
		this.luogo = luogo;
	}
	public int getAnno_i()
	{
		return anno_i;
	}
	public void setAnno_i(int anno_i) 
	{
		this.anno_i = anno_i;
	}
	public int getMese_i() 
	{
		return mese_i;
	}
	public void setMese_i(int mese_i) 
	{
		this.mese_i = mese_i;
	}
	public int getGiorno_i()
	{
		return giorno_i;
	}
	public void setGiorno_i(int giorno_i)
	{
		this.giorno_i = giorno_i;
	}
	public int getOra()
	{
		return ora;
	}
	public void setOra(int ora)
	{
		this.ora = ora;
	}
	public int getMinuti()
	{
		return minuti;
	}
	public void setMinuti(int minuti) 
	{
		this.minuti = minuti;
	}
	public int getDurata()
	{
		return durata;
	}
	public void setDurata(int durata) 
	{
		this.durata = durata;
	}
	public float getQuota() 
	{
		return quota;
	}
	public void setQuota(float quota)
	{
		this.quota = quota;
	}
	public String getExtra() 
	{
		return extra;
	}
	public void setExtra(String extra) 
	{
		this.extra = extra;
	}
	public int getAnno_f()
	{
		return anno_f;
	}
	public void setAnno_f(int anno_f)
	{
		this.anno_f = anno_f;
	}
	public int getMese_f()
	{
		return mese_f;
	}
	public void setMese_f(int mese_f) 
	{
		this.mese_f = mese_f;
	}
	public int getGiorno_f() 
	{
		return giorno_f;
	}
	public void setGiorno_f(int giorno_f)
	{
		this.giorno_f = giorno_f;
	}
	public int getOra_conclusione() 
	{
		return ora_conclusione;
	}
	public void setOra_conclusione(int ora_conclusione) 
	{
		this.ora_conclusione = ora_conclusione;
	}
	public int getMinuti_conclusione()
	{
		return minuti_conclusione;
	}
	public void setMinuti_conclusione(int minuti_conclusione) 
	{
		this.minuti_conclusione = minuti_conclusione;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note) 
	{
		this.note = note;
	}
	
}

