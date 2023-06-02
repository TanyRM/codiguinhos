import java.util.Scanner;

class Main{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    String nome, senha;

    nome = scan.nextLine();
    senha = scan.nextLine();

    do {
      if (nome.equals(senha)){ //comparação de strings s1.equals(s2)
        System.out.printf("Senha indisponivel\n");
        nome = scan.nextLine();
        senha = scan.nextLine();
        }
      } while (nome.equals(senha));
    
    System.out.printf("Usuario e senha cadastrados\n");
  }
}
