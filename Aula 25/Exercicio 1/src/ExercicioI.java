import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExercicioI {
    public static void main(String[] args) {
        List<String> as = new ArrayList<>();

        as.add("Jonas");
        as.add("Walter");
        as.add("Chris");
        as.add("Luis");

        ListIterator<String> it = as.listIterator(as.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
