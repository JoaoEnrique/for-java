package Padrao;

/**
 *
 * @author João Enrique
 */
public class NumeroPar 
{
    private int contador;
    
    public NumeroPar()//Método construtor
    {
    
    }
    
    public int getContador()//Método get retornar contatdor
    {
        return contador;
    }
    
    public void setContador(int contador)//Método set contador
    {
        this.contador = contador;
    }
    
    void calcularPar(int numeroPar)//Calcular os números pares
    {
        this.setContador(2);//atribuindo um valor

        for (int contador = 1 ; this.getContador() <= numeroPar ;)//repetição até contador der igual ao número digitado
        { 
            System.out.println(this.getContador());//mostrar o resultado

            this.setContador(this.getContador() + 2);//adicionado 2 ao contador para sair do loop
        }  
    }
}
