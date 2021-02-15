package FindNameInTXT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class findNameInTxtJava8Functional {
    public static void main(String[] args) {
        String word = "Silva";
        String file = "names.txt";

        try {
            long accountable = Files.lines(Paths.get(file))
                    .filter(line -> line.contains(word))
                    .count();
            System.out.printf("With Files, lambda, streams and filters - The word [%s] occurred %d times.\n", word, accountable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

