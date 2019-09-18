/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

/**
 *
 * @author guifagotti
 */
public final class AccountRecord {
   private int Conta;
   private String PrimeiroNome;
   private String SegundoNome;
   private double Saldo;
   
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
      Conta = acct;
   } // end method setAccount

   // get account number
   public int getAccount() 
   { 
      return Conta; 
   } // end method getAccount
   
   // set first name   
   public void setFirstName( String first )
   {
      PrimeiroNome = first;
   } // end method setFirstName

   // get first name   
   public String getFirstName() 
   { 
      return PrimeiroNome; 
   } // end method getFirstName
   
   // set last name   
   public void setLastName( String last )
   {
      SegundoNome = last;
   } // end method setLastName

   // get last name   
   public String getLastName() 
   {
      return SegundoNome; 
   } // end method getLastName
   
   // set balance  
   public void setBalance( double bal )
   {
      Saldo = bal;
   } // end method setBalance

   // get balance   
   public double getBalance() 
   { 
      return Saldo; 
   } // end method getBalance
} // end class AccountRecord