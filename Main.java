package calc;


import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		
		short operacao;

	       double num1, num2, num3;    

	       Scanner input = new Scanner(System.in);

	       

	       do {
	    	   
	    	   	System.out.println("CALCULADORA SIMPLES 1.0 by Dwight A. de Souza RA:20047170-5");
	    	   
	            System.out.println("Digite a operacao desejada:");

	            System.out.println("  1. Soma");      

	            System.out.println("  2. Subtracao");      

	            System.out.println("  3. Multiplicacao");      

	            System.out.println("  4. Divisao");

	            System.out.println("  0. Sair");

	            System.out.print("Operacao: ");

	            operacao = input.nextShort();


	            if (!OperacaoExiste(operacao)) {

	             continue;

	            }

	            if (operacao == 0) {

	             System.out.println("Programa Encerrado!");

	             break;

	            }  

  

	            System.out.print("Digite o primeiro valor: ");

	            num1 = input.nextDouble();

	             

	            System.out.print("Digite o segundo valor: ");

	            num2 = input.nextDouble();

	             

	            if (!ValidaDadosDeEntrada(operacao, num1, num2)) {

	             continue;

	            }

	       

	            System.out.println("RESULTADO: O resultado da operacao " + getNomeOperacao(operacao) + " � " + Calcular(operacao, num1, num2) + "\n");

	       } while (operacao != 0);

	   }

	   

	   static double Calcular (short operacao, double num1, double num2) {

	    double resultado = 0;

	    switch (operacao) {

	     case 1: //soma

	      resultado = num1 + num2;

	      break;

	     case 2: //substra��o

	      resultado = num1 - num2;

	      break;

	     case 3: //multiplica��o

	      resultado = num1 * num2;

	      break;

	     case 4: //divis�o

	      resultado = num1 / num2;

	      break;

	    }

	    return resultado;

	   }

	   

	   static boolean OperacaoExiste (short operacao) {

	       boolean retorno = true;

	    if (operacao > 5) {

	        System.out.println("ERRO: Operacao escolhida � invalida.\n");

	        retorno = false;

	       }

	    return retorno;

	   }

	   

	   static boolean ValidaDadosDeEntrada (short operacao, double num1, double num2) {

	    boolean retorno = true;  

	    if (operacao == 4 & num2 == 0) {

	         System.out.println("ERRO: Divisor nao pode ser zero.\n");

	         retorno = false;

	       }

	    return retorno;

	   }

	   

	   static String getNomeOperacao (short operacao) {

	     

	    switch (operacao) {

	 case 1:

	  return "soma";

	 case 2:

	  return "subtracao";

	 case 3:  

	  return "multiplicacao";

	 case 4:  

	  return "divisao";


	               default:

	                       return "undefined";

	    }

	     

	   }

	}