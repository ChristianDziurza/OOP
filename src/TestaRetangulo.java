import java.util.*;
public class TestaRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo(40, 40);

        System.out.println("Comprimento de ret1: ");
        double comp = scanner.nextDouble();
        System.out.println("Largura de ret1: ");
        double larg = scanner.nextDouble();
        ret1.setComprimento(comp);
        ret1.setLargura(larg);

        System.out.println("Retângulo 1");
        ret1.mostraArea();
        ret1.mostraPerimetro();
        ret1.respostaQuadrado();

        System.out.println("Retângulo 2");
        ret2.mostraArea();
        ret2.mostraPerimetro();
        ret2.respostaQuadrado();
    }
}
