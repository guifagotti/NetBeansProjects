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
public abstract class Pagtos {
    protected String cpf; //int não suporta o valor de cpf
    protected double valor;
    protected int cod;
    
    public Pagtos(){       
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public void Entrada(){
        setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
        setCod((int) Double.parseDouble(JOptionPane.showInputDialog("Digite o Código: ")));       
        
    }
    
    public abstract double Faturamento();  // como todo pagamento deverá ser faturado, obrigaremos as classes filhas como
                                           // a saude e alimentação à implementar o método Faturamento

}
