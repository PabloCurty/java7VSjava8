package CSVToMemoryCharge;

import Model.ClientPhone;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CSVFile {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("clients-phones.csv");

        List<ClientPhone> clientPhones = Files.lines(file)
                .map(line -> line.split(";"))
                .map(arr -> new ClientPhone(arr[0], arr[1], arr[2]))
                .filter(tel -> tel.getAreaCode().equals("19"))
                .collect(Collectors.toList());

        clientPhones.stream().forEach(System.out::println);
    }
}
