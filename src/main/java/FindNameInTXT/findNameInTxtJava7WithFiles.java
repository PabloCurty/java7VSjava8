package FindNameInTXT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class findNameInTxtJava7WithFiles {
    public static void main(String[] args) {
        String word = "Silva";
        String file = "names.txt";

        Integer accountable = 0;
        try {
            //problema, readAllLines lê o arquivo por completo em memória
            List<String> lines = Files.readAllLines(Paths.get(file));
            for (String line : lines){
                if(line.contains(word)) {
                    accountable++;
                }
            }
            System.out.printf("With Files - The word [%s] occurred %d times.\n", word, accountable);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

