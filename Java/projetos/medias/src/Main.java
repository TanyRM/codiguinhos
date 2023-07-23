package projetos.medias.src;

import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome;
    String matricula;
    String curso;
    String disc1, disc2, disc3;
    double n1, n2, n3;
    double media;

    System.out.printf("Digite o nome do aluno:");
    nome = scan.nextLine();
    System.out.printf("Digite a matricula do aluno:");
    matricula = scan.nextLine();
    System.out.printf("Digite o curso do aluno:");
    curso = scan.nextLine();

    Aluno aluno = new Aluno(nome, matricula, curso);
    aluno.exibirAluno();

    System.out.printf("Digite a primeira disciplina: ");
    disc1 = scan.nextLine();
    System.out.printf("Digite as notas: ");
    n1 = scan.nextDouble();
    n2 = scan.nextDouble();
    n3 = scan.nextDouble();
    scan.nextLine();

    media = aluno.calcularMedia(n1, n2, n3);
    aluno.verificarAprov(disc1, media);

    System.out.printf("Digite a segunda disciplina: ");
    disc2 = scan.nextLine();
    System.out.printf("Digite as notas: ");
    n1 = scan.nextDouble();
    n2 = scan.nextDouble();
    n3 = scan.nextDouble();
    scan.nextLine();
    
    media = aluno.calcularMedia(n1, n2, n3);
    aluno.verificarAprov(disc2, media);

    System.out.printf("Digite a terceira disciplina: ");
    disc3 = scan.nextLine();
    System.out.printf("Digite as notas: ");
    n1 = scan.nextDouble();
    n2 = scan.nextDouble();
    n3 = scan.nextDouble();
    scan.nextLine();
    
    media = aluno.calcularMedia(n1, n2, n3);
    aluno.verificarAprov(disc3, media);
  }
}
