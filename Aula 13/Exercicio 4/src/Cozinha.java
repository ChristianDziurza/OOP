public class Cozinha {
    private Geladeira geladeira;
    private Liquidificador liquidificador;
    private Microondas microondas;

    public Cozinha(Geladeira geladeira, Liquidificador liquidificador, Microondas microondas){
        this.geladeira = geladeira;
        this.liquidificador = liquidificador;
        this.microondas = microondas;
    }

    public void ligar(){
        geladeira.ligar();
        liquidificador.ligar();
        microondas.ligar();
    }

    public void desligar(){
        geladeira.desligar();
        liquidificador.desligar();
        microondas.desligar();
    }
}
