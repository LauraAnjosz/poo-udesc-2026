package exercicio3oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado=true;

    public void emprestado(){
        if(emprestado){
            System.out.println("Emprestado");
        }else{
            System.out.println("Disponível");
        }
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean getEmprestado(){
        return emprestado;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
}
