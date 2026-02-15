package sistema ;
import java.io.Serializable;
‎
‎public class Trimestre implements Serializable {
‎
‎    private int alunoId;
‎    private int professorId;
‎    private int disciplinaId;
‎    private int trimestre;
‎    private float[] notas = new float[3];
‎
‎    public Trimestre(int alunoId, int professorId,
‎                     int disciplinaId, int trimestre, float[] notas) {
‎
‎        this.alunoId = alunoId;
‎        this.professorId = professorId;
‎        this.disciplinaId = disciplinaId;
‎        this.trimestre = trimestre;
‎        this.notas = notas;
‎    }
‎}
‎
‎