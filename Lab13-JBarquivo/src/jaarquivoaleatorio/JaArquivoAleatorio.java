/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author guifagotti
 */
public class JaArquivoAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Teste de Arquivos Binários em Java");
        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("    Menu Principal");
            System.out.println("1- Criar arquivo Binário");
            System.out.println("2- Inserir registros no arquivo");
            System.out.println("3- Ler registros do arquivo");
            System.out.println("4- Sair");
            opcao = Integer.parseInt(input.next());
            switch(opcao){
                case 1:
                    System.out.println("Criando o arquivo...");
                    CreateRandomFile appCreate = new CreateRandomFile();
                    appCreate.createFile();
                    break;
                case 2:
                        System.out.println("\n");
                        System.out.println("Adicionando Registros!");
                        WriteRandomFile appWrite = new WriteRandomFile();
                        appWrite.openFile();
                        appWrite.addRecords();
                        appWrite.closeFile();
                        break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Lendo Registros!");
                    ReadRandomFile appRead = new ReadRandomFile();
                    appRead.OpenFile();
                    appRead.ReadRecords();
                    appRead.closeFile();
                    break;
                case 4: 
                    System.out.println("Saindo");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Leia as Instruções");
                    break;
            }
        }while(opcao!=4);
    }
}
