package ru.zvereva.wizardsideclassificator.utils;

import ru.zvereva.wizardsideclassificator.model.Wizard;
import ru.zvereva.wizardsideclassificator.model.WizardSide;

public class Classificator {

    public static WizardSide determineSide(Wizard wizard){
        double points = wizard.getGender().getForceOfImpact() +
                wizard.getFaculty().getForceOfImpact() +
                wizard.getMagicWand().getForceOfImpact() +
                wizard.getExceptionalAbility().getForceOfImpact();
        return points > 1 ? WizardSide.BLACK : WizardSide.WHITE;
    }
}
