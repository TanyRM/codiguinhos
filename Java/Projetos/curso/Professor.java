package curso.src;

public class Professor {
  private String nomep;
  private String disciplina;
  private String email;
  
  public void setNomep(String nomep){
	this.nomep = nomep;
  }
  public String getNomep(){
    return this.nomep;
  }
  public void setDisciplina(String disciplina){
	this.disciplina = disciplina;
  }
  public String getDisciplina(){
    return this.disciplina;
  }
  public void setEmail(String email){
	this.email = email;
  }
  public String getEmail(){
    return this.email;
  }
}
