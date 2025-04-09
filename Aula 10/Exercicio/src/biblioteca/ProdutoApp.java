package biblioteca;

public class ProdutoApp {
    public static void main(String[] args){
        Produto[] prod = new Produto[2];
        Livro[] liv = new Livro[2];

        prod[0] = new Produto("Café",79);
        prod[1] = new Produto("Pao de queijo",22);
        liv[0] = new Livro("Livro 1",56,"Machado de Assis",430);
        liv[1] = new Livro("Eba: Um guia para não sei oq não sei oq lá",60,"Clarice Lispector",9999);

        System.out.print("O produto é: ");
        System.out.print(prod[0].getNome()+" ");
        System.out.println("R$"+prod[0].getPreco());
        System.out.println("O prouto é caro? "+prod[0].ehCaro());
        System.out.println();

        System.out.print("O produto é: ");
        System.out.print(prod[1].getNome()+" ");
        System.out.println("R$"+prod[1].getPreco());
        System.out.println("O produto é caro? "+prod[1].ehCaro(prod[1].getNome()));
        System.out.println();

        System.out.print("O livro é: ");
        System.out.print(liv[0].getNome()+" ");
        System.out.println("R$"+liv[0].getPreco());
        System.out.println("Autor: "+liv[0].getAutor());
        System.out.println("Páginas: "+liv[0].getPaginas());
        System.out.println("O produto é caro? "+liv[0].ehCaro(liv[0].getNome()));
        System.out.println("O livro é extenso? "+liv[0].ehExtenso());
        System.out.println();

        System.out.print("O livro é: ");
        System.out.print(liv[1].getNome()+" ");
        System.out.println("R$"+liv[1].getPreco());
        System.out.println("Autor: "+liv[1].getAutor());
        System.out.println("Páginas: "+liv[1].getPaginas());
        System.out.println("O produto é caro? "+liv[1].ehCaro(liv[1].getNome()));
        System.out.println("O livro é extenso? "+liv[1].ehExtenso('n'));
        System.out.println();


    }
}
