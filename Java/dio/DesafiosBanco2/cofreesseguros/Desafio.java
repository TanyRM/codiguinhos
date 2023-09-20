package DesafiosBanco2.cofreesseguros;

import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      scanner.nextLine();
      int confirmacaoSenha = scanner.nextInt();
      CofreDigital cofre = new CofreDigital(senha);
      System.out.println("Tipo: " + cofre.tipo);
      System.out.println("Metodo de abertura: " + cofre.metodoAbertura);
      if (cofre.validarSenha(confirmacaoSenha) == true) {
        System.out.println("Cofre aberto!");
      }
      else {
        System.out.println("Senha incorreta!");
      }
    }
    else {
      CofreFisico cofre = new CofreFisico();
      System.out.println("Tipo: " + cofre.tipo);
      System.out.println("Metodo de abertura: " + cofre.metodoAbertura);
    }
  }
}