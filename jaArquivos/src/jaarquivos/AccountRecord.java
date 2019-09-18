/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivos;

/**
 *
 * @author Edgard Lamounier JR
 */

// AccountRecord - Classe que representa um registro de informação.
// A palavra reservada final quando usada na definição de uma classe, 
// significa que a classe não vai admitir herança.
// Na prática, estamos dizendo que para a aplicação que estamos contruindo,
// o formato de nosso Registro é imutável.

public final class AccountRecord {
   private int account;
   private String firstName;
   private String lastName;
   private double balance;
   
   // Construtor sem argumentos que chama outro construtor com valores default
   public AccountRecord() 
   {
      this( 0, "", "", 0.0 ); // chama um construtor de quatro argumentos
   } 
  
   // Inicializa um registro
   public AccountRecord( int acct, String first, String last, double bal )
   {
      setAccount( acct ); // account = acc;
      setFirstName( first );
      setLastName( last );
      setBalance( bal );
   } // end four-argument AccountRecord constructor
   
   // set account number   
   public void setAccount( int acct )
   {
      account = acct;
   } // end method setAccount

   // get account number
   public int getAccount() 
   { 
      return account; 
   } // end method getAccount
   
   // set first name   
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // get first name   
   public String getFirstName() 
   { 
      return firstName; 
   } // end method getFirstName
   
   // set last name   
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // get last name   
   public String getLastName() 
   {
      return lastName; 
   } // end method getLastName
   
   // set balance  
   public void setBalance( double bal )
   {
      balance = bal;
   } // end method setBalance

   // get balance   
   public double getBalance() 
   { 
      return balance; 
   } // end method getBalance
} // end class AccountRecord
    

