package sistema ;

import java.io.Serializable;
‎
‎public class Turma implements Serializable {
‎
‎    private int id;
‎    private String nome;
‎    private Turno turno;
‎
‎    public Turma(int id, String nome, Turno turno) {
‎        this.id = id;
‎        this.nome = nome;
‎        this.turno = turno;
‎    }
‎
‎    public int getId() { return id; }
‎    public String getNome() { return nome; }
‎}
