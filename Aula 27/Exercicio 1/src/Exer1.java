import java.util.*;

public class Exer1{
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Chirs", 70);
        tm.put("Joao", 80);
        tm.put("Luis", 90);
        tm.put("Gustavo", 100);

        //a.
        tm.put("Gustavo", 100);

        Set<Map.Entry<String, Integer>> set = tm.entrySet();

        for(Map.Entry<String, Integer> m : set){
            System.out.println("Aluno: "+m.getKey());
            System.out.println("Nota: "+m.getValue());
            System.out.println();
        }
    }
}
