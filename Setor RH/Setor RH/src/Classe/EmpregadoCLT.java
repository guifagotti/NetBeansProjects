/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;



/**
 *
 * @author GuiFagotti
 */
public class EmpregadoCLT extends Empregado 
        
{
    private double sal_brutoCLT;
    private double sal_LiquidoCLT;
    
    
       public EmpregadoCLT()
       
       {
       
       }
    
    public double getsBrutoCLT() {
        return sal_LiquidoCLT;
    }

    public void setsBrutoCLT(double sBrutoCLT) {
        this.sal_LiquidoCLT = sBrutoCLT;
    }  
       

    
    
    public double salLiquido() 
    {
        if(sal_brutoCLT <=5000)
            sal_LiquidoCLT = 0.85 * sal_brutoCLT;
        else
            sal_LiquidoCLT = 0.725 * sal_brutoCLT;
        
        return sal_LiquidoCLT;
    }
    
        public void InserirDadosCLT(){

         super.InserirDadosEmpregadosCLT();
         setsBrutoCLT(GET1.salarioB);
     }
}
