public class Principal {
    public static void main(String[] args) {
        Contas conta1 = new Contas();
        conta1.saldo = 10.000;
        conta1.agencia ="01";
        conta1.dataAbertura = "10/10";
        conta1.titular = "Pedro";

        double rendimento = conta1.calcularRendimentoMensal(2);
        System.out.printf("Saldo rendimento é de: %f%n", rendimento);

        conta1.imprimirConta();
    }
}