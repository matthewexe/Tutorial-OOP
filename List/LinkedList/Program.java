import java.util.LinkedList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        // creo una lista dinamica che contiene oggetti di tipo Integer
        LinkedList<Integer> linkedList = new LinkedList<>();
        // alternativa per creare un oggetto di tipo LinkedList()
        // List<Integer> list = new LinkedList<>();

        // aggiungo elementi nella lista
        linkedList.add(9);
        linkedList.add(83);
        linkedList.add(485);
        linkedList.add(83);

        // Seleziono il valore contenuto all'index della lista
        int value = linkedList.get(0);
        System.out.println(value);

        // Recupero l'index del primo valore (in questo caso 83) che viene trovato
        // se non viene trovato ritorna -1
        int index = linkedList.indexOf(83);
        System.out.println(index);

        // Recupero l'index dell'ultimo valore (in questo caso 83) che viene trovato
        // se non viene trovato ritorna -1
        int lastIndex = linkedList.lastIndexOf(83);
        System.out.println(lastIndex);
    }

}