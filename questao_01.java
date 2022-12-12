/*
  Escreva um algoritmo para funcionar em um caixa eletrônico. 
  O usuário digita o valor em dinheiro a ser sacado e o algoritmo deve exibir 
  a quantidade de notas de 100 reais, 50 reais, 20 reais, 10 reais, 5 reais. 
  O algoritmo deve dar preferencia para calcular a quantidade sempre com as notas maiores possíveis.
  
  Ex 01:
  Digite a quantidade de dinheiro a ser sacada: 265

  Quantidades
  100 reais: 2
  50 reais: 1
  20 reais: 0
  10 reais: 1
  5 reais: 1

  Qualquer exceção no código deve ser tratada com um try catch. 
  Caso o valor informado seja menor ou igual a (zero), exibir a mensagem. 
  "Valor precisa ser maior que 0".
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
	    int saque = 0;
	    
	    
		System.out.print("Digite a quantidade de dinheiro a ser sacada: ");
		try {
		    saque = teclado.nextInt();
		    
		    int ced100 = saque/100;
    		int res100 = saque%100;
    		int ced50 = res100/50;
    		int res50 = res100%50;
    		int ced20 = res50/20;
    		int res20 = res50%20;  
    		int ced10 = res20/10;
    		int res10 = res20%10;  
    		int ced5 = res10/5;
    		int res5 = res10%5;
    		
    		
    		
    		if(res5 > 0){
    		    
    		    System.out.println("\nQuantidades") ;
    		    System.out.println("100 reais: "+ ced100);
    		    System.out.println("50 reais: " + ced50);
    		    System.out.println("20 reais: " + ced20);
    		    System.out.println("10 reais: " + ced10);
    		    System.out.println("5 reais: " + ced5);
    		    
    		    System.out.println("\nA quantia de " + res5 + " não poderá ser sacada.");
    		    
    		}else if(saque <= 0){
    		    
    		    System.out.println("\nValor precisa ser maior que 0.");
    		    
    		}else if (saque >= 5){
    		    
    		    System.out.println("\nQuantidades") ;
    		    System.out.println("100 reais: "+ ced100);
    		    System.out.println("50 reais: " + ced50);
    		    System.out.println("20 reais: " + ced20);
    		    System.out.println("10 reais: " + ced10);
    		    System.out.println("5 reais: " + ced5);
    		    
    		    
    		}
		    
		    
		} catch(java.util.InputMismatchException e) {
		    System.out.println("O valor digitado precisa ser inteiro.") ;
		}
		
		  
		
    }
}




