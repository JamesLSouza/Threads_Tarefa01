package Controller;
	//extends Thread
	//Parâmetros por contrutor
	//metodo run()



public class CalcThread extends Thread
{
		private int [] [] calcthread;
		private int tempo = 1000;
		private int calc;
		
		
		public CalcThread(int calcThread, int numbers[][]) 
		{
			
			this.calc = calcThread;
			this.calcthread = numbers;						
		
		}
		
		public void run()
		{
			
			//Só se executa o que está aqui dentro
			calc();
			
		}

		private void calc() 
		{ 
			try 
			{
				sleep(calc * tempo);
			} 
			catch (InterruptedException error)
			{			
				error.printStackTrace();
			}
			 
			int soma = 0;
			for (int c = 0; c < 5; c++) 
			{	
					soma += calcthread[calc][c];
			}
				System.out.println("\nSoma da linha " + (calc + 1) + " é: " + soma);
		}
		
}