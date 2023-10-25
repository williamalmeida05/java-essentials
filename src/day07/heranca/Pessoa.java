package day07.heranca;

public class Pessoa {
    public static void main(String[] args){

        PessoaDesenvolvedoraFrontEnd pessoaDesenvolvedoraFrontEnd = new PessoaDesenvolvedoraFrontEnd("Will","java e spring", 3489.6);
        pessoaDesenvolvedoraFrontEnd.codar();
        System.out.println(pessoaDesenvolvedoraFrontEnd.getNome());

        PessoaDesenvolvedoraBackEnd pessoaDesenvolvedoraBackEnd = new PessoaDesenvolvedoraBackEnd("Will Almeida","javaescripto",10.545);
        pessoaDesenvolvedoraBackEnd.codar();
        System.out.println(pessoaDesenvolvedoraBackEnd.getSalario());

    }
}
