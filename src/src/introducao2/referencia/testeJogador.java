package introducao2.referencia;

public class testeJogador {

    public static void main(String[] args) {
        Jogado jogado = new Jogado();
        // crie uma objeto jogado e dei dei um nome.
        jogado.nome = "manoel";
        // crie um objeto jogado1 mas não dei nome.
        Jogado jogado1 = new Jogado();
        // note que jogado1 esta referenciando jogado
        jogado1 = jogado ;
        // como esta referênciando ele recebe e modificaca o jogado.
        // veja que ele faz referencia ao mesmo nome de jogado
        System.out.println(jogado1.nome);
        // Veja ele modificar o Jogado
        jogado1.nome = "João";
        System.out.println(jogado.nome);
        // note que jogado recebeu o nome de Manoel mas por jogado1 está referenciando o
    }   // mesmo objeto jogado. ele pode modar os valores dos atributos, logo o nome manoel será substituido por joão

}
