package trabalho1;

import java.util.Random;

public class Carro implements Runnable 
{
    private static final int dis__corida = 100; 
    private static final int max_acelerasao = 16; 

    private final String nome;
    private int pozAtual;
    private int velAtual;

    public Carro(String nome) 
    {
        this.nome = nome;
        this.pozAtual = 0;
        this.velAtual = 0;
    }

    public String getNome() 
    {
        return nome;
    }

    public int getPosicaoAtual() 
    {
        return pozAtual;
    }

    @Override
    public void run() {
        Random random = new Random();
        
        
        while (pozAtual < dis__corida ) 
        {
        	
          
            int aceleracao = random.nextInt(max_acelerasao) + 1;
            
            
            
       
            int velocidadeFinal = velAtual + aceleracao;
            
           
            int pozFinal = pozAtual + velocidadeFinal;
           
            if (pozFinal >= dis__corida ) 
            {
            	
            	pozFinal = dis__corida ;
            	
                System.out.println(nome + " alcançou a linha de chegada");
            }
            
            velAtual = velocidadeFinal;
            
            pozAtual = pozFinal;
            
            
         
            System.out.println("O " + nome + " andou " + velAtual + "m e já percorreu " + pozAtual + "m");
            
            try 
            {
                Thread.sleep(1000); 
            } catch (InterruptedException e) 
            
            {
                e.printStackTrace();
            }
        }
    }
}