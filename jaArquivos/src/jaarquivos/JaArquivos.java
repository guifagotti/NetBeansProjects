/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivos;

import java.util.Scanner;

/**
 *
 * @author Edgard Lamounier JR
 */
public class JaArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Teste de Arquivos em Java");
        Scanner input = new Scanner( System.in );
        
        CreateTextFile application = new CreateTextFile();
        
        int escolha;
        //CreateTextFile application = new CreateTextFile();
        do {
            //for(int i = 0; i <= 50; i++)
                //System.out.print("\r\n");
      
                System.out.println("                     MENU PRINCIPAL  \n\n\n");
                System.out.println("\n                (1) - Abre arquivo");
                System.out.println("\n                (2) - Insere registros no arquivo");
                System.out.println("\n                (3) - Fecha arquivo");
                System.out.println("\n                (4) - Para SAIR");
            escolha = input.nextInt();
            switch (escolha)
            {
                case 1:
                    for(int i = 0; i <= 50; i++)
                        System.out.print("\r\n");
                   System.out.println("\napplication.openFile();");
                    application.openFile();
                    break;

                case 2:
                    for(int i = 0; i <= 50; i++)
                        System.out.print("\r\n");
                     System.out.println("\napplication.addRecords(); ");
                    application.addRecords();
                    break;

                case 3:
                    for(int i = 0; i <= 50; i++)
                        System.out.print("\r\n");
                     System.out.println("\napplication.closeFile();");
                    application.closeFile();
		break;

	   case 4:
		System.exit(1);
		break;

	   default :
		for(int i = 0; i <= 50; i++)
                        System.out.print("\r\n");
                System.out.println("\naLEIA AS INSTRUÇÕES!");
                break;
	 }
     } while (escolha!=4);
        
    } // fim do método void main 
               
} // fim da classe JaArquivos
