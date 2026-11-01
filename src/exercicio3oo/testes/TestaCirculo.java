package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args){
        Circulo medida = new Circulo();

        medida.setRaio(25.7);

        System.out.printf("Raio: %.1f", medida.getRaio());
    }
}
