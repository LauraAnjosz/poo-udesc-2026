package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args){
        Carro corolla = new Carro();

        corolla.setModelo("Corolla");
        corolla.setMarca("Toyota");
        corolla.setAno(2024);
        corolla.setVelocidade(199.9);

        System.out.printf("Modelo: %s", corolla.getModelo());
        System.out.printf("\nMarca: %s", corolla.getMarca());
        System.out.printf("\nAno: %d", corolla.getAno());
        System.out.printf("\nVelocidade %.1fkm/h", corolla.getVelocidade());
    }
}
