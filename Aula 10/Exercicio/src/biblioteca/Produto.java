package biblioteca;

public class Produto {
    private String nome;
    private double preco;

    public Produto(){
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public boolean ehCaro(){
        return preco > 80;
    }

    public boolean ehCaro(String nome){
        if(nome == "Pao de queijo")
            return preco > 20;
        return preco > 80;
    }
}
