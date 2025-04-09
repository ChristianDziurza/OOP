package biblioteca;

public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String nome, double preco, String autor, int paginas){
        super(nome,preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }

    public boolean ehExtenso(){
        return paginas > 300;
    }

    @Override
    public boolean ehCaro() {
        return getPreco() > 40;
    }

    public boolean ehExtenso(char opiniao){
        if(opiniao == 'n')
            return false;
        else
            return true;
    }
}
