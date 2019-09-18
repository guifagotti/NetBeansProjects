/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import GUI.emp_CLT;
import GUI.emp_HOR;

/**
 *
 * @author GuiFagotti
 */
public class Empregado {

    emp_CLT GET1 = new emp_CLT();
    emp_HOR GET2 = new emp_HOR();

    public String nome;
    public String endereco;
    public String CPF;

    public Empregado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String cpf) {
        this.CPF = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void InserirDadosEmpregadosCLT() {

        setNome(GET1.nome);// ler a string e pular pra proxima linha nextline
        setCpf(GET1.CPF);
        setEndereco(GET1.endereco);
    }

    public void InserirDadosEmpregadosHorista() {

        setNome(GET1.nome);// ler a string e pular pra proxima linha nextline
        setCpf(GET1.CPF);
        setEndereco(GET1.endereco);
    }

}
