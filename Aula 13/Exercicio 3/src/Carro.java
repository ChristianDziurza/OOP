public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Bancos bancos;

    public Carro(String marca, String modelo, String fabricante, Motor motor, Bancos bancos) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.bancos = bancos;
    }

    @Override
    public String toString(){
        return " "+marca+" "+modelo+" "+fabricante+" "+motor+" "+bancos+" ";
    }

}
