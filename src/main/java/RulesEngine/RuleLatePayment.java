package RulesEngine;

import Model.Client;

public class RuleLatePayment extends RuleChain{

    public RuleLatePayment() {
        super(null);
    }

    public RuleLatePayment(Rule next) {
        super(next);
    }

    @Override
    public boolean toApply(Client cli) {
        if(!cli.isLatePayment()){
            return toApplyNextRule(cli);
        }
        return false;
    }
}
