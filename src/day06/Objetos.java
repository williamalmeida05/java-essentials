package day06;

public class Objetos {

    public static void main(String[] argss){
        Estudante willCode = new Estudante();
        willCode.setNome("William");
        willCode.setStack("Java e Spring");
        willCode.estudar();
        willCode.dormir();

        System.out.println(willCode.getNome());
        System.out.println(willCode.getStack());

    }

}
