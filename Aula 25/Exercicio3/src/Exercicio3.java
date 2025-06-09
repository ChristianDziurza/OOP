import java.text.CollationElementIterator;
import java.util.*;
public class Exercicio3 {
    public static void main(String[] args) {
        String[] cores = { "preto", "amarelo", "verde", "azul", "branco" };
        List<String> list1 = new LinkedList<>(Arrays.asList(cores));
        System.out.println("Lista 1");
        printList(list1);
        String[] cores2 = {"dourado", "prata", "marron", "cinza"};
        List<String> list2 = new LinkedList<>(Arrays.asList(cores2));

        System.out.println();
        System.out.println("Lista 2");
        printList(list2);

        list1.addAll(list2);
        System.out.println();
        System.out.println("Lista Concatenada");
        printList(list1);
    }
    public static <E> void printList(Collection<E> c){
        for(E cs: c)
            System.out.println(cs);
    }
}
