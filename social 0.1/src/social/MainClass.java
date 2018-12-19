package social;

public class MainClass 
{
	static Categoria categoria = new Categoria();
	static Calcio calcio = new Calcio();
	
	public static void main(String[] args) 
	{
		
	System.out.println(categoria.toStringCategoria());
	System.out.println("\n");
	System.out.println(calcio.toStringCategoria());
	System.out.println(calcio.toStringCalcio());
	
	
	}
}
