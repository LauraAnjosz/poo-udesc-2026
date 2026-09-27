package exercicio1oo;

public class TestaLivro {
    public static void main(String[] args){
        Livro alice = new Livro();

        alice.titulo = "Alice no País das Maravilhas";
        alice.autor = "Lewis Carrol";
        alice.genero = "Fantasia";
        alice.emprestado = false;

        System.out.println("Título: "+alice.titulo);
        System.out.println("Autor: "+alice.autor);
        System.out.println("Gênero: "+alice.genero);
        System.out.print("Status: ");
        alice.emprestado();

        System.out.println("====================");

        Livro hamlet = new Livro();

        hamlet.titulo = "Hamlet";
        hamlet.autor = "William Shakespeare";
        hamlet.genero = "Tragédia";
        hamlet.emprestado = true;

        System.out.println("Título: "+hamlet.titulo);
        System.out.println("Autor: "+hamlet.autor);
        System.out.println("Gênero: "+hamlet.genero);
        System.out.print("Status: ");
        hamlet.emprestado();
    }
}
