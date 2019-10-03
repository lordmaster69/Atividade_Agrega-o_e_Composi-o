package atividade.agregação.e.composição;


public class Aluno {
    private int codAluno;
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4){
        this.nota4 = nota4;
    }
    
    public String ExibirSituacao(){
       double media = (nota1+nota2+nota3+nota4)/4;
       if(media>=7){
           System.out.println("Cod. Aluno: "+this.codAluno);
           System.out.println("Nome: "+this.getNome());
           System.out.println("Nota 1: "+this.getNota1());
           System.out.println("Nota 2: "+this.getNota2());
           System.out.println("Nota 3: "+this.getNota3());
           System.out.println("Nota 4: "+this.getNota4());
           System.out.println("Média: "+media);
           System.out.println("Situação: Aprovado ");
       }
       else{
           System.out.println("Cod. Aluno: "+this.codAluno);
           System.out.println("Nome: "+this.getNome());
           System.out.println("Nota 1: "+this.getNota1());
           System.out.println("Nota 2: "+this.getNota2());
           System.out.println("Nota 3: "+this.getNota3());
           System.out.println("Nota 4: "+this.getNota4());
           System.out.println("Média: "+media);
           System.out.println("Situação: Reprovado ");       
       }
     return "";
    }
}
