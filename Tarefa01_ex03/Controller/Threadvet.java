package Controller;

public class Threadvet extends Thread
{
	int id;
	int [] vetor = new int[1000];
	public Threadvet(int threadId, int vet[])
	{
		this.id = threadId;
		this.vetor = vet;
	}
	public void run()
	{
		//Só se executa o que está aqui dentro
		para();
	}
	private void para() 
	{	
		if (id == 1) 
		{	
			double time = System.nanoTime();
			for(int i : vetor ) //Meu deus como a diferença é absurda!!!!!
			{
				
			}
			System.out.println(System.nanoTime() - time );
		
		}
		if (id == 2) 
		{	
			double time2 = System.nanoTime();
			for(int i = 0; i <= vetor.length - 1; i++) 
			{
				
			}
			System.out.println(System.nanoTime() - time2 + " time2");
		}
	}
}
