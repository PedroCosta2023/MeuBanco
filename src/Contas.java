public class Contas {

    String agencia;
    String titular;
    int numero;
    String dataAbertura;
    double saldo;
    static double taxaDeJurosMensal = 0.5;
    double valorDecimal = taxaDeJurosMensal /100;

    void sacar(double valor) {
        this.saldo -= valor;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    double calcularRendimentoMensal (int meses) {
        return this.saldo * (meses * valorDecimal);
    }

    void imprimirConta () {
        System.out.printf(
                " Titular: %s%n Agência: %s%n Numero: %d%n Data de abertura: %s%n Saldo: %f%n",
                this.titular, this.agencia, this.numero, this.dataAbertura, this.saldo
        );
    }

}
