/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author guifagotti
 */
public class Conta {
    
    public double Saldo;

    
    
    public Conta ()
    {  
        
    }
    
    public Conta (double saldo)
    {
        this.Saldo = saldo;
        
    }
    
    public double GetSaldo()
    {
        return Saldo;
    }
    
        public void SetSaldo(double saldo)
    {
        this.Saldo = saldo;
    }
        
            public double Deposito()
    {
        return Saldo;
    }
    
        public void Deposito(double valor)
    {
        this.Saldo = Saldo + valor;
    }
        
       public void Saca(double valor)
    {
        this.Saldo = Saldo - valor;
    }
       

        
  
   
    
    
}
