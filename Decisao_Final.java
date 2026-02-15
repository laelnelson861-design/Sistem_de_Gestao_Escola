
import java.io.Serializable;
‎
‎public class Decisao_Final implements Serializable {
‎
‎    int alunoId;
‎    int disciplinaId;
‎    int professorId;
‎    StatusFinal status;
‎    String observacao;
‎
‎    public Decisao_Final(int alunoId, int disciplinaId,
‎                        int professorId,
‎                        StatusFinal status,
‎                        String observacao) {
‎
‎        this.alunoId = alunoId;
‎        this.disciplinaId = disciplinaId;
‎        this.professorId = professorId;
‎        this.status = status;
‎        this.observacao = observacao;
‎    }
‎}