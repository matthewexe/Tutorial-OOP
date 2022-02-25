import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ProgramReader {

    public static void main(String[] args) {
        try {
            // creiamo un File che passeremo come argomento per creare un oggetto FileReader
            File myFile = new File("prova.txt");

            // creiamo un FileReader con la quale potremo leggere solo i byte contenuti nel
            // file
            FileReader myFileReader = new FileReader(myFile);

            // Utiliziamo lo Scanner per riuscire a legger stringhe o numeri dal FileReader
            // che gli passiamo come argomento
            Scanner myScanner = new Scanner(myFileReader);

            // il metodo hasNext controlla che non siamo arrivati alla fine del file
            // EOF è il suo equivalente in c
            while (myScanner.hasNext()) {

                // Leggo una riga del mio file e la salvo in una variabile
                String line = myScanner.nextLine();

                // Stampo la riga salvata
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File non trovato");
        }
    }

}
