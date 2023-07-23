package projetos.agenda.src;

import java.util.Scanner;

//agenda
class Main {
  
  public static void main(String[] args) {
    String nomeAgenda;
    String nome;
    String telefone;
    String email;
    int op;
  	Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com o nome da agenda: ");
    nomeAgenda = scan.nextLine();
    
    System.out.print("\nDigite o nome do primeiro contato: ");
    nome = scan.nextLine();
    System.out.print("Digite o telefone do primeiro contato: ");
    telefone = scan.nextLine();
    System.out.print("Digite o email do primeiro contato: ");
    email = scan.nextLine();
    
    Contato contato1 = new Contato(nome,telefone,email);
    
    System.out.print("\nDigite o nome do segundo contato: ");
    nome = scan.nextLine();
    System.out.print("Digite o telefone do segundo contato: ");
    telefone = scan.nextLine();
    System.out.print("Digite o email do segundo contato: ");
    email = scan.nextLine();
    
    Contato contato2 = new Contato(nome,telefone,email);
    
    System.out.print("\nDigite o nome do terceiro contato: ");
    nome = scan.nextLine();
    System.out.print("Digite o telefone do terceiro contato: ");
    telefone = scan.nextLine();
    System.out.print("Digite o email do terceiro contato: ");
    email = scan.nextLine();
    
    Contato contato3 = new Contato(nome,telefone,email);
    
    do {
    System.out.printf("\nEscolha uma opção: \n1- Visualizar agenda\n2- Visualizar contato\n3- Finalizar\n");
    op = scan.nextInt();
    scan.nextLine();
    switch(op){
      case 1: System.out.println("\n"+nomeAgenda);
       	contato1.exibirContato(contato1);
        System.out.println("");
       	contato2.exibirContato(contato2);
        System.out.println("");
        contato3.exibirContato(contato3);
        System.out.println("");
        break;
      case 2: System.out.printf("\nDigite o nome do contato que deseja acessar: ");
        nome = scan.nextLine();
        contato1.compararNome(nome,contato1);
        contato2.compararNome(nome,contato2);
        contato3.compararNome(nome,contato3);
        break;
      case 3: break;
      default: System.out.println("Opção invalida!");
      
    }
  } while (op!=3);
}
}
