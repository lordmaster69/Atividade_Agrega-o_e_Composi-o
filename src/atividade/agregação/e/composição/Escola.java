/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.agregação.e.composição;

/**
 *
 * @author jv200
 */
import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Turma> turma = new ArrayList<Turma>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }
    
    public void ExibirTurma(){
        System.out.println("Turma: "+this.getTurma());   
    }
}
