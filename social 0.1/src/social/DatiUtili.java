package social;

import java.io.Serializable;
import java.util.ArrayList;

public class DatiUtili implements Serializable
{
	
	private ArrayList <Utente> listaUtenti= new ArrayList();
	
	
	
    //setter e getter
	public  ArrayList<Utente> getListaUtenti() 
	{
		return listaUtenti;
	}
	public  void setListaUtenti(ArrayList<Utente> listaUtenti) 
	{
		listaUtenti = listaUtenti;
	}
	
	

}
