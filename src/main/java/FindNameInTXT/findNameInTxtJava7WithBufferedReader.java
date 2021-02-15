package FindNameInTXT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class findNameInTxtJava7WithBufferedReader {
    public static void main(String[] args) {
        String word = "Silva";
        String file = "names.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            Integer contador = 0;
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                if(line.contains(word)){
                    contador++;
                }
            }
            System.out.printf("With Buffered Reader - The word [%s] occurred %d times.\n", word, contador);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

