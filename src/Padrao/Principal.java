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
