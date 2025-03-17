public class ExemploAviao {
    public static void main(String[] args){
        Aviao aviao1 = new Aviao();

        aviao1.fabricante = "Boeing";
        aviao1.modelo = "777";
        aviao1.qtdeassentos = 368;
        aviao1.Ligar();

        Aviao aviao2 = new Aviao();
        aviao2.fabricante = "Boeing";
        aviao2.modelo = "707";
        aviao2.qtdeassentos = 308;
        aviao2.Ligar();
    }
}
