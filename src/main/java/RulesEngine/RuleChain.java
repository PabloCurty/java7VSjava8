package RulesEngine;

import Model.Client;

public abstract class RuleChain implements Rule {
    private Rule next;

    public RuleChain(Rule nextRule){
        next = nextRule;
    }

    protected boolean toApplyNextRule(Client cli){
        if(next == null){
            return true;
        }
        return next.toApply(cli);
    }
}
