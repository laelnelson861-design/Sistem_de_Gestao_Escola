package sistema ;
import java.io.*;
public class Usuario implements Serializable {
‎    private int id;
‎    private String nome;
‎    private String username;
‎    private String senha;
‎    private Perfil perfil;
‎
‎    public Usuario(int id, String nome, String username,
‎                   String senha, Perfil perfil) {
‎        this.id = id;
‎        this.nome = nome;
‎        this.username = username;
‎        this.senha = senha;
‎        this.perfil = perfil;
‎    }
‎
‎    public int getId() { return id; }
‎    public String getNome() { return nome; }
‎    public String getUsername() { return username; }
‎}