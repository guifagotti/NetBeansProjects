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
public class RandomAccessAccountRecord extends AccountRecord {
   //   Um RandomAccessAccountRecord contém: 
   //   um int (4 bytes), 
   //   duas strings de tamanho 15 caracteres (30 + 30 = 60 bytes)  e
   //   um double (8 bytes)
   //   TOTAL = 72 bytes.
    public static final int SIZE = 72;
    
   // construtor sem argumentos chama outro construtor com valores padrão
   public RandomAccessAccountRecord()
   {
      super( 0, "", "", 0.0 );
   } // fim do construtor de RandomAccessAccountRecord sem argumentos

   // inicializa uma RandomAccessAccountRecord
   public RandomAccessAccountRecord( int account, String firstName, 
      String lastName, double balance )
   {
      super( account, firstName, lastName, balance );
   } // fim do construtor de quatro argumentos da classe RandomAccessAccountRecord

   // lê um registro em um RandomAccessFile especificado
   public void read( RandomAccessFile file ) throws IOException
   {
      setAccount(file.readInt());
      setFirstName( readName( file ) );
      setLastName( readName( file ) );
      setBalance(file.readDouble());
   } // fim do método read

   // assegura que o nome tenha um comprimento adequado
   private String readName( RandomAccessFile file ) throws IOException
   {
      char name[] = new char[ 15 ], temp;

      for ( int count = 0; count < name.length; count++ )
      {
         temp = file.readChar();
         name[ count ] = temp;
      } // for final
      
      return new String( name ).replace( '\0', ' ' );
   } // fim do método readName

   // grava um registro no RandomAccessFile especificado
   public void write( RandomAccessFile file ) throws IOException
   {
      file.writeInt( getAccount() );
      writeName( file, getFirstName() );
      writeName( file, getLastName() );
      file.writeDouble( getBalance() );
   } // fim do método write

   // grava um nome no arquivo; máximo de 15 caracteres
   private void writeName( RandomAccessFile file, String name )
      throws IOException                                       
   {
      StringBuffer buffer = null;

      if ( name != null ) 
         buffer = new StringBuffer( name );
      else 
         buffer = new StringBuffer( 15 );

      buffer.setLength( 15 );
      file.writeChars( buffer.toString() );
   } // fim do método writeName

    
}
