package day06.abstracao.interfaces;

public class ContaPoupanca implements Conta{
    @Override
    public void consultarSaldo() {
        System.out.println("o saldo da sua conta é 0");
    }

    @Override
    public void fazerPix() {
        System.out.println("deu ruim");
    }
}
