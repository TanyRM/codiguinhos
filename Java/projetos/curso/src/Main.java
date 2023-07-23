package projetos.curso.src;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite o nome do curso: ");
    String nome = scan.nextLine();
    
    System.out.printf("Entre com os dias e as horas do curso: ");
    Horario horario = new Horario();
    horario.setDias(scan.nextLine());
    horario.setHoras(scan.nextInt());
    scan.nextLine();
    
    Professor professor = new Professor();
    System.out.print("Digite o nome do professor: ");
    professor.setNomep(scan.nextLine());
    System.out.print("Digite a disciplina: ");
    professor.setDisciplina(scan.nextLine());
    System.out.print("Digite o email: ");
    professor.setEmail(scan.nextLine());
    
    Curso curso = new Curso();
    curso.setNome(nome);
    curso.setHorario(horario);
    curso.setProfessor(professor);
    
    System.out.println("Quantos alunos o curso possui?");
    int numAlunos = scan.nextInt();
    scan.nextLine();
    
    double mediac = 0;
    Aluno[] alunos = new Aluno[numAlunos];
    for (int i=0;i<numAlunos;i++){
      Aluno aluno = new Aluno();
      System.out.printf("Digite o nome do aluno: ");
      aluno.setNomea(scan.nextLine());
      System.out.printf("Digite a matricula do aluno: ");
      aluno.setMatricula(scan.nextLine());
      double[] notas = new double[4];
      for (int j=0;j<4;j++){
        System.out.printf("Digite a nota: ");
        notas[j] = scan.nextDouble();
        aluno.media += notas[j];
        scan.nextLine();
      }
      aluno.setNotas(notas);
      aluno.media /= 4;
      mediac += aluno.media;
      alunos[i] = aluno;
    }
    curso.setAlunos(alunos);
   	mediac /= numAlunos; 
    curso.setMedia(mediac);
    
    int op = scan.nextInt();
    scan.nextLine();
    switch(op){
      case 1: double m = curso.getMedia();
        System.out.printf("A media da turma é: %.2f\n", m);
        break;
      case 2: 
        System.out.printf("Digite o nome do aluno: ");
        String nomeal = scan.nextLine();
        for (Aluno a : curso.getAlunos()){
          if (a.getNomea().equals(nomeal)){
            System.out.println(a.media);
          }
        }
      	break;
    }
  }
}
