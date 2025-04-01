public class Compositor {
    private int codigo;
    private String nome;

    public Compositor(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public Compositor(){
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
