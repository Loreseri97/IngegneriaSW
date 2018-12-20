package social;

public class MainClass 
{
	static Categoria categoria = new Categoria();
	static Calcio calcio = new Calcio();
	static Categorie categorie = new Categorie();
	static Calcio nuoto = new Calcio();
	
	public static void main(String[] args) 
	{
		System.out.println("Visulizzazione categorie presenti:");
		categorie.addCategorie(calcio,"Calcio");
		categorie.addCategorie(nuoto,"Nuoto");
		categorie.categorieToString();
	
		
/*	System.out.println(categoria.toStringCategoria());
	System.out.println("\n");
	System.out.println(calcio.toStringCategoria());
	
	
	System.out.println(calcio.toStringCalcio());  */
	}
}
