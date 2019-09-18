/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guifagotti
 */
public class ReadRandomFile 
{
    public RandomAccessFile input = null;
  
    public void OpenFile()
    {
        
        
        try 
        {
            RandomAccessFile input = new RandomAccessFile("client.txt", "r");
                    
        } 
        
        catch (IOException ex) 
        {
            System.out.println(ex);
            System.out.println("Erro ao ler arquivo");
        }
    }
    
    public void ReadRecords ()
    {


        RandomAccessAccountRecord record = new RandomAccessAccountRecord();
        System.out.println("Account , First Name , Last Name , Balance");
     
        try 
        {
            RandomAccessFile input = new RandomAccessFile("client.dat" ,"r");
            while(true)
            {
                do
                {
                    record.read(input);
                }
                while(record.getAccount()==0);
                 System.out.println(record.getAccount() );
                 System.out.println(record.getFirstName());
                 System.out.println(record.getLastName());
                 System.out.println(record.getBalance());
                
            }
           
        }
        
                catch (IOException ex) 
        {
            System.out.println(ex);
            System.out.println("Erro ao ler arquivo");
        }
    }
    
    public void closeFile()
    {
     
        if(input!=null)
        {
            try
            {
                input.close();
            }
            catch (IOException ex)
            {
                System.out.println(ex);
               
            }
        }
    }
}
