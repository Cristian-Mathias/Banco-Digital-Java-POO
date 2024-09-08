
public class Main {

    public static void main(String[] args) {
        Cliente cristian = new Cliente();
        cristian.setNome("Cristian");

        IConta cc = new ContaCorrente(cristian);
        cc.depositar(100);
        IConta poupanca = new ContaPoupanca(cristian);
        cc.transferir(poupanca,100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}