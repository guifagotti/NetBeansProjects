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
public class Saude extends Pagtos{
    private String estabelecimento;
    
    public Saude(){
        super();
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
    
    public void EntradaSaude(){
        super.Entrada();
        setEstabelecimento(JOptionPane.showInputDialog("Digite o Estabelecimento: "));        
    }
    
    @Override
    public double Faturamento() {
        return(1.12*getValor());
    }
    
    
}
