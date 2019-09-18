package Files;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author guifagotti
 */
public class WriteRandomFile {
    
   private RandomAccessFile output;
   private static final int NUMBER_RECORDS = 100;

   // permite que o usuário escolha o arquivo a abrir
   public void openFile()
   {
      try // abre o arquivo
      {
         output = new RandomAccessFile( "clients.dat", "rw" );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "File does not exist." );
      } // fim do catch
   } // fim do método openFile

   // fecha o arquivo e termina o aplicativo
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
   } // fim do método closeFile

   // adiciona registros ao arquivo
   public void addRecords(int acct, String first, String last, double bal)
   {
      // objeto (de nome record) a ser gravado no arquivo
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      int accountNumber; // número de conta para o objeto AccountRecord
      String firstName; // primeiro nome para o objeto AccountRecord
      String lastName; // sobrenome para objeto AccountRecord
      double balance; // saldo para objeto AccountRecord

    

      



//      while ( input.hasNext() ) // faz um loop até o indicador de fim de arquivo
//      {
         try // gera a saída dos valores para o arquivo
         {
            accountNumber = acct; // lê o número de conta
            firstName = first; // lê o primeiro nome
            lastName = last; // lê o sobrenome
            balance = bal; // lê o saldo

            if ( accountNumber > 0 && accountNumber <= NUMBER_RECORDS )
            {
               record.setAccount( accountNumber );
               record.setFirstName( firstName );  
               record.setLastName( lastName );    
               record.setBalance( balance );  
               // Responsável por encontrar a posição correta para inserir o registro
               output.seek( ( accountNumber - 1 ) * RandomAccessAccountRecord.SIZE ); 
               //Gravando os dados no arquivo
               record.write( output );                                   
            } // fim do if
            else
                
                JOptionPane.showMessageDialog(null, "Número da conta deve ser menor que 100.");
          
         } // fim do try
         catch ( IOException | NoSuchElementException ioException )
         {
            JOptionPane.showMessageDialog(null, ioException );
            
         }
       // fim do catch        //System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
           // "first name, last name and balance.", "? " );
//      } // fim do while
   } // fim do método addRecords

    
} // fim da classe WriteRandomFile
