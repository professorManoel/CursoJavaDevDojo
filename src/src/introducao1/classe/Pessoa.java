package introducao1.classe;

public class Pessoa {
    // imagine que eu tenha uma idade, um nome, um sexo. mas que esses dados não estão se relacionando. para isso entra as classes.

    // atributos
    private  String nome;
    private  int idade;
    private  char sexo;

    public Pessoa(){}
    // construtor
    public Pessoa(String nome, int idade, char sexo) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // métodos especial de impressão

    public void implimir(){
        System.out.println("nome "+nome);
        System.out.println("idade "+idade);
        System.out.println("sexo "+sexo);
    }

    // métodos gets onde tem retorno
    public String getNome() {
        return nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    // método sets modificador sem retorno
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }


}
