package trabalho1;

public class Corrida 
{
    public static void main(String[] args)
    {
        int numCarros = 6;
        Thread[] threads = new Thread[numCarros];

        for (int i = 0; i < numCarros; i++)
        {
            Carro carro = new Carro("Carro_" + (i + 1));
            
            threads[i] = new Thread(carro);
            
            threads[i].start();
        }

    
        for (Thread thread : threads)
        {
            try 
            {
                thread.join();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}