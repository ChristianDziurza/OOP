public class TestePonto2D {
    public static void main(String[] args){
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(4,6);
        p1.exibePonto();
        p2.exibePonto();

        System.out.println("Quantia de pontos: "+Ponto2D.getContadorPontos());
    }
}
