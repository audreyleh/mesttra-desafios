import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    

    public static void imprimirMenu(){
        //constroi o menu de opcoes
        System.out.print("====== Bem vindo ao Sistema de Cálculo de Área ==========\n\n");
        System.out.print("1 - Trapézio \n");
        System.out.print("2 - Quadrado \n");
        System.out.print("3 - Retângulo \n");
        System.out.print("4 - Círculo \n");
        System.out.print("5 - Triângulo\n\n");        
    }
    
    public static int lerNumeroInteiro(String mensagem){
        //funcao especializada na leitura de um numero inteiro
        Scanner teclado;                

        int leitura = 0;
        boolean deuErro = false;

        //usamos este laco para garantir que o usuário digite um valor
        //inteiro conforme solicitado.
        do {
            System.out.print(mensagem);
            try {        
                //coloquei o new scanner neste ponto, pois o buffer esta
                //ficando sujo quando é gerado uma exception
                teclado = new Scanner(System.in);
                leitura = teclado.nextInt();
                deuErro = false;
            } catch (InputMismatchException erro) {
                System.out.print("Valor inválido, digite novamente.");
                deuErro = true;
            }
        } while(deuErro);
        
        return leitura;  
    }
    
    public static void imprimirTitulo(String palavra){
        System.out.print("Cálculo de área do " + palavra + ": \n");
    }
    
    public static void exibirCalculo(String palavra, float calculo){
        System.out.printf("\nA área do %s e %.2f.", palavra, calculo);
    }

    public static void calcularAreaTrapezio(){
        int altura, baseMaior, baseMenor;
        float calculo;
        //calculo do trapezio
        imprimirTitulo("trapezio");
        altura = lerNumeroInteiro("Digite a altura: ");
        baseMaior = lerNumeroInteiro("Digite o valor da base maior: ");
        baseMenor = lerNumeroInteiro("Digite o valor da base menor: "); 
        calculo = ((baseMenor + baseMaior) * altura) / 2;
        
        exibirCalculo("trapézio", calculo);        
    }
    public static void calcularAreaQuadrado(){
        int lateral;
        float calculo;
        
        imprimirTitulo("Quadrado");
        lateral = lerNumeroInteiro("Digite a lateral: ");
        calculo = lateral*lateral;
        
        exibirCalculo("quadrado", calculo);
    }
    public static void calcularAreaRetangulo(){
        int altura, largura;
        float calculo;
        imprimirTitulo("Retangulo");
        altura = lerNumeroInteiro("Digite o valor da altura: ");
        largura = lerNumeroInteiro("Digite o valor da largura: ");
        calculo = altura*largura;
        
        exibirCalculo("retangulo", calculo);
    }
    public static void calcularAreaCirculo(){
        int raio;
        float calculo;
        
        imprimirTitulo("circulo");
        raio = lerNumeroInteiro("Digite o valor do raio: ");
        calculo = raio*raio*3.14f;
        
        exibirCalculo("circulo", calculo);
        
    }
    public static void calculoAreaTriangulo(){
        int altura, base;
        float calculo;
        imprimirTitulo("triangulo");
        altura = lerNumeroInteiro("Digite o valor da altura: ");
        base = lerNumeroInteiro("Digite o valor da base: ");
        calculo = (base*altura)/2;
        
        exibirCalculo("triangulo", calculo);
    }
    
    
    public static void main(String[] args)  throws Exception {
        int resposta = 0;
        Scanner teclado = new Scanner(System.in);
  
        imprimirMenu();

        try {
            //le a opcao desejada
            resposta = lerNumeroInteiro("\nDigite uma das opções disponíveis: ");
            System.out.print("\n");

            //utiliza a estrutura if else para determinar qual opcao foi escolhida e realizar o calculo
            if (resposta == 1) {
                calcularAreaTrapezio();
                
            } else if (resposta == 2) {
                calcularAreaQuadrado();
            
            } else if (resposta == 3) {
                calcularAreaRetangulo();
                
            } else if (resposta == 4) { 
                calcularAreaCirculo();
                
            } else if (resposta == 5) {
                calculoAreaTriangulo();
                
            } else {
                System.out.print("Opção inválida.");
            }
        } catch (InputMismatchException ex){
            System.out.print("Opção digitada precisa ser um número: ");
            //bloco de comando
        }
    }
}
