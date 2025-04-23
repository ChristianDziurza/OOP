public class AppCarro {
    public static void main(String args[]){
        Motor m1 = new Motor("3.8L V6");
        Bancos b1 = new Bancos("Riachuelo");
        Carro c1 = new Carro("Mustang", "Convers�vel", "Ford",m1,b1);

        Motor m2 = new Motor("COOPER");
        Bancos b2 = new Bancos("Renner");

        Carro c2 = new Carro("MINI", "COOPER SE", "BMW", m2,b2);

        Motor m3 = new Motor("Mercedes-Benz");
        Bancos b3 = new Bancos("Joao");

        Carro c3 = new Carro("Mercedes-EQ", "EQA 250", "Mercedes-Benz", m3,b3);

        System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3);
    }
}
