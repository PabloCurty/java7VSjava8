package Sort;

import Model.Family;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Usando classe anônima estílo Java 7
//Bollerplate, código repetitivo
public class FunctionalJava7 {
    public static void main(String[] args) {
        List<Family> familyList = Arrays.asList(
                new Family(1,"Tony", "Stark"),
                new Family(2, "Pablo", "Curty"),
                new Family(3, "Marcele", "Simões")
        );

        Collections.sort(familyList, new Comparator<Family>() {
            @Override
            public int compare(Family f1, Family f2) {
                return f1.getName().compareTo(f2.getName());
            }
        });

        System.out.println("Java 7 - " + familyList);
    }
}
