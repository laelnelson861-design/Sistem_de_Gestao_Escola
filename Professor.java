package sistema ;

import java.io.Serializable;
‎
‎public class Professor extends Usuario implements Serializable {
‎
‎    private int disciplinaId;
‎    private int turmaId;
‎
‎    public Professor(int id, String nome, String username,
‎                     String senha, int disciplinaId, int turmaId) {
‎
‎        super(id, nome, username, senha, Perfil.PROFESSOR);
‎        this.disciplinaId = disciplinaId;
‎        this.turmaId = turmaId;
‎    }
‎
‎    public int getDisciplinaId() { return disciplinaId; }
‎    public int getTurmaId() { return turmaId; }
‎}