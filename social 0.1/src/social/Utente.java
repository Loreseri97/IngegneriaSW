package social;

import java.io.Serializable;

public class Utente implements Serializable
{
	
	private String username;
	private String password;
	private String annoNascita;
	private String sesso;
	
	public Utente()
	{
		
	}
	
	//creazione utente richiamando i metodi 
	public void creaUtente(String _nome,String passw, String anno, String sex)
	{
		inserisciNome(_nome);
		inserisciPsw(passw);
		inserisciEtà(anno);
		inserisciSesso(sex);
		
		
	}
	
	//iniz dati utente
	public void inserisciNome(String nome)
	{
		username=nome;
	}
	
	public void inserisciPsw(String _psw)
	{
		password=_psw;
	}
	
	public void inserisciEtà(String _annoNascita)
	{
		annoNascita=_annoNascita;
	}
	
	public void inserisciSesso(String _sesso)
	{
		sesso=_sesso;
	}
	
	//setter e getter
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getAnnoNascita() 
	{
		return annoNascita;
	}
	
	public void setAnnoNascita(String annoNascita) 
	{
		this.annoNascita = annoNascita;
	}

	public String getSesso() 
	{
		return sesso;
	}

	public void setSesso(String sesso)
	{
		this.sesso = sesso;
	}
	

}
