package Files;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 *
 * @author guifagotti
 */
public class ReadRandomFile {
    private RandomAccessFile input;

   // permite que o usuário selecione o arquivo a abrir
   public void openFile()
   {
      try // abre o arquivo
      {
         input = new RandomAccessFile( "clients.dat", "r" );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "File does not exist." );
      } // fim do catch
   } // fim do método openFile
   
   // lê e grava registros
   public void readRecords()
   {
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      System.out.printf( "%-10s%-15s%-15s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );
   
      try // lê um registro e exibe
      {
         while ( true )
         {
            do
            {
               record.read( input );
            } while ( record.getAccount() == 0 );

            // exibe o conteúdo de registro
            System.out.printf( "%-10d%-12s%-12s%10.2f\n", record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
         } // fim do while
      } // fim do try
      catch ( EOFException eofException ) // fecha o arquivo
      {
         return; // fim do arquivo foi alcançado
      } // fim do catch
      catch ( IOException ioException )
      {
         System.err.println( "Error reading file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método readRecords
   
   // fecha o arquivo e termina o aplicativo
   public void closeFile() 
   {
      try // fecha o arquivo e encerra
      {
         if ( input != null )
            input.close();
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método closeFile

    
} // fim da classe ReadRandomFile
