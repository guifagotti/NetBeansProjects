/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author IgorMoreira
 */
public class Resistor {
    private double res;
    private double pot;
    
    public Resistor(){        
    }
    
    public Resistor(double res, double pot){
        this.res=res;
        this.pot=pot;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getPot() {
        return pot;
    }

    public void setPot(double pot) {
        this.pot = pot;
    }    
    
    public Resistor Serie(Resistor r1){
        Resistor req = new Resistor();
        req.setRes(getRes() + r1.getRes());
        if(r1.getPot()>getPot()){
            req.setPot(getPot());            
        }
        else{
            req.setPot(r1.getPot());
        }            
        return req;               
    }
    
    public Resistor Paralelo(Resistor r1){
        Resistor req = new Resistor();
        req.setRes((getRes()*r1.getRes())/(getRes()+r1.getRes()));
        if(r1.getPot()>getPot()){
            req.setPot(getPot());            
        }
        else{
            req.setPot(r1.getPot());
        }            
        return req;        
    }
    
    public void Imprime(){
       JOptionPane.showMessageDialog(null, "\nResistor: "+getRes()+" ohms "+getPot()+" W" );        
    }
}
