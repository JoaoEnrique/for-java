# For-Java
Programa em Java que mostra os números pares entre 0 até um número pelo usuário usando o bloco de repetição For.

# Classe NumeroPar
```java
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
```


# Classe Principal
```java
package Padrao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Principal //declarando as variaveis
{
    public static Scanner scanner = new Scanner(System.in); //teclado
    public static int numeroPar = 0; //guardar o valor do numero
    public static NumeroPar par = new  NumeroPar(); //classe para mostrar o resultado

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //classe padrao
    {
        System.out.println("Contando números pares (For)");
    
        System.out.print("Digite um número: ");
    
        numeroPar = scanner.nextInt();//teclado
        
        System.out.println("Todos os número pares até " + numeroPar);
    
        par.calcularPar(numeroPar); //mostrar o resultado da classe NumeroPar
        // TODO code application logic here
    }  
}
```
