package day06.encapsulamento;

public class Cachorro {

    //só acessa dentro da classe
    private Double peso;
    private Integer idade;

    // todo o projeto tem acesso
    public Double pesoPublic;
    public Integer idadePublic;

    //so dentro do meu pacote
    protected Double pesoProtected;
    protected Integer idadeProtected;

    // todo o projeto tem acesso
    public String latir(){
        return "AuaAuau";
    }

    protected String dormir(){
        return "ZzZzZzZz";
    }

    private String comer(){
        return "hora da ração";
    }

}
