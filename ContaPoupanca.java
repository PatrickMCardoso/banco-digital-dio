public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, double saldo, Cliente titular, double taxaRendimento) {
        super(numero, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
