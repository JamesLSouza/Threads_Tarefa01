package Controller;
	//extends Thread
	//Parâmetros por contrutor
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
			//Só se executa o que está aqui dentro
			System.out.println(ThreadId);
		}
		
		
	
}
