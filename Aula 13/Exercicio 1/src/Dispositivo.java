public class Dispositivo {
    private int codigo;
    private String nome;

    public Dispositivo(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public String usar(){
        return "Está usanddo o dispositivo "+nome;
    }
}
