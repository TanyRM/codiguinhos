package projetos.agenda.src;

public class Contato {
  public String nome;
  public String telefone;
  public String email;
  
  public Contato(String nome, String telefone, String email){
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
  }
  public void exibirContato(Contato contato){
    System.out.println(contato.nome);
    System.out.println(contato.telefone);
  	System.out.println(contato.email);
  }
  public void compararNome(String nome, Contato contato){
    if (nome.equals(contato.nome)){
      exibirContato(contato);
    }
  }
  /*public void exibirAgenda(){
    System.out.println(contato1.nome);
    System.out.println(contato1.telefone);
    System.out.println(contato1.email);
    System.out.println(contato2.nome);
    System.out.println(contato2.telefone);
    System.out.println(contato2.email);
    System.out.println(contato3.nome);
    System.out.println(contato3.telefone);
    System.out.println(contato3.email);
  }*/
  
}
