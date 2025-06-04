import java.util.ArrayList;

public class Pastelaria_Pistola {
    public static void main(String[] args) {
        ArrayList<Pastel> pasteis = new ArrayList<>();

        pasteis.add(new Pastel("Pastel de Frango", 1200.50));
        pasteis.add(new Pastel("Pastel de Pizza", 8000.75));
        pasteis.add(new Pastel("Pastel de Presunto e Queijo", 1000.89));

        pasteis.get(1).setPreco(50000.90);
        System.out.println(pasteis);

        pasteis.remove(2);
    }
}
