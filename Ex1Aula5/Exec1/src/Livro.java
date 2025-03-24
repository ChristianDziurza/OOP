public class Livro {
    private String titulo, autor;
    public static int contadorLivros;

    public Livro(){
        titulo = "Desconhecido";
        autor = "Anônimo";
        ++contadorLivros;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        ++contadorLivros;
    }

    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public static int getContadorLivros(){
        return contadorLivros;
    }

    public void exibeLivro(){
        System.out.println("Aqui está o livro "+getTitulo()+" do autor "+getAutor());
    }
}
