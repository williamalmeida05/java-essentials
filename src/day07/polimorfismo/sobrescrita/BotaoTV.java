package day07.polimorfismo.sobrescrita;

public class BotaoTV extends Botao{
    @Override
    public void ligar() {
//        super.ligar();
        System.out.println("ligando a TV");
    }

    @Override
    public void desligar() {
//        super.desligar();
        System.out.println("chega de TV por hoje, vai descansar ZzZzZz");
    }
}
