
package atividade.agregação.e.composição;


public class Principal {

    
    public static void main(String[] args) {
       Escola e = new Escola(); 
       e.setNome("Etec de Peruíbe");
       
       Turma t1 = new Turma();
       Turma t2 = new Turma();
       
       Aluno a1 = new Aluno();
       Aluno a2 = new Aluno();
       Aluno a3 = new Aluno();
       Aluno a4 = new Aluno();
       Aluno a5 = new Aluno();
       
       Aluno b1 = new Aluno();
       Aluno b2 = new Aluno();
       Aluno b3 = new Aluno();
       Aluno b4 = new Aluno();
       Aluno b5 = new Aluno();
      
       //TURMA1
       
       t1.setNomeTurma("2 MIN");
       
       a1.setNome("Gabriel Santos");
       a1.setNota1(10.0);
       a1.setNota2(8.5);
       a1.setNota3(8.0);
       a1.setNota4(10.0);
       a1.setCodAluno(2834);
       
       a2.setNome("Pietro Lopes");
       a2.setNota1(4.0);
       a2.setNota2(5.0);
       a2.setNota3(6.0);
       a2.setNota4(7.0);
       a2.setCodAluno(2845);
       
       a3.setNome("Guilherme Oliveira");
       a3.setNota1(8.0);
       a3.setNota2(9.0);
       a3.setNota3(8.0);
       a3.setNota4(10.0);
       a3.setCodAluno(2870);
       
       a4.setNome("Devisson Oliveira");
       a4.setNota1(5.0);
       a4.setNota2(7.0);
       a4.setNota3(7.0);
       a4.setNota4(7.0);
       a4.setCodAluno(2828);
       
       a5.setNome("João Victor Pereira");
       a5.setNota1(10.0);
       a5.setNota2(10.0);
       a5.setNota3(10.0);
       a5.setNota4(10.0);
       a5.setCodAluno(2844);
       
       //TURMA2
               
       t2.setNomeTurma("2 MAD");
       
       b1.setNome("Pedro França");
       b1.setNota1(10.0);
       b1.setNota2(9.5);
       b1.setNota3(9.0);
       b1.setNota4(10.0);
       b1.setCodAluno(2899);
       
       b2.setNome("Laura Bianca");
       b2.setNota1(8.0);
       b2.setNota2(9.0);
       b2.setNota3(9.0);
       b2.setNota4(9.0);
       b2.setCodAluno(2846);
       
       b3.setNome("Ana Carolina");
       b3.setNota1(9.0);
       b3.setNota2(9.0);
       b3.setNota3(8.0);
       b3.setNota4(10.0);
       b3.setCodAluno(2878);
       
       b4.setNome("Giovanna Kaori");
       b4.setNota1(9.0);
       b4.setNota2(10.0);
       b4.setNota3(10.0);
       b4.setNota4(9.0);
       b4.setCodAluno(2812);
       
       b5.setNome("Luis Felipe");
       b5.setNota1(7.0);
       b5.setNota2(6.0);
       b5.setNota3(7.0);
       b5.setNota4(8.0);
       b5.setCodAluno(2811);
       
       //DISPLAY
       
       System.out.println("Escola: "+e.getNome());
       System.out.println("---------------------------------");
       System.out.println("Turma: "+t1.getNomeTurma());
       System.out.println("");
       System.out.println("Alunos: ");
       System.out.println("");
       System.out.println(a1.ExibirSituacao());
       System.out.println(a2.ExibirSituacao());
       System.out.println(a3.ExibirSituacao());
       System.out.println(a4.ExibirSituacao());
       System.out.println(a5.ExibirSituacao());
       System.out.println("---------------------------------");
       System.out.println("Turma: "+t2.getNomeTurma());
       System.out.println("");
       System.out.println("Alunos: ");
       System.out.println("");
       System.out.println(b1.ExibirSituacao());
       System.out.println(b2.ExibirSituacao());
       System.out.println(b3.ExibirSituacao());
       System.out.println(b4.ExibirSituacao());
       System.out.println(b5.ExibirSituacao());
       
       
    }
    
}
