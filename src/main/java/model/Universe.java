package model;

import java.util.ArrayList;
import java.util.List;

public class Universe {

    private final List<Wizard> allWizards;

    public Universe() {
        this.allWizards = new ArrayList<Wizard>();
    }

    public Universe addWizard(Wizard Wizard) {
        allWizards.add(Wizard);
        return this;
    }

    @Override
    public String toString() {
        return "Universe{" +
                "allWizards=" + allWizards +
                '}';
    }

    public List<Wizard> getAllWizards() {
        return allWizards;
    }
}
