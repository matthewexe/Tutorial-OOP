import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        // creo un array dinamico che contiene oggetti di tipo Integer
        ArrayList<Integer> arrayList = new ArrayList<>();
        // alternativa per creare un oggetto di tipo ArrayList()
        // List<Integer> array = new ArrayList<>();

        // aggiungo elementi nell'array
        arrayList.add(9);
        arrayList.add(83);
        arrayList.add(485);
        arrayList.add(83);

        // Seleziono il valore contenuto all'index dell'array
        int value = arrayList.get(0);
        System.out.println(value);

        // Recupero l'index del primo valore (in questo caso 83) che viene trovato
        // se non viene trovato ritorna -1
        int index = arrayList.indexOf(83);
        System.out.println(index);

        // Recupero l'index dell'ultimo valore (in questo caso 83) che viene trovato
        // se non viene trovato ritorna -1
        int lastIndex = arrayList.lastIndexOf(83);
        System.out.println(lastIndex);
    }

}