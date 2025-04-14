package geometricas;

public class TestaFigura {
    public static void main(String[] args){
        Figura fig1, fig2, fig3;

        fig1 = new Figura();
        System.out.println("Área da figura 1: "+fig1.area(33));

        fig2 = new Quadrado();
        System.out.println("Área da figura 2: "+fig2.area(44.2));

        fig3 = new Circulo();
        System.out.println("Área da figura 3: "+fig3.area(11.6));
    }
}
