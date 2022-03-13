package View;


import Controller.Threadvet;

public class Main {

	public static void main(String[] args)
	{
		int [] vet = new int [1000];
		for (int i = 0; i < 1000; i++) 
		{
			vet[i] = (int) ((Math.random() * 100));
		}
		
		for(int ThreadId = 1; ThreadId <= 2; ThreadId++) 
		{
		
			//IdThread threadId = new IdThread(ThreadId);
			Thread threadvet = new Threadvet(ThreadId, vet); // Mais utilizada!!
			// para mostrar que a classe tem o comportamento da superclasse
			threadvet.start();
		}

	}

}
