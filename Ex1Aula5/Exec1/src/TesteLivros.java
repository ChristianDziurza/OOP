public class TesteLivros {
    public static void main(String[] args){
        Livro livro1 = new Livro();
        livro1.exibeLivro();
        System.out.println("Quantidade de livros: "+Livro.getContadorLivros());

        Livro livro2 = new Livro("Memórias Póstumas de Bras Cubas","Machado de Assis");
        livro2.exibeLivro();
        System.out.println("Quantidade de livros: "+Livro.getContadorLivros());
    }
}
