import java.util.LinkedList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        // creo una lista dinamica che contiene oggetti di tipo Integer
        List<Integer> list = new LinkedList<>();

        // aggiungo elementi nella lista
        list.add(7);
        list.add(27);
        list.add(64);

        for (Integer integer : list) {

            // Stampo il valore della variabile integer
            // che contiene il valore assegnato all'inizio del ciclo.
            System.out.println(integer);
        }
    }

}
