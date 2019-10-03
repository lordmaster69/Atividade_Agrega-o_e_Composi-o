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
public class Aluno {
    private int codAluno;
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4){
        this.nota4 = nota4;
    }
    
    public String ExibirSituacao(){
       double media= (nota1+nota2+nota3+nota4)/4;
       if(media>=7){
           return this.getNome()+", sua média é: "+media+". Você está Aprovado.";
       }
       else{
           return this.getNome()+", sua média é: "+media+". Você está Reprovado.";
       } 
    }
}
