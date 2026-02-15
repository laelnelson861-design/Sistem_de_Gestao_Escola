package sistema;
import java.util.Scanner;
import java.io.*;
public class Sistema {
    static Scanner sc = new Scanner(System.in);
    static DataStore ds = Arquivo.carregar();

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int op;

        do {
            System.out.println("\n===== SISTEMA ESCOLAR =====");
            System.out.println("1 - Cadastrar Turma");
            System.out.println("2 - Cadastrar Disciplina");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Listar Alunos");
            System.out.println("0 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> cadastrarTurma();
                case 2 -> cadastrarDisciplina();
                case 3 -> cadastrarAluno();
                case 4 -> listarAlunos();
            }

        } while (op != 0);

        Arquivo.salvar(ds);
    }

    static void cadastrarTurma() {
        System.out.print("Nome da turma: ");
        String nome = sc.nextLine();

        Turma t = new Turma(ds.nextIdTurma++, nome, Turno.MANHA);
        ds.turmas.add(t);
        Arquivo.salvar(ds);
    }

    static void cadastrarDisciplina() {
        System.out.print("Nome da disciplina: ");
        String nome = sc.nextLine();

        Disciplina d =
            new Disciplina(ds.nextIdDisciplina++, nome);

        ds.disciplinas.add(d);
        Arquivo.salvar(ds);
    }

    static void cadastrarAluno() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        Aluno a =
            new Aluno(ds.nextIdAluno++, nome,
                      "Informática", Turno.MANHA, 1);

        ds.alunos.add(a);
        Arquivo.salvar(ds);
    }

    static void listarAlunos() {
        for (Aluno a : ds.alunos) {
            System.out.println(a.getId() +
                    " - " + a.getNome());
        }
    }
    }
    
}