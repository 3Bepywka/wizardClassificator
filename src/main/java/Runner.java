import model.*;
import utils.Classificator;
import utils.Serializer;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        if(args.length == 0){
            System.out.print("Argument \"path to json file\" isn't provided. Please point out path.");
            return;
        }
        Universe universe = Serializer.load(args[0]);
        for (Wizard wizard: universe.getAllWizards()) {
            System.out.println(String.format("%10s - %s", wizard.getName(), Classificator.determineSide(wizard)));
        }
    }
}
