import java.util.*;
public class Exercicio2
{
    public static void main(String[] args)
    {

        //A lista apresenta os elementos na ordem que foram inseridos
        //O Hash faz da mesma forma, porém não possui elementos repetidos
        //A arvore apresenta os elementos em ordem crescente
        String[] cores = {"vermelho", "branco", "azul", "verde", "cinza",
                "laranja", "laranja", "cinza","vermelho"};
        // A classe Arrays fornece o m�todo static asList para visualizar um Array
        // como uma cole��o List. Assim, List permite manipular o array
        // como se ele fosse uma lista. Isso � �til para adicionar os elementos de
        // um array a uma cole��o ou classificar elementos de array.
        List <String> list = new ArrayList<>(Arrays.asList(cores));

        // Imprime os elementos da cole��o
        System.out.println("Lista");
        printCollection(list);

        System.out.println();

        Set<String> hash = new HashSet<>();
        for(String c: cores)
            hash.add(c);


        Set<String> tree = new TreeSet<>();
        for(String c: cores)
            tree.add(c);

        System.out.println("Hash");
        printCollection(hash);
        System.out.println();
        System.out.println("Arvore");
        printCollection(tree);
    }
    public static void printCollection(Collection<String> c){
        System.out.println(c);
    }
}
