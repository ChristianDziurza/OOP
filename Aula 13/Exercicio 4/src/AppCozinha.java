public class AppCozinha {
    public static void main(String[] agrs){
        Geladeira g1 = new Geladeira();
        Liquidificador l1 = new Liquidificador();
        Microondas m1 = new Microondas();

        g1.ligar();
        l1.desligar();
        m1.desligar();

        Cozinha c1 = new Cozinha(g1,l1,m1);

        g1.observar();
        l1.observar();
        m1.observar();

        System.out.println();

        System.out.println("Desligando todos");
        c1.desligar();
        g1.observar();
        l1.observar();
        m1.observar();

        System.out.println();

        System.out.println("Ligando todos");
        c1.ligar();
        g1.observar();
        l1.observar();
        m1.observar();


    }
}
