package day06.abstracao.interfaces;

public class LinuxTipsBankMain {
    public static void main(String[] args){
        ContaCorrente ccWill = new ContaCorrente();
        ccWill.consultarSaldo();
        ccWill.fazerPix();

        System.out.println("\n*************\n");

        ContaPoupanca cpWill = new ContaPoupanca();
        cpWill.consultarSaldo();
        cpWill.fazerPix();

    }

}
