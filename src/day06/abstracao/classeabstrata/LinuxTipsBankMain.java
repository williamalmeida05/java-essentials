package day06.abstracao.classeabstrata;

public class LinuxTipsBankMain {
    public static void main(String[] args){

        System.out.println("Seja bem vindo ao linux tips bank\n");
        ContaCorrente ccWill = new ContaCorrente();
        ccWill.consultarSaldo();
        ccWill.fazerPix();

        System.out.println("\n***************\n");
        ContaPoupanca cpWill = new ContaPoupanca();
        cpWill.consultarSaldo();
        cpWill.fazerPix();

    }
}
