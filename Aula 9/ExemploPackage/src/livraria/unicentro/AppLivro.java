package livraria.unicentro;

public class AppLivro {
    public static void main(String[] args){
        Livro[] livros = new Livro[3];

        livros[0] = new Livro("Duna","Gilberto Gil",1996);
        livros[1] = new Livro("Senhor dos Anéis","Roberto Carlos",1975);
        livros[2] = new Livro("Chico Bento em: Não é como nóis sô","Kendrick Lamar",2004);

        for(Livro liv:livros){
            System.out.println(liv.getTitulo());
            System.out.println(liv.getAutor());
            System.out.println(liv.getAnoPublicacao());
            System.out.println();
        }
    }
}
