import java.io.File;

public class ProgramFile {

    public static void main(String[] args) {
        // creazione oggetto file
        File myFile = new File("prova.txt");

        // controllo se il file esiste
        if (myFile.exists()) {
            // se esiste stampa a video
            System.out.println("Esiste");
        } else {
            // se non esiste lo crea
            myFile.createNewFile();
        }

        // controllo se il file che ho selezionato sia una cartella
        if (myFile.isDirectory()) {
            System.out.println("E' una cartella");
        } else {
            System.out.println("E' un file");
        }
    }

}
