package exercicio1oo;

public class TestaAluno {
    public static void main(String[] args){
        Aluno laura = new Aluno();

        laura.matricula = "8152312605";
        laura.nome = "Laura Bassani dos Anjos";
        laura.idade = 22;
        laura.nota1 = 8;
        laura.nota2 = 9;
        laura.nota3 = 6;
        laura.nota4 = 7;

        System.out.println("Matrícula: "+laura.matricula);
        System.out.println("Nome: "+laura.nome);
        System.out.println("Idade: "+laura.idade);
        System.out.println("Nota 1: "+laura.nota1);
        System.out.println("Nota 2: "+laura.nota2);
        System.out.println("Nota 3: "+laura.nota3);
        System.out.println("Nota 4: "+laura.nota4);
    }
}
