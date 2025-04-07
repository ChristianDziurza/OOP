package livraria.unicentro;

public class Livro {
    private String titulo, autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
}
