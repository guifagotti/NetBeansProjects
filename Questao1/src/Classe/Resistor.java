/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import javax.swing.JOptionPane;

/**
 *
 * @author guifagotti
 */
public class Resistor 
{
    private double Resistencia = 0;
    private double Potencia = 0;
    
    
    public Resistor()
    {  
        
    }
    
    public Resistor (double Res, Double Pot)
    {
        this.Resistencia = Res;
        this.Potencia = Pot;
    }
    
    public double GetResistencia()
    {
        return Resistencia;
    }
    
    public void SetResistencia(double Res)
    {
        this.Resistencia = Res;
    }
    
    public double GetPotencia()
    {
        return Potencia;
    }
    
    public void SetPotencia(double Pot)
    {
        this.Potencia = Pot;
    }   
 
     public Resistor Serie(Resistor r1)
     {
        Resistor calcula = new Resistor();
        calcula.SetResistencia(GetResistencia() + r1.GetResistencia()); // SOMA RESISTENCIAS
        
        if(r1.GetPotencia()>GetPotencia()) // SE POTENCIA DO PRIMEIRO FOR MAIOR QUE A DO SEGUNDO 
        {
            calcula.SetPotencia(GetPotencia());  // DEIXA POTENCIA DO SEGUNDO        
        }
        else{
            calcula.SetPotencia(r1.GetPotencia());  // SE NAO, DEIXA POTENCIA DO PRIMEIRO
        }            
        return calcula;  // RETORNA OS VALORES            
    }
    
    public Resistor Paralelo(Resistor r1)
    {
        Resistor calcula = new Resistor();
        calcula.SetResistencia((GetResistencia()*r1.GetResistencia())/(GetResistencia()+r1.GetResistencia()));
        // (R1*R2)/(R1 + R2)
        
        if(r1.GetPotencia()>GetPotencia()) // SE POTENCIA DO PRIMEIRO FOR MAIOR QUE A DO SEGUNDO 
        {
            calcula.SetPotencia(GetPotencia());  // DEIXA POTENCIA DO SEGUNDO           
        }
        else{
            calcula.SetPotencia(r1.GetPotencia()); // SE NAO, DEIXA POTENCIA DO PRIMEIRO
        }            
        return calcula;    // RETORNA OS VALORES     
    }   
    
      public void Imprimir(){
        JOptionPane.showMessageDialog(null, "\nResistor: "+GetResistencia()+" ohms "+GetPotencia()+" W" );        
    }
    
}
