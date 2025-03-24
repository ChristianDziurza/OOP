public class Ponto2D {
    private double x, y;
    public static int contadorPontos = 0;

    public Ponto2D(){
        x = 0;
        y = 0;
        ++contadorPontos;
    }
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
        ++contadorPontos;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public static int getContadorPontos(){
        return contadorPontos;
    }

    public void exibePonto(){
        System.out.println("Coordenadas do ponto: ");
        System.out.printf("%.2f ",x);
        System.out.printf("%.2f\n",y);
    }

}
