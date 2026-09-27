package exercicio1oo;

class Livro {
    String titulo;
    String autor;
    String genero;
    boolean emprestado=true;

    public void emprestado(){
        if(emprestado){
            System.out.println("Emprestado");
        }else{
            System.out.println("Disponível");
        }
    }
}
