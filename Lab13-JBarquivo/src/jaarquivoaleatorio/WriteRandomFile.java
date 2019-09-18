/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author guifagotti
 */
public class WriteRandomFile {
    
    public RandomAccessFile output = null;
    
    public void openFile()
    {
        try
        {
        output = new RandomAccessFile ("Clientes.dat", "rw");
        }
        catch (IOException ex) 
        {
                System.out.println(ex);
        }
    }
    
       public void closeFile() 
   {
      try // fecha o arquivo e encerra
      {
         if ( output != null )
            output.close();
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   }
    
    public void addRecords ()
    {
        RandomAccessAccountRecord records = new RandomAccessAccountRecord();
        int accountnumber;
        String FirstName, LastName;
        Double balanco;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da Conta:");
        accountnumber = Integer.parseInt(input.next()) ;
        System.out.println("Digite o Primeiro Nome:");
        FirstName = input.next();
        System.out.println("Digite o Segundo Nome:");
        LastName = input.next();
        System.out.println("Digite o saldo da Conta:");
        balanco = Double.parseDouble(input.next());
        
        if(accountnumber>0)
        {
            records.setAccount(accountnumber);
            records.setFirstName(FirstName);
            records.setLastName(LastName);
            records.setBalance(balanco);
           
        }else
        {
            System.out.println("Digite um numero de conta maior que 0 : "); 
            accountnumber = Integer.parseInt(input.next()) ;
        }
    }
    
}
