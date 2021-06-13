import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uitlezer {

    private static Uitlezer singleton;



    private Uitlezer () {

    }

    public static Uitlezer getInstance() {
        if (singleton == null) {
            singleton = new Uitlezer ();
        }

        return singleton;
    }

    public ArrayList<String> leesFileUit(String filename) {
        ArrayList <String> titels = new ArrayList<>();
        try {

            File leesUit = new File("C:\\Users\\jangl\\OneDrive\\Documents\\GitHub\\opt3reqskijklijst\\src\\" + filename);
            Scanner scanner = new Scanner(leesUit);

            while (scanner.hasNextLine()) {
                titels.add(scanner.nextLine());

            }

        }

        catch (FileNotFoundException e) {
            System.out.println("kan bestand " + filename + " niet vinden");
        }

        return titels;
    }



}
