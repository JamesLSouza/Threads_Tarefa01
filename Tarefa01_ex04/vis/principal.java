package vis;

import Controlador.ThreadSapo;

public class principal
{
	 

	public static void main (String[] args) 
	{
		int number_frog = 5; // QTE. de sapos na corrida
		int distance  = 1000; // Distância da corrida em metros
		// colocando sapos na corrida 
		for (int i = 1; i <= number_frog; i++) 
		{ 
			new ThreadSapo("SAPO_" + i, distance).start(); 
		} 
		
	}
}