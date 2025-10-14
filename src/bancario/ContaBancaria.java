package bancario;

public class ContaBancaria {

    private final int numeroConta;
    private String titular;
    private double saldo;


    public ContaBancaria(int numeroConta, String titular) {

        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = depositoInicial;
    }


    public void depositar(double valor) {

        this.saldo += valor;
    }

    public void sacar(double valor){

        this.saldo -= (valor + 5.0);
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String exibirDados() {

        return "Número da conta: " + numeroConta + "\n"
                + "Titular: " + titular + "\n"
                + "Saldo: R$ " + String.format("%.2f", saldo);
    }





}




