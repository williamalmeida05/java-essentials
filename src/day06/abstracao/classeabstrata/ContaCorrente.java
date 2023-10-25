package day06.abstracao.classeabstrata;

public class ContaCorrente extends Conta{
    @Override
    public void consultarSaldo() {
        System.out.println("seu saldo é 1234");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor que você deseja transferir");

    }
}
