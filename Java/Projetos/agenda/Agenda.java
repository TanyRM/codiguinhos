package agenda.src;
import agenda.src.Contato;

public class Agenda {
  Contato contato1;
  Contato contato2;
  Contato contato3;
  public void exibirAgenda(Contato contato1, Contato contato2, Contato contato3){
    System.out.println(contato1.nome);
    System.out.println(contato1.telefone);
    System.out.println(contato1.email);
    System.out.println(contato2.nome);
    System.out.println(contato2.telefone);
    System.out.println(contato2.email);
    System.out.println(contato3.nome);
    System.out.println(contato3.telefone);
    System.out.println(contato3.email);
  }
  
}
