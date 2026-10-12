package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args){
        Circulo medida = new Circulo();

        medida.raio = 25.7;

        System.out.println("Raio: "+medida.raio);
    }
}
