package projetos.medias.src;

public class Aluno {
  String nome;
  String matricula;
  String curso;

  public Aluno(String nome, String matricula, String curso) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
  }

  public void exibirAluno() {
    System.out.printf("Nome: %s\nMatricula: %s\nCurso: %s\n", nome, matricula, curso);
  }

  public double calcularMedia(double n1, double n2, double n3) {
    double media = (n1 + n2 + n3) / 3;
    return media;
  }

  public void verificarAprov(String disc, double media) {
    System.out.printf("%s", disc);
    if (media >= 7) {
      System.out.printf("Média: %f\t Aprovado!", media);
    } else {
      System.out.printf("Média: %f\t Reprovado!", media);
    }
  }
}
