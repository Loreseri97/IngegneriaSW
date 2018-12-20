package social;

import java.util.ArrayList;

public class Categorie {
	
	private ArrayList <Categoria> elencoCategorie;
	private Categoria categoria = new Categoria();
	private int i=0;
	
	public Categorie()
	{
		elencoCategorie =new ArrayList();
	}

	public void addCategorie(Categoria _categoria,String _nomeCat)
	{
		elencoCategorie.add(_categoria);
		elencoCategorie.get(i).setNome_cat(_nomeCat);
		i++;
	
	}
	
	public void categorieToString()
	{
		int x=elencoCategorie.size();
		while(x>0)
		{
			x--;	
			System.out.println(elencoCategorie.get(x).getNome_cat());	
		}
	}

	public ArrayList<Categoria> getElencoCategorie()
	{
		return elencoCategorie;
	}
	public void setElencoCategorie(ArrayList<Categoria> elencoCategorie)
	{
		this.elencoCategorie = elencoCategorie;
	}
	public Categoria getCategoria()
	{
		return categoria;
	}
	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}
	
	
}
