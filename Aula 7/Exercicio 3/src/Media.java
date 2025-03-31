import java.util.*;
public class Media {
    public static void main(String[] args){
        double array[] = new double[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i< array.length;i++)
            array[i] = scanner.nextDouble();
        for(double a: array){
            System.out.println("Valor: "+a);
        }
        System.out.println("Media dos valores: "+media(array));
    }
    public static double media(double ...val){
        double soma = 0;
        for(double n: val)
            soma += n;
        return soma/val.length;
    }
}
