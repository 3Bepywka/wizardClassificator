package utils;

import model.Wizard;
import model.WizardSide;

public class Classificator {

    public static String determineSide(Wizard wizard){
        double points = wizard.getGender().getForceOfImpact() +
                wizard.getFaculty().getForceOfImpact() +
                wizard.getMagicWand().getForceOfImpact() +
                wizard.getExceptionalAbility().getForceOfImpact();
        return points > 1 ? WizardSide.BLACK.getType() : WizardSide.WHITE.getType();
    }
}
