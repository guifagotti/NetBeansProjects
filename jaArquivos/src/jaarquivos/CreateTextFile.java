/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jaarquivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgard Lamounier JR
 */
public class CreateTextFile {
    private Formatter output; // atributo utilizado para gerar saída de texto no 
                              // arquivo

   // permite ao usuário abrir o arquivo
   public void openFile() throws IOException
   {
      try
      {
         output = new Formatter( new BufferedWriter (new FileWriter("clients.txt" , true )));
      } // fim do try
      catch ( SecurityException securityException )
      {
         JOptionPane.showMessageDialog(null, "You do not have write access to this file." );
         System.exit( 1 );
      } // fim do catch
      catch ( FileNotFoundException filesNotFoundException )
      {
         JOptionPane.showMessageDialog(null,  "Error creating file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método openFile

   // adiciona registros ao arquivo
   public void addRecords(int acc, String fn , String ln , double b)
   {
      // objeto a ser gravado no arquivo

         try // gera saída dos valores para o arquivo
         {
            

            if ( acc > 0 )
            {
               // grava um novo registro
               output.format( "%d %s %s %.2f\n", acc, fn, ln, b  );                             
            } // fim do if
            else
            {
                JOptionPane.showMessageDialog(null, "Account number must be greater than 0.");
                
            } // fim do else
         } // fim do try
         catch ( FormatterClosedException formatterClosedException )
         {
            JOptionPane.showMessageDialog(null,  "Error writing to file." );
            return;
         } // fim do catch
         catch ( NoSuchElementException elementException )
         {
            JOptionPane.showMessageDialog(null, "Invalid input. Please try again." );
             // descarta entrada para o usuário tentar de novo
         } // fim do catch
  
   } // fim do método addRecords

   // fecha o arquivo
   public void closeFile()
   {
      if ( output != null )
         output.close();
   } // fim do método closeFile
    
} // fim da classe CreateTextFile
