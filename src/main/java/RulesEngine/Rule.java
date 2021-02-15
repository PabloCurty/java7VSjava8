package RulesEngine;

import Model.Client;

public interface Rule {
    boolean toApply(Client cli);
}
