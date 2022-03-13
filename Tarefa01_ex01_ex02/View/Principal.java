package View;

import javax.swing.JOptionPane;

import Controller.CalcThread;
import Controller.IdThread;

public class Principal 
{

	public static void main(String[] args) 
	{ 
		int ex;
		do
		{
			ex = Integer.parseInt(JOptionPane.showInputDialog(null, ("Digite o numero do execicio que deseja executar: \n 1 - Fazer uma aplicação que rode 5 Threads que\r\n"
				+ "cada uma delas imprima no console o seu\r\n"
				+ "número \n "
				+ "\n2 - Fazer uma aplicação que insira números\r\n"
				+ "aleatórios em uma matriz 3 x 5 e tenha 3\r\n"
				+ "chamadas de Threads, onde cada uma calcula a\r\n"
				+ "soma dos valores de cada linha, imprimindo a\r\n"
				+ "identificação da linha e o resultado da soma \n "
				+ "\n3 - Finalizar Programa")));
		
		
		switch (ex)
		{
			case 1: 
				
				for(int ThreadId = 0; ThreadId < 5; ThreadId++) 
				{
				
					//IdThread threadId = new IdThread(ThreadId);
					Thread threadId = new IdThread(ThreadId); // Mais utilizada!!
					// para mostrar que a classe tem o comportamento da superclasse
					threadId.start();
				}
		   
			break;
		
			case 2: 
				
				int numbers[][] = new int[3][5];
				for (int coluna = 0; coluna < 5; coluna++) 
				{
					for (int linha = 0; linha < 3; linha++) 
					{
						numbers[linha][coluna] = (int) ((Math.random() * coluna) + linha);
						System.out.print(" Linha " + linha + " Valor:" + numbers[linha][coluna] + " \n ");
					}
					
					System.out.println("---------------------");
				}
				for(int calcThread = 0; calcThread < 3; calcThread++) 
				{
				
					//IdThread threadId = new IdThread(ThreadId);
					Thread calcthread = new CalcThread(calcThread, numbers); // Mais utilizada!!
					// para mostrar que a classe tem o comportamento da superclasse
					calcthread.start();
				}
		    break;
			
			case 3: 
				
				System.out.println("\n Execução Finalizada!!");
			break;
			default:
				System.out.println("\n Digito incorreto digite um numero válido");
			break;
		
		}
		
		}while (ex > 3 || ex <= 0 );
		
	}

}
