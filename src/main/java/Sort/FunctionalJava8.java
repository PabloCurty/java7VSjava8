package Sort;

import Model.Family;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Usando lambda para comparar no Java 8
public class FunctionalJava8 {
    public static void main(String[] args) {
        List<Family> familyList = Arrays.asList(
                new Family(1,"Tony", "Stark"),
                new Family(2, "Pablo", "Curty"),
                new Family(3, "Marcele", "Simões")
        );

        Collections.sort(familyList, (f1, f2) -> f1.getName().compareTo(f2.getName()));

        System.out.println("Java 8 - " + familyList);
    }
}
