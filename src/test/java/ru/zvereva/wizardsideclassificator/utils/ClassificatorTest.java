package ru.zvereva.wizardsideclassificator.utils;

import org.junit.Test;
import ru.zvereva.wizardsideclassificator.model.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ClassificatorTest {

    @Test
    public void wizardIsWhite(){
        Wizard wizard = new Wizard("Harry", Gender.MALE, 17, MagicWand.HOLLY, Faculty.GRYFFINDOR, ExceptionalAbility.PARSELMOUTH);
        assertThat(Classificator.determineSide(wizard), is(WizardSide.WHITE));
    }

    @Test
    public void wizardIsBlack(){
        Wizard wizard = new Wizard("Volandemort", Gender.MALE, 300, MagicWand.YEW, Faculty.SLYTHERIN, ExceptionalAbility.PARSELMOUTH);
        assertThat(Classificator.determineSide(wizard), is(WizardSide.BLACK));
    }

    @Test
    public void wizardBecomeBlackBecauseOfMagicWandForce(){
        Wizard wizard = new Wizard("Wizard3", Gender.MALE, 30, MagicWand.WALNUT, Faculty.GRYFFINDOR, ExceptionalAbility.ABSENT);
        assertThat(Classificator.determineSide(wizard), is(WizardSide.BLACK));
    }

    @Test
    public void wizardBecomeBlackBecauseOfFacultyAndMagicWandForce(){
        Wizard wizard = new Wizard("Wizard4", Gender.FEMALE, 34, MagicWand.YEW, Faculty.SLYTHERIN, ExceptionalAbility.ABSENT);
        assertThat(Classificator.determineSide(wizard), is(WizardSide.BLACK));
    }
}
