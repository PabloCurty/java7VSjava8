package RulesEngine;

import Model.Client;

public class RuleSPC extends RuleChain{

    public RuleSPC() {
        super(null);
    }

    public RuleSPC(Rule nextRule) {
        super(nextRule);
    }

    @Override
    public boolean toApply(Client cli) {
        if(!cli.isSPCRestrictions()){
            return toApplyNextRule(cli);
        }
        return false;
    }
}
