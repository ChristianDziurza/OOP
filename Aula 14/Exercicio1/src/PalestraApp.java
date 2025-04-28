public class PalestraApp {
    public static void main(String[] args){
        Palestra[] pal = new Palestra[3];

        pal[0] = new Palestra(Luz.VERMELHO);
        pal[1] = new Palestra(Luz.AMBAR);
        pal[2] = new Palestra(Luz.VERDE);

        pal[0].acessa();
        pal[1].acessa();
        pal[2].acessa();
    }
}
