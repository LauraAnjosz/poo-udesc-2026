package exercicio2oo.classes;

public class Livro {
    public String titulo;
    public String autor;
    public String genero;
    public boolean emprestado=true;

    public void emprestado(){
        if(emprestado){
            System.out.println("Emprestado");
        }else{
            System.out.println("Disponível");
        }
    }
}
