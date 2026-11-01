package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args){
        Aluno laura = new Aluno();

        laura.setMatricula("8152312605");
        laura.setNome("Laura Bassani dos Anjos");
        laura.setIdade(22);
        laura.setNota1(8);
        laura.setNota2(9);
        laura.setNota3(6);
        laura.setNota4(7);

        System.out.printf("Matrícula: %s", laura.getMatricula());
        System.out.printf("\nNome: %s", laura.getNome());
        System.out.printf("\nIdade: %d", laura.getIdade());
        System.out.printf("\nNota 1: %d", laura.getNota1());
        System.out.printf("\nNota 2: %d", laura.getNota2());
        System.out.printf("\nNota 3: %d", laura.getNota3());
        System.out.printf("\nNota 4: %d", laura.getNota4());
    }
}
