
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
public class EmpregadoHORISTA extends Empregado
{
    public int numero_horas;
    public double preco_hora;
    public double sal_brutoH;
    public double sal_liquidoH;
    
    public double getSal_liquidoH() 
    {
        return sal_liquidoH;
    }
    
     public void setSal_liquidoH(double sal_liquidoH) 
    {
        this.sal_liquidoH = sal_liquidoH;
    }
    
      public double getSal_brutoH() 
    {
        return sal_brutoH;
    }
    
    public void setSal_brutoH(double sal_brutoH) 
    {
        this.sal_brutoH = sal_brutoH;
    }
    
    public int getnHoras() {
        return numero_horas;
    }
    
    public void setnHoras(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public double getPrecoH() {
        return preco_hora;
    }

    public void setPrecoH(double preco_hora) {
        this.preco_hora = preco_hora;
    }        

    
    

    public double getPreco_hora() 
    {
        return preco_hora;
    }
    
    
    public double salLiquido() 
    {
        sal_liquidoH = numero_horas*preco_hora*0.85;
        return sal_liquidoH;
    }
    
    
        public void InserirDadosHorista(){
        super.InserirDadosEmpregadosHorista();
        setnHoras(GET2.nHoras);
        setPrecoH(GET2.PrecoH);
    }
              
   
    

    

    
}
