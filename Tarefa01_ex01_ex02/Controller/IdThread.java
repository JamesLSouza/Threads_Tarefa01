package Controller;
	//extends Thread
	//Par�metros por contrutor
	//metodo run()
		
public class IdThread extends Thread
{
		private int ThreadId;
		public IdThread(int threadId)
		{
			this.ThreadId = threadId;
				
		}
		public void run()
		{
			//S� se executa o que est� aqui dentro
			System.out.println(ThreadId);
		}
		
		
	
}
