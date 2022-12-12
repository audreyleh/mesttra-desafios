/*
  Desenvolva um algoritmo para ler o nome, a idade, o sexo de 03 (três) indivíduos e imprimir “XXXX é criança”, 
  se a idade for menor ou igual a 13 anos, “XXXX é adolescente”, no caso de idade estar entre 13 e 20 anos, e “XXX é adulto”,
  se for até a idade 50 anos e "XXX é da melhor idade" acima de 50 anos. XXX deve ser substituído pelo nome do indivíduo. 
  No caso do sexo, o individuo pode digitar: F, f, m ou M. O algoritmo também deve imprimir 
  ao final a quantidade de indivíduos que são crianças, adolescentes, adultos e melhor idade. 
  Deve ser informado também o nome do indivíduo mais Velho. Qualquer exceção no código deve ser tratada com um try catch.

  Ex: 
  Digite o nome do indivíduo 01: João
  Digite a idade do João: 26
  Digite o sexo do(a) João: m
  João é adulto.

  Digite o nome do indivíduo 02: Maria
  Digite a idade do Maria: 8
  Digite o sexo do(a) Maria: F
  Maria é criança.

  Digite o nome do indivíduo 03: Jose
  Digite a idade do Jose: 80
  Digite o sexo do(a) Jose: M
  Jose é da melhor idade.

  Total de crianças: 1
  Total de adolescentes: 0
  Total de adultos: 1
  Total de melhor idade: 1

  O nome do indivíduo mais velho é: Jose
*/

import java.util.Scanner;
import java.util.InputMismatchException;


public class Main
{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        
        String nome01, nome02, nome03, sexo01; 
        String sexo02, sexo03;
        int idade01, idade02, idade03;
         
         try {
             
             System.out.print("Digite o nome do individuo 01: "); //pessoa01
        nome01 = teclado.nextLine ();
        
        System.out.print("Digite a idade do " + nome01 + ": ");
        idade01 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Digite o sexo do(a) " + nome01 + ": ");
        sexo01 = teclado.nextLine();

	    if (!sexo01.equalsIgnoreCase ("m") && !sexo01.equalsIgnoreCase ("f")) {
		System.out.println("Sexo informado inválido. Digite F, f, M ou m.");
	    }
        
        int numeroCriancas = 0;
    	int numeroAdolescentes = 0;
	    int numeroAdultos = 0;
	    int numeroIdosos = 0;

        if (idade01 > 0 && idade01 <= 13){
            numeroCriancas = numeroCriancas  + 1;  //numeroCriancas ++
            System.out.println(nome01 + " é criança.");
            
            
        } else if (idade01>13 && idade01 <= 20){
            numeroAdolescentes = numeroAdolescentes + 1;
            System.out.println(nome01 + " é adolescente.");
            
            
        } else if (idade01>20 && idade01 <= 50){
		    numeroAdultos = numeroAdultos + 1;
            System.out.println(nome01 + " é adulto.");
            
        } else {
            numeroIdosos = numeroIdosos + 1;
            System.out.println(nome01 + " é da melhor idade.");
            
        }    
        
        System.out.print("\nDigite o nome do individuo 02: "); // pessoa02
        nome02 = teclado.nextLine ();
        
        System.out.print("Digite a idade do " + nome02 + ": ");
        idade02 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Digite o sexo do(a) " + nome02 + ": ");
        sexo02 = teclado.nextLine();
        if (!sexo02.equalsIgnoreCase ("m") && !sexo02.equalsIgnoreCase ("f")) {
		System.out.println("Sexo informado inválido. Digite F, f, M ou m.");
	    }
	
        if (idade02 <= 13){
            System.out.println(nome02 + " é criança.");
	    numeroCriancas = numeroCriancas + 1;
            
        } else if (idade02>13 && idade02 <= 20){
            System.out.println(nome02 + " é adolescente.");
	    numeroAdolescentes  = numeroAdolescentes  + 1;
            
        } else if (idade02>20 && idade02 <= 50){
            System.out.println(nome02 + " é adulto.");
            numeroAdultos = numeroAdultos  + 1;
            
        } else {
            System.out.println(nome02 + " é da melhor idade.");
            numeroIdosos = numeroIdosos + 1;
        }
        
        System.out.print("\nDigite o nome do individuo 03: "); // pessoa03
        nome03 = teclado.nextLine ();
        
        System.out.print("Digite a idade do " + nome03 + ": ");
        idade03 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Digite o sexo do(a) " + nome03 + ": ");
        sexo03 = teclado.nextLine();
        if (!sexo03.equalsIgnoreCase ("m") && !sexo03.equalsIgnoreCase ("f")) {
		System.out.println("Sexo informado inválido. Digite F, f, M ou m.");
	    }
	    
	    
	    
        if (idade03 <= 13){
            System.out.println(nome03 + " é criança.");
            numeroCriancas= numeroCriancas  + 1;
            
        } else if (idade03>13 && idade03 <= 20){
            numeroAdolescentes = numeroAdolescentes + 1;
            System.out.println(nome03 + " é adolescente.");
            
        } else if (idade03>20 && idade03 <= 50){
            System.out.println(nome03 + " é adulto.");
            numeroAdultos = numeroAdultos + 1;
            
        } else {
            numeroIdosos = numeroIdosos + 1;
            System.out.println(nome03 + " é da melhor idade.");
        }
        
		if (idade01 > 0 && idade02 > 0 && idade03 > 0 ){
	
		System.out.println("Total de crianças: " + numeroCriancas);
		System.out.println("Total de adolescentes: " + numeroAdolescentes);
		System.out.println("Total de adultos: " + numeroAdultos);
		System.out.println("Total de melhor idade: " + numeroIdosos);
		} //total de pessoas
		
        if (idade01> idade02 && idade01>idade03){
            System.out.println("\nO nome do indivíduo mais velho é: " + nome01);
             //pessoa mais velha
        }else if(idade02> idade01 && idade02>idade03){
            System.out.println("\nO nome do indivíduo mais velho é: " + nome02);
            
        }else if(idade03>idade01 && idade03>idade02){
             System.out.println("\nO nome do indivíduo mais velho é: " + nome03);
            
        }
        
        } catch(InputMismatchException error) {
             System.out.println("O valor digitado está incorreto.");
        }
    } 
}
    



