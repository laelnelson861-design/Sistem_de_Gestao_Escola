package sistema;

import java.io.Serializable;
import java.util.ArrayList;

public class DataStore implements Serializable {

    public ArrayList<Turma> turmas = new ArrayList<>();
    public ArrayList<Disciplina> disciplinas = new ArrayList<>();
    public ArrayList<Aluno> alunos = new ArrayList<>();
    public ArrayList<Professor> professores = new ArrayList<>();
    public ArrayList<Trimestre> trimestres = new ArrayList<>();
    public ArrayList<DecisaoFinal> decisoes = new ArrayList<>();

    public int nextIdTurma = 1;
    public int nextIdDisciplina = 1;
    public int nextIdAluno = 1;
    public int nextIdProfessor = 1;
}