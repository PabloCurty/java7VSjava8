package FindClientPerState;

import Model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//sintaxe expressiva
//expressiva, uso de funções especializadas
public class ClientsForStateJava8 {
    public static Map<String, List<Client>> groupByState(List<Client> clients){
        //return clients.stream().collect(Collectors.groupingBy(cli -> cli.getState()));
        return clients.stream().collect(Collectors.groupingBy(Client::getState));
    }

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(1, "Jose", "SP"));
        clients.add(new Client(2, "Raul", "RJ"));
        clients.add(new Client(3, "Lucas", "PB"));
        clients.add(new Client(4, "Geraldo", "RJ"));
        clients.add(new Client(5, "Cris", "PB"));
        clients.add(new Client(6, "Luc", "SP"));
        clients.add(new Client(7, "Bruno", "SP"));
        clients.add(new Client(8, "Sandro", "SC"));
        clients.add(new Client(9, "Pablo", "RJ"));
        clients.add(new Client(10, "Marcele", "RJ"));

        Map<String, List<Client>> clientsPerState = groupByState(clients);
        for (String state : clientsPerState.keySet()){
            System.out.println("Client per state with java 8, stream " + state + ": " + clientsPerState.get(state));
        }
        //System.out.println("Client per state with java 7 " + clientsPerState);
    }
}
