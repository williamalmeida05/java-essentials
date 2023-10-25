package day07.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao{
    @Override
    public void ligar() {
        super.ligar();
//        System.out.println("hora de esquentar o rango");
    }

    @Override
    public void desligar() {
//        super.desligar();
        System.out.println("desligando porque já esquentou");
    }
}
