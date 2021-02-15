package RulesEngine;

import Model.Client;

import java.util.function.Predicate;

//Faz a mesma coisa que o conjunto de classes do Java 8
public class RuleCompositionJava8 {
    //predicate já é uma interface de regras no Java 8
    public static void evaluate(Client cli, Predicate<Client> rule) {
        String result = rule.test(cli) ? "accepted" : "refused";
        System.out.println("Result java 8: " + result);
    }

    public static void main(String[] args) {
        Client client = new Client(1, "Jhon Snow", "RJ", 5000.0, 2, false, true);
        //Todas as regras passam a estar aqui
        Predicate<Client> salaryRule = cli -> cli.getSalary() > 2000.0;
        Predicate<Client> timeInJobRule = cli -> cli.getTimeInJob() >0;
        Predicate<Client> latePaymentRule = cli -> !cli.isLatePayment();
        Predicate<Client> SPCRule = cli -> !cli.isSPCRestrictions();

        //aplicação das regras
        evaluate(client, salaryRule.and(SPCRule)); //accepted
        evaluate(client, salaryRule.and(timeInJobRule).and(SPCRule)); //accepted
        evaluate(client, SPCRule.and(timeInJobRule).and(latePaymentRule)); //refused
        evaluate(client, SPCRule.and(salaryRule).and(timeInJobRule).and(latePaymentRule)); //refused

    }
}
