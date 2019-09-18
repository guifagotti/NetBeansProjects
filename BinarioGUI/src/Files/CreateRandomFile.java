package Files;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.RandomAccessFile;


/**
 *
 * @author guifagotti
 */
public class CreateRandomFile {
    private static final int NUMBER_RECORDS = 100;

   // permite que o usuário selecione o arquivo a abrir
   public void createFile()
   {
      RandomAccessFile file = null;

      try // abre o arquivo para leitura e gravação
      {
         file = new RandomAccessFile( "clients.dat", "rw" );

         RandomAccessAccountRecord blankRecord = 
            new RandomAccessAccountRecord();

         // grava 100 registros vazios
         for ( int count = 0; count < NUMBER_RECORDS; count++ )
            blankRecord.write( file );

         // exibe uma mensagem de que o arquivo foi criado
         System.out.println( "Created file clients.dat." );

         //System.exit( 0 ); // termina o programa
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error processing file." );
         System.exit( 1 );
      } // fim do catch
      finally
      {
         try
         {
            if ( file != null )
               file.close(); // fecha o arquivo
         } // fim do try
         catch ( IOException ioException )
         {
            System.err.println( "Error closing file." );
            System.exit( 1 );
         } // fim do catch
      } // fim do finally 
   } // fim do método createFile

}
