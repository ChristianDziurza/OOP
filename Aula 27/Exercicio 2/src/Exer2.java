import java.util.*;

public class Exer2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Chris");
        l.add("Luis");
        l.add("Tiago");
        l.add("Tiririca");
        l.add("Gimli");

        System.out.println("Lista inicial");
        imprime(l);
        System.out.println();

        System.out.println();

        Collections.sort(l);//Ordena a lista
        System.out.println("Lista ordenada");
        imprime(l);

        System.out.println();
        System.out.println();
        System.out.println("Procurando Tiago");
        int indice = Collections.binarySearch(l,"Tiago");//Aplica busca binária para procurar um elemento específico na lista
        System.out.println("Achado no indice: "+indice);
        System.out.println();

        System.out.println();
        Collections.reverse(l);//Inverte uma lista
        System.out.println("Lista invertida");
        imprime(l);
        System.out.println();

        System.out.println();
        Collections.replaceAll(l,"Tiririca","Atumi");//Troca um elemento da lista por outro
        System.out.println("Adicionando Atumi");
        imprime(l);
        System.out.println();

        System.out.println();
        Collections.rotate(l,2);//Gira a lista para uma direção
        System.out.println("Girando duas casas pra direita");
        imprime(l);
        System.out.println();
    }
    public static <E> void imprime(Collection<E> c){
        for(E im : c){
            System.out.print(im);
            System.out.print(" ");
        }
    }
}
