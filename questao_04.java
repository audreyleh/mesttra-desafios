/*
  Desenvolva um algoritmo que leia 5 compras de clientes.
  Para cada compra de cliente deve ser informado o valor da compra e o código da forma de pagamento. 
  Com base neste código, o algoritmo deverá calcular e imprimir o valor a pagar final, a forma de pagamento
  e o valor de cada parcela, se for o caso.

Lista de códigos e suas respectivas classificações:

Código Classificação
1 À vista, com 8% de desconto
2 À vista no cartão, 4% de desconto
3 Em 2x, preço normal sem juros
4 Em 4x, preço acrescido de 8%

Qualquer outro código: Opção inválida

O algoritmo deve também exibir a soma de todas as compras "À vista" e "Parceladas". Deve ser impresso também o total de descontos e o total de juros.

Ex:
Compra 01
Digite o valor total: R$ 2500.30
Digite a forma de pagamento: 1
Desconto de 8% 
Valor final: R$ 2300.28 

Compra 02
Digite o valor total: R$ 500.98
Digite a forma de pagamento: 2
Desconto de 4%
Valor final: R$ 480,94

Compra 03
Digite o valor total: R$ 10.38
Digite a forma de pagamento: 9
Opção inválida, a compra não será processada

Compra 04
Digite o valor total: R$ 40.60
Digite a forma de pagamento: 3
Em 2x de R$ 20.30
Valor final: R$ 40.60

Compra 05
Digite o valor total: R$ 140.70
Digite a forma de pagamento: 4
Em 4x de R$ 37.99
Valor final: R$ 151,96 

Total de compras "À vista": R$ 2781.22 
Total de compras "parceladas": R$ 192.56
 
Total de descontos: R$ 220.06
Total de Juros: R$ 11.26 

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
	    
		System.out.println("Lista de códigos e suas respectivas classificações: ");
		
		System.out.println("Código Classificação");
		System.out.println("1 À vista, com 8% de desconto");
		System.out.println("2 À vista no cartão, 4% de desconto");
		System.out.println("3 Em 2x, preço normal sem juros");
		System.out.println("4 Em 4x, preço acrescido de 8%");
		
		
		int cod1, cod2, cod3, cod4, cod5;
		double valtot01, valtot02, valtot03, valtot04, valtot05;
		double valfin01, valfin02, valfin03, valfin04, valfin05;
		double AVista = 0, parceladas = 0, descontos = 0, totJuros = 0;
		
		System.out.println("\nCompra 01");
		System.out.print("Digite o valor total: R$ ");
		valtot01 = teclado.nextFloat();
		System.out.print("Digite a forma de pagamento: ");
		cod1 = teclado.nextInt();
		if ((cod1 != 1) && (cod1 != 2) && (cod1 != 3) && (cod1 != 4)) {
		System.out.println("Opção inválida, a compra não será processada.");
	    }
	    
        if (cod1 == 1){
            valfin01 = valtot01 - (valtot01 * 0.08);
            descontos = valtot01*0.08;
            AVista = valfin01;
            System.out.println("Desconto de 8%");
            System.out.printf("Valor final: R$ %.2f\n", valfin01);
            
        } else if(cod1 == 2){
            valfin01 = valtot01 - (valtot01 * 0.04);
            descontos = valtot01*0.04;
            AVista = valfin01;
            System.out.println("Desconto de 4%");
            System.out.printf("Valor final: R$ %.2f\n", valfin01);
            
        } else if(cod1 == 3){
            valfin01 = valtot01;
            parceladas = valtot01;
            System.out.printf("Em 2x de R$ %.2f\n", (valfin01/2));
            System.out.printf("Valor final: R$ %.2f\n", valfin01);
            
        } else if (cod1 == 4){
            valfin01 = (valtot01*1.08);
            parceladas = valtot01;
            totJuros = valtot01*0.08;
            System.out.printf("Em 4x de R$ %.2f\n", (valfin01/4));
            System.out.printf("Valor final: R$ %.2f\n", valfin01);
            
        }
	    
		
		System.out.println("\nCompra 02");
		System.out.print("Digite o valor total: R$ ");
		valtot02 = teclado.nextFloat();
		System.out.print("Digite a forma de pagamento: ");
		cod2 = teclado.nextInt();
		if ((cod2 != 1) && (cod2 != 2) && (cod2 != 3) && (cod2 != 4)) {
		System.out.println("Opção inválida, a compra não será processada.");
	    }
	    if (cod2 == 1){
            valfin02 = valtot02 - (valtot02 * 0.08);
            descontos = descontos + (valtot02 * 0.08);
            AVista = AVista + valfin02;
            System.out.println("Desconto de 8%");
            System.out.printf("Valor final: R$ %.2f\n", valfin02);
            
        } else if(cod2 == 2){
            valfin02 = valtot02 - (valtot02 * 0.04);
            descontos = descontos + (valtot02 * 0.04);
            AVista = AVista + valfin02;
            System.out.println("Desconto de 4%");
            System.out.printf("Valor final: R$ %.2f\n", valfin02);
            
        } else if(cod2 == 3){
            valfin02 = valtot02;
            parceladas = parceladas + valfin02;
            System.out.printf("Em 2x de R$ %.2f\n", (valfin02/2));
            System.out.printf("Valor final: R$ %.2f\n", valfin02);
            
        } else if (cod2 == 4){
            valfin02 = (valtot02*1.08);
            parceladas = parceladas + valfin02;
            totJuros = totJuros + (valtot02*0.08);
            System.out.printf("Em 4x de R$ %.2f\n", (valfin02/4));
            System.out.printf("Valor final: R$ %.2f\n", valfin02);
            
        }
		
		System.out.println("\nCompra 03");
		System.out.print("Digite o valor total: R$ ");
		valtot03 = teclado.nextFloat();
		System.out.print("Digite a forma de pagamento: ");
		cod3 = teclado.nextInt();
		if ((cod3 != 1) && (cod3 != 2) && (cod3 != 3) && (cod3 != 4)) {
		System.out.println("Opção inválida, a compra não será processada.");
	    }
	    if (cod3 == 1){
            valfin03 = valtot03 - (valtot03 * 0.08);
            descontos = descontos + (valtot03 * 0.08);
            AVista = AVista + valfin03;
            System.out.println("Desconto de 8%");
            System.out.printf("Valor final: R$ %.2f\n", valfin03);
            
        } else if(cod3 == 2){
            valfin03 = valtot03 - (valtot03 * 0.04);
            descontos = descontos + (valtot03 * 0.08);
            AVista = AVista + valfin03;
            System.out.println("Desconto de 4%");
            System.out.printf("Valor final: R$ %.2f\n", valfin03);
            
        } else if(cod3 == 3){
            valfin03 = valtot03;
            parceladas = parceladas + valfin03;
            System.out.printf("Em 2x de R$ %.2f\n", (valfin03/2));
            System.out.printf("Valor final: R$ %.2f\n", valfin03);
            
        } else if (cod3 == 4){
            valfin03 = (valtot03*1.08);
            parceladas = parceladas + valfin03;
            totJuros = totJuros + (valtot03*0.08);
            System.out.printf("Em 4x de R$ %.2f\n", (valfin03/4));
            System.out.printf("Valor final: R$ %.2f\n", valfin03);
        }
	    
		
		System.out.println("\nCompra 04");
		System.out.print("Digite o valor total: R$ ");
		valtot04 = teclado.nextFloat();
		System.out.print("Digite a forma de pagamento: ");
		cod4 = teclado.nextInt();
		if ((cod4 != 1) && (cod4 != 2) && (cod4 != 3) && (cod4 != 4)) {
		System.out.println("Opção inválida, a compra não será processada.");
	    }
	    
        if (cod4 == 1){
            valfin04 = valtot04 - (valtot04 * 0.08);
            descontos = descontos + (valtot04 * 0.08);
            AVista = AVista + valfin04;
            System.out.println("Desconto de 8%");
            System.out.printf("Valor final: R$ %.2f\n", valfin04);
            
        } else if(cod4 == 2){
            valfin04 = valtot04 - (valtot04 * 0.04);
            descontos = descontos + (valtot04 * 0.08);
            AVista = AVista + valfin04;
            System.out.println("Desconto de 4%");
            System.out.printf("Valor final: R$ %.2f\n", valfin04);
            
        } else if(cod4 == 3){
            valfin04 = valtot04;
            parceladas = parceladas + valfin04;
            System.out.printf("Em 2x de R$ %.2f\n", (valfin04/2));
            System.out.printf("Valor final: R$ %.2f\n", valfin04);
            
        } else if (cod4 == 4){
            valfin04 = (valtot04*1.08);
            parceladas = parceladas + valfin04;
            totJuros = totJuros + (valtot04*0.08);
            System.out.printf("Em 4x de R$ %.2f\n", (valfin04/4));
            System.out.printf("Valor final: R$ %.2f\n", valfin04);
            
        }
		
		System.out.println("\nCompra 05");
		System.out.print("Digite o valor total: R$ ");
		valtot05 = teclado.nextFloat();
		System.out.print("Digite a forma de pagamento: ");
		cod5 = teclado.nextInt();
		if ((cod5 != 1) && (cod5 != 2) && (cod5 != 3) && (cod5 != 4)) {
		System.out.println("Opção inválida, a compra não será processada.");
	    }
	    
        if (cod5 == 1){
            valfin05 = valtot05 - (valtot05 * 0.08);
            descontos = descontos + (valtot05 * 0.08);
            AVista = AVista + valfin05;
            System.out.println("Desconto de 8%");
            System.out.printf("Valor final: R$ %.2f\n", valfin05);
            
        } else if(cod5 == 2){
            valfin05 = valtot05 - (valtot05 * 0.04);
            descontos = descontos + (valtot05 * 0.08);
            AVista = AVista + valfin05;
            System.out.println("Desconto de 4%");
            System.out.printf("Valor final: R$ %.2f\n", valfin05);
            
        } else if(cod5 == 3){
            valfin05 = valtot05;
            parceladas = parceladas + valfin05;
            System.out.printf("Em 2x de R$ %.2f\n", (valfin05/2));
            System.out.printf("Valor final: R$ %.2f\n", valfin05);
            
        } else if (cod5 == 4){
            valfin05 = (valtot05*1.08);
            parceladas = parceladas + valfin05;
            totJuros = totJuros + (valtot05*0.08);
            System.out.printf("Em 4x de R$ %.2f\n", (valfin05/4));
            System.out.printf("Valor final: R$ %.2f\n", valfin05);
            
        }

		
		System.out.printf("\nTotal de compras \"À vista\": R$ %.2f", AVista);
		System.out.printf("\nTotal de compras \"parceladas\": R$ %.2f\n", parceladas);
		
		System.out.printf("\nTotal de descontos: R$ %.2f", descontos);
		System.out.printf("\nTotal de Juros: R$ %.2f", totJuros);
//********************************************************************************************************************************************************//
	}
}




