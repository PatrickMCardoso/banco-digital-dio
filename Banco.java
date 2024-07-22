import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(Conta novaConta) {
        contas.add(novaConta);
    }
}
