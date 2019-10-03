
package atividade.agregação.e.composição;


import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeTurma;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void ExibirAlunos(){
        System.out.println("Aluno: "+ this.getAlunos());
       for(Aluno a1 : this.alunos){
      }
   }  
}
