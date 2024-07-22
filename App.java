public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João", "123456789");
        Cliente cliente2 = new Cliente("Maria", "987654321");

        ContaCorrente cc1 = new ContaCorrente(1, 1000.0, cliente1, 500.0);
        ContaPoupanca cp1 = new ContaPoupanca(2, 2000.0, cliente2, 0.03);

        cliente1.setConta(cc1);
        cliente2.setConta(cp1);
     
        banco.criarConta(cc1);
        banco.criarConta(cp1);

        
        cc1.depositar(200.0);
        cp1.sacar(100.0);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}
