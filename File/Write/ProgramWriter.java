import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProgramWriter {

    public static void main(String[] args) {
        try {
            // creiamo un File che passeremo come argomento per creare un oggetto FileWriter
            File myFile = new File("prova.txt");

            // creiamo un FileWriter con la quale potremo scrivere solo byte.
            // Se il file che gli passiamo non esiste, viene creato.
            // Il secondo parametro lo mettiamo a true nel caso in cui noi volessimo aprire
            // il file in modalità "append", altrimenti verrebbe aperto in modalità "write"
            // cancellando tutto il suo contenuto
            FileWriter myFileWriter = new FileWriter(myFile, true);

            // Utiliziamo il PrintWriter per riuscire a scrivere stringhe o numeri dal
            // FileWriter che gli passiamo come argomento.
            // il secondo parametro che gli passiamo riguarda l'autoflush: se noi gli
            // passiamo true ad ogni operazione eseguita esegue in automatico
            // "myPrintWriter.flush()", mentre se noi non inserissimo niente oppure
            // inserissimo false dovremmo farlo noi manulamente
            PrintWriter myPrintWriter = new PrintWriter(myFileWriter, true);

            // scrive nel file la stringa che gli passo come parametro e va capo.
            myPrintWriter.println("Written line.");

            // chiusura del lettore del file
            myPrintWriter.close();
        } catch (IOException e) {
            System.out.println("Questo file è una directory o non può essere creato.");
        }
    }

}
