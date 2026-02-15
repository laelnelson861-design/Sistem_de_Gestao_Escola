package sistema ;
import java.io.*;
public class Aluno implements Serializable {
‎
‎    private int id;
‎    private String nome;
‎    private String curso;
‎    private Turno turno;
‎    private int turmaId;
‎
‎    public Aluno(int id, String nome, String curso,
‎                 Turno turno, int turmaId) {
‎        this.id = id;
‎        this.nome = nome;
‎        this.curso = curso;
‎        this.turno = turno;
‎        this.turmaId = turmaId;
‎    }
‎
‎    public int getId() { return id; }
‎    public String getNome() { return nome; }
‎    public int getTurmaId() { return turmaId; }
‎}
‎