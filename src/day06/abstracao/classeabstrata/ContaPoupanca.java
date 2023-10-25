package day06.abstracao.classeabstrata;

public class ContaPoupanca extends Conta{
    @Override
    public void consultarSaldo() {
        System.out.println("o saldo da sua conta é zero");
    }

    @Override
    public void fazerPix() {
        System.out.println("deu ruim");
    }
}
