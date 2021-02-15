package RulesEngine;

import Model.Client;

public class RuleCompositionJava7 {
    public static void evaluate(Client cli, Rule rule) {
        String result = rule.toApply(cli) ? "accepted" : "refused";
        System.out.println("Result java 7: " + result);
    }

    public static void main(String[] args) {
        Client client = new Client(1, "Jhon Snow", "RJ", 5000.0, 2, false, true);
        evaluate(client, new RuleSalary(new RuleSPC())); //accepted
        evaluate(client, new RuleSalary(new RuleTimeInJob(new RuleSPC()))); //accepted
        evaluate(client, new RuleSPC(new RuleTimeInJob(new RuleLatePayment()))); //refused
        evaluate(client, new RuleSPC(new RuleSalary(new RuleTimeInJob(new RuleLatePayment())))); //refused
    }
}
