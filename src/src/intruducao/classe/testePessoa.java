package intruducao.classe;

public class testePessoa {
    public static void main(String[] args) {
        // veja que aqui a classe Pessoa pode criar quantas pessoas for necessaria;
        Pessoa pessoa1 = new Pessoa("manoel",24,'m');

        Pessoa pessoa2;
        // variavel de referencia
        pessoa2 = new Pessoa("ivo", 34,'m');
        // objeto pessoa


        pessoa1.implimir();
        System.out.println("------------------------");
        pessoa2.implimir();

    }
}
