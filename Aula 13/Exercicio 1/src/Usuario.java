public class Usuario {
    private String nome;
    private int matricula;
    private Dispositivo dispositivo;

    public Usuario(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setDispositivo(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }
    public String trabalhar(){
        return nome+" "+dispositivo.usar();
    }
}
