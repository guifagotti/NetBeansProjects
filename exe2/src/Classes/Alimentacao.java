/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author GuiFagotti
 */
public class Alimentacao extends Pagtos{
    private String descricao;    

    public Alimentacao(){
        super();
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void EntradaAlimentacao(){
        super.Entrada();
        setDescricao(JOptionPane.showInputDialog("Digite  descrição: "));        
    }
    
    @Override
    public double Faturamento(){        
        return (1.05*getValor());
    }
    
    
}
