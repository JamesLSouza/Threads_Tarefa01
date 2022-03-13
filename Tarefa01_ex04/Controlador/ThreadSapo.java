package Controlador;



public class ThreadSapo extends Thread 
{
	String nome; // nome do sapo
	int distanciaCorrida = 0; // distância já corrida pelo sapo
	int distanciaTotalCorrida; // distância a ser corrida pelo sapo
	int pulo = 0; // pulo do sapo em metros
	int pulos = 0; // quantidades de pulos dados na corrida
	private int colocacao = 0; // colocação do sapo ao final da corrida
	private int PULO_MAXIMO = 50; // pulo máximo em cm que um sapo pode dar
	
	/** Construtor da classe. Parâmtros : Nome do Sapo e Distância da Corrida */

	public ThreadSapo (String nome, int distanciaTotalCorrida)
	{

		/* chamando o construtor de Thread passando o nome do sapo como parâmetro */

		super(nome);
		
		this.distanciaTotalCorrida = distanciaTotalCorrida;
		
		this.nome = nome;
	}
	
	/** Imprime o último pulo do sapo e a distância percorrida */

	public void sapoImprimindoSituacao () 
	{

		System.out.println("O " + nome + " pulou " + pulo + " metros \t e já percorreu " + distanciaCorrida + " metros");

	}

	/** Faz o sapo pular */

	public void sapoPulando()
	{

		pulos++;

		pulo = (int) (Math.random() * PULO_MAXIMO);

		distanciaCorrida += pulo;

		if (distanciaCorrida > distanciaTotalCorrida)
		{

			distanciaCorrida = distanciaTotalCorrida;

		}

	}

	/** Representando o descanso do sapo */

	//public void sapoDescansando ()
	//{

	/* Método que passa vez a outras threads */

	//yield();

	//}

	/** Imprime a colocação do sapo ao final da corrida */

	public void colocacaoSapo () {

	colocacao++;

	System.out.println(nome + " foi o " + colocacao +

	"º colocado com " + pulos + " pulos");

	}

	/** Método run da thread Corrida de Sapos */

	public void run () {

	while (distanciaCorrida < distanciaTotalCorrida) {

	sapoPulando();

	sapoImprimindoSituacao();

	//sapoDescansando();

	}

	colocacaoSapo();

	}
}


	