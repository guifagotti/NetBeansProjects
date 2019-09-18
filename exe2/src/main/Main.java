/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Classes.Alimentacao;
import Classes.Saude;

/**
 *
 * @author GuiFagotti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alimentacao p1 = new Alimentacao();
        p1.EntradaAlimentacao();
        System.out.println(p1.Faturamento());
        
        
        Saude s1 = new Saude();
        s1.EntradaSaude();
        System.out.println(s1.Faturamento());
    }
    
}
