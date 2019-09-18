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
public class ContaPoupanca extends Conta
{
    
            public ContaPoupanca ()
    {  
        
    }
    
            public double Atualiza(double taxa)
    {
        this.Saldo = Saldo + (Saldo*(3*taxa));
        return Saldo;
    }
    
}
