package FindClientPerState;

import Model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientsForStateJava7 {
    public static Map<String, List<Client>> groupByState(List<Client> clients){
        Map<String, List<Client>> mapClientByState = new HashMap<>();
        for (Client cli : clients){
            String state = cli.getState();
            List<Client> clientState = mapClientByState.get(state);
            if (clientState == null){
                clientState = new ArrayList<>();
                mapClientByState.put(state, clientState);
            }
            clientState.add(cli);
        }
        return mapClientByState;
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
            System.out.println("Client per state with java 7 " + state + ": " + clientsPerState.get(state));
        }
        //System.out.println("Client per state with java 7 " + clientsPerState);
    }
}
