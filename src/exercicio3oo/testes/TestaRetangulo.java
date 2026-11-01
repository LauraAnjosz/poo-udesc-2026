package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args){
        Retangulo medida = new Retangulo();

        medida.setLargura(12.6);
        medida.setAltura(9.8);

        System.out.printf("Largura: %.1f", medida.getLargura());
        System.out.printf("\nAltura: %.1f", medida.getAltura());
    }
}
