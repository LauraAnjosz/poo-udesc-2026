package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args){
        Livro alice = new Livro();

        alice.setTitulo("Alice no País das Maravilhas");
        alice.setAutor("Lewis Carrol");
        alice.setGenero("Fantasia");
        alice.setEmprestado(false);

        System.out.printf("Título: %s", alice.getTitulo());
        System.out.printf("\nAutor: %s", alice.getAutor());
        System.out.printf("\nGênero: %s", alice.getGenero());
        System.out.printf("\nStatus: ");
        alice.emprestado();

        System.out.printf("====================");

        Livro hamlet = new Livro();

        hamlet.setTitulo("Hamlet");
        hamlet.setAutor("William Shakespeare");
        hamlet.setGenero("Tragédia");
        hamlet.setEmprestado(true);

        System.out.printf("\nTítulo: %s", hamlet.getTitulo());
        System.out.printf("\nAutor: %s", hamlet.getAutor());
        System.out.printf("\nGênero: %s", hamlet.getGenero());
        System.out.printf("\nEmprestado: ");
        hamlet.emprestado();
    }
}
