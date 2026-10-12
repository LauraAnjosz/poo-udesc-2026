package exercicio2oo.testes;

import exercicio2oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args){
        Carro corolla = new Carro();

        corolla.modelo = "Corolla";
        corolla.marca = "Toyota";
        corolla.ano = 2024;
        corolla.velocidade = 199.9;

        System.out.println("Modelo: "+corolla.modelo);
        System.out.println("Marca: "+corolla.marca);
        System.out.println("Ano: "+corolla.ano);
        System.out.println("Velocidade: "+corolla.velocidade+"km/h");
    }
}
