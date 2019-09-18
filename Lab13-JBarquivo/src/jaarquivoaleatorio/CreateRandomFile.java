/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author guifagotti
 */
public class CreateRandomFile {
    private static final int NUMBER_RECORDS = 100;
    
    public void createFile() throws FileNotFoundException, IOException
    {
        //criando uma instancia nula do arquivo binario
        
        RandomAccessFile file = null;
        try
        {
        
        file = new RandomAccessFile("client.dat","rw");
        
      
        RandomAccessAccountRecord registro = new RandomAccessAccountRecord();
        for(int count = 0; count <NUMBER_RECORDS; count++)
        {
            registro.write(file);
        }
        }catch (IOException ex)
        {
            System.out.println("Erro ao processar o arquivo");
        }
        finally 
        {
            try
            {
                if (file!=null)
                    file.close();
            }
            catch(IOException e)
            {
                System.out.println("Erro ao fechar o arquivo");
                System.exit(1);                  
            }
        } 
                 
    }
   
}
