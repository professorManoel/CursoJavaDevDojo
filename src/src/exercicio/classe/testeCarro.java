package exercicio.classe;


import introducao1.classe.Pessoa;

import java.time.LocalDate;

public class testeCarro {
    public static void main(String[] args) {

            Carro carro = new Carro("Gol", "Volkswagen", LocalDate.of(2023,01,01)) ;
            carro.imprimir();


    }

}
