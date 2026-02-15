package sistema;

import java.io.Serializable;
‎
‎public class Disciplina implements Serializable {
‎
‎    private int id;
‎    private String nome;
‎
‎    public Disciplina(int id, String nome) {
‎        this.id = id;
‎        this.nome = nome;
‎    }
‎
‎    public int getId() { return id; }
‎    public String getNome() { return nome; }
‎}
‎