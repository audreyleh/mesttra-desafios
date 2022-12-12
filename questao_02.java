/*
   Escreva um algoritmo para criar uma votação para síndico de um prédio. 
   Deve ser lido 5 votos. Os candidatos são "Candidato A", "Candidato B", "Candidato C". 
   O algoritmo deve exibir um menu com as opções conforme abaixo: 
   "1 - Candidato A", "2 - Candidato B", "3 - Candidato C", "4 - Voto Nulo". 
   O algoritmo deve apresentar a quantidade percentual de votos válidos, o percentual de cada candidato 
   (apenas votos válidos, desconsiderando os votos nulos). Ao final o algoritmo deve imprimir o candidato vencedor.

  Ex:
  =========== Menu de Votação ===========

  1 - Candidato A
  2 - Candidato B
  3 - Candidato C
  4 - Voto Nulo

  Digite o código do candidato para o primeiro voto: 1
  Digite o código do candidato para o segundo voto: 1
  Digite o código do candidato para o terceiro voto: 4
  Digite o código do candidato para o quarto voto: 2
  Digite o código do candidato para o quinto voto: 1

  Percentual de Votos Válidos: 80.0%
  Percentual de Votos Candidato 1: 60.0%
  Percentual de Votos Candidato 2: 20.0%
  Percentual de Votos Candidato 3:  0.0%

  Candidato vencedor: Candidato 1

  Para qualquer outro código deve ser exibido: Opção inválida, o voto não será computado.
  Qualquer exceção no código deve ser tratada com um try catch.
  Em uma situação real, limparíamos a tela antes de ler o próximo voto, para que o votante atual não visse o voto anterior. 
  Não precise preocupar com esta situação.


*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
	    int voto01, voto02, voto03, voto04, voto05;
	    float porcentagem01, porcentagem02, porcentagem03, porcentagemvalidos;
	    int cand1 = 0, cand2 = 0, cand3 = 0, votoN = 0;
	    
		System.out.println("=========== Menu de Votação ===========\n");
		
		System.out.println("1 - Candidato A");
		System.out.println("2 - Candidato B");
		System.out.println("3 - Candidato C");
		System.out.println("4 - Voto Nulo\n");
		
		System.out.println("=======================================\n");
		
		
		try {
		    
		    System.out.print("Digite o código do candidato para o primeiro voto: ");
		voto01 = teclado.nextInt();
		 if ((voto01 != 1) && (voto01 != 2) && (voto01 != 3) && (voto01 != 4)) {
		System.out.println("Opção inválida, o voto não será computado.");
	    }
	    
		if(voto01 == 1){
		 cand1 = cand1 + 1;
		} else if(voto01 == 2){
		  cand2 = cand2 + 1;  
		} else if(voto01 == 3){
		  cand3 = cand3 + 1;  
		} else if(voto01 == 4){
		  votoN = votoN + 1;  
		}
		
		System.out.print("Digite o código do candidato para o segundo voto: ");
		voto02 = teclado.nextInt();
		if ((voto02 != 1) && (voto02 != 2) && (voto02 != 3) && (voto02 != 4)) {
		System.out.println("Opção inválida, o voto não será computado.");
	    }
		if(voto02 == 1){
		 cand1 = cand1 + 1;
		} else if(voto02 == 2){
		  cand2 = cand2 + 1;  
		} else if(voto02 == 3){
		  cand3 = cand3 + 1;  
		} else if(voto02 == 4){
		  votoN = votoN + 1;  
		}
		System.out.print("Digite o código do candidato para o terceiro voto: ");
		voto03 = teclado.nextInt();
		if ((voto03 != 1) && (voto03 != 2) && (voto03 != 3) && (voto03 != 4)) {
		System.out.println("Opção inválida, o voto não será computado.");
	    }
	    
		if(voto03 == 1){
		 cand1 = cand1 + 1;
		} else if(voto03 == 2){
		  cand2 = cand2 + 1;  
		} else if(voto03 == 3){
		  cand3 = cand3 + 1;  
		} else if(voto03 == 4){
		  votoN = votoN + 1;  
		}
		System.out.print("Digite o código do candidato para o quarto voto: ");
		voto04 = teclado.nextInt();
		if ((voto04 != 1) && (voto04 != 2) && (voto04 != 3) && (voto04 != 4)) {
		System.out.println("Opção inválida, o voto não será computado.");
	    }
	    
		if (voto04 == 1){
		 cand1 = cand1 + 1;
		} else if(voto04 == 2){
		  cand2 = cand2 + 1;  
		} else if(voto04 == 3){
		  cand3 = cand3 + 1;  
		} else if(voto04 == 4){
		  votoN = votoN + 1;  
		}
		System.out.print("Digite o código do candidato para o quinto voto: ");
		voto05 = teclado.nextInt();
        if(voto05 == 1){
		 cand1 = cand1 + 1;
		} else if(voto05 == 2){
		  cand2 = cand2 + 1;  
		} else if(voto05 == 3){
		  cand3 = cand3 + 1;  
		} else if(voto05 == 4){
		  votoN = votoN + 1;  
		}
		
		porcentagemvalidos = ((cand1+cand2+cand3)*100)/5;
		porcentagem01 = (cand1 * 100)/5;
		porcentagem02 = (cand2 * 100)/5;
		porcentagem03 = (cand3 * 100)/5;
		
		System.out.println("\nPercentual de Votos Válidos: " + porcentagemvalidos +"%");
	    System.out.println("Percentual de Votos Candidato 1: " + porcentagem01 +"%");
		System.out.println("Percentual de Votos Candidato 2: " + porcentagem02 +"%");
		System.out.println("Percentual de Votos Candidato 3: " + porcentagem03 +"%");
		
		if(cand1>cand2 && cand1>cand3){
		    System.out.println("\nCandidato vencedor: Candidato 01");
		    
		}else if(cand2>cand1 && cand2>cand3){
		    System.out.println("\nCandidato vencedor: Candidato 02 ");
		    
		}else if(cand3>cand1 && cand3>cand2){
		    System.out.println("\nCandidato vencedor: Candidato 03");
		    
		}
		    
		} catch(InputMismatchException error) {
		    System.out.println("O código digitado deve ser um número de 1 a 4.");
		}
		
		
	}
}
