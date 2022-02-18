import java.io.Console;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // dentro al try inseriamo il codice che potrebbe andare in errore
        // mentre nel catch inseriamo il codice che dev essere eseguito quando il
        // programma va in errore
        try {
            // System.in -> console
            // InputStreamReader -> serve per legger byte dalla console
            // Scanner -> serve per interpretare i byte che sono stati letti
            Scanner scanner = new Scanner(new InputStreamReader(System.in));

            // scanf("%s", ...);
            // String inputString = scanner.nextLine();
            int inputInteger = scanner.nextInt();

            System.out.println(inputInteger);

            scanner.close();
        } catch (InputMismatchException e) {
            // System.out.println(e.getMessage());
            System.out.println("errore");
        } catch (Exception e) {

        }
    }
}
