package utils;

import model.*;
import utils.Serializer;

import java.io.IOException;
import java.rmi.server.ExportException;

public class Helper {

    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            throw new IllegalArgumentException("Please, provide path to file.");
        }
        Wizard harry = new Wizard("Harry", Gender.MALE, 17, MagicWand.HOLLY, Faculty.GRYFFINDOR, ExceptionalAbility.PARSELMOUTH);
        Wizard germiona = new Wizard("Germiona", Gender.FEMALE, 17, MagicWand.ASH, Faculty.GRYFFINDOR, ExceptionalAbility.ABSENT);
        Wizard belatrisa = new Wizard("Belatrisa", Gender.FEMALE, 45, MagicWand.WALNUT, Faculty.SLYTHERIN, ExceptionalAbility.ABSENT);
        Wizard volandemort = new Wizard("Volandemort", Gender.MALE, 300, MagicWand.YEW, Faculty.SLYTHERIN, ExceptionalAbility.PARSELMOUTH);

        Universe universe = new Universe().addWizard(harry).addWizard(germiona).addWizard(belatrisa).addWizard(volandemort);
        Serializer.save(universe, args[0]);
    }
}
