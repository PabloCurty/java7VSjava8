package RulesEngine;

import Model.Client;

public class RuleSalary extends RuleChain{

    public RuleSalary() {
        super(null);
    }

    public RuleSalary(Rule nextRule) {
        super(nextRule);
    }

    @Override
    public boolean toApply(Client cli) {
        if(cli.getSalary() > 2000.0){
            return toApplyNextRule(cli);
        }
        return false;
    }
}
