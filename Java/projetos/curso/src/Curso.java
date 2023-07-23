package projetos.curso.src;

public class Curso {
  private String nome;
  private Horario horario;
  private Professor professor;
  private Aluno[] alunos;
  private double media = 0;
  
  public void setNome(String nome){
	this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setHorario(Horario horario){
    this.horario = horario;
  }
  public Horario getHorario(){
    return horario;
  }
  public void setProfessor(Professor professor){
    this.professor = professor;
  }
  public Professor getProfessor(){
    return professor;
  }
  public void setAlunos(Aluno[] alunos){
    this.alunos = alunos;
  }
  public Aluno[] getAlunos(){
    return alunos;
  }
  public void setMedia(double media){
    this.media = media;
  }
  public double getMedia(){
    return media;
  }
}
