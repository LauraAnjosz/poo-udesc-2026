package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args){
        Retangulo medida = new Retangulo();

        medida.largura = 12.6;
        medida.altura = 9.8;

        System.out.println("Largura: "+medida.largura);
        System.out.println("Altura: "+medida.altura);
    }
}
