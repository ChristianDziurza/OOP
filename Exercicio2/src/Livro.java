public class Livro {
    private String titulo, autor;

    public void setTitulo(String titulo1){
        titulo = titulo1;
    }
    public void setAutor(String autor1){
        autor = autor1;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void exibeLivro(){
        System.out.println("Aqui esta o livro "+getTitulo()+" do autor "+getAutor());
    }
}
