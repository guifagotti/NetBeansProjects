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
public class ContaCorrente extends Conta
{
    
        public ContaCorrente ()
    {  
        
    }
    
        
  @Override
           public void Deposito(double valor)
    {
        this.Saldo = ((Saldo + valor)-0.1);
    }
            
            public double Atualiza(double taxa)
    {
        this.Saldo = Saldo + (Saldo*(2*taxa));
        return Saldo;
    }
            
                

    
}
