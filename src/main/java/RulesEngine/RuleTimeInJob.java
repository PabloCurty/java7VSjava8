package RulesEngine;

import Model.Client;

public class RuleTimeInJob extends RuleChain{

    public RuleTimeInJob() {
        super(null);
    }

    public RuleTimeInJob(Rule nextRule) {
        super(nextRule);
    }

    @Override
    public boolean toApply(Client cli) {
        if(cli.getTimeInJob() > 0){
            return toApplyNextRule(cli);
        }
        return false;
    }
}
