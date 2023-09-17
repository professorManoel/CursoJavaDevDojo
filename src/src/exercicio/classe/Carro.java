package exercicio.classe;

import java.time.LocalDate;


public class Carro {
    private String nome;
    private String modelo;
    private LocalDate ano;

    public Carro() {
    }

    public Carro(String nome, String modelo,  LocalDate ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("nome "+ nome);
        System.out.println("modelo "+ modelo);
        System.out.println("ano "+ ano);
    }

}

