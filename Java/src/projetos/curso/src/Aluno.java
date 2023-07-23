package projetos.curso.src;

public class Aluno {
  private String nomea;
  private String matricula;
  private double[] notas;
  public double media = 0;
  
  public void setNomea(String nomea){
	this.nomea = nomea;
  }
  public String getNomea(){
    return nomea;
  }
  public void setMatricula(String matricula){
	this.matricula = matricula;
  }
  public String getMatricula(){
    return this.matricula;
  }
  public void setNotas(double[] notas){
	this.notas = notas;
  }
  public double[] getNotas(){
    return this.notas;
  }
}
