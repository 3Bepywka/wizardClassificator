package ru.zvereva.wizardsideclassificator.utils;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TemporaryFolder;
import ru.zvereva.wizardsideclassificator.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

public class SerializerTest extends Assert {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testLoad() throws IOException {
        String json = "{\n" +
                "  \"allWizards\": [\n" +
                "    {\n" +
                "      \"name\": \"Harry\",\n" +
                "      \"gender\": \"MALE\",\n" +
                "      \"age\": 17,\n" +
                "      \"magicWand\": \"HOLLY\",\n" +
                "      \"faculty\": \"GRYFFINDOR\",\n" +
                "      \"exceptionalAbility\": \"PARSELMOUTH\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        File file = temporaryFolder.newFile();
        Files.write(file.toPath(), json.getBytes());

        Universe universe = Serializer.load(file.getAbsolutePath());

        assertThat(universe.getAllWizards(), contains(new Wizard("Harry", Gender.MALE, 17, MagicWand.HOLLY, Faculty.GRYFFINDOR, ExceptionalAbility.PARSELMOUTH)));
    }

    @Test
    public void testSave() throws IOException {
        File file = temporaryFolder.newFile();
        Wizard wizard = new Wizard("Harry", Gender.MALE, 17, MagicWand.HOLLY, Faculty.GRYFFINDOR, ExceptionalAbility.PARSELMOUTH);
        Universe universe = new Universe().addWizard(wizard);

        Serializer.save(universe, file.getAbsolutePath());

        String json = new String(Files.readAllBytes(file.toPath()));
        assertThat(json, is("{\n" +
                "  \"allWizards\": [\n" +
                "    {\n" +
                "      \"name\": \"Harry\",\n" +
                "      \"gender\": \"MALE\",\n" +
                "      \"age\": 17,\n" +
                "      \"magicWand\": \"HOLLY\",\n" +
                "      \"faculty\": \"GRYFFINDOR\",\n" +
                "      \"exceptionalAbility\": \"PARSELMOUTH\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"));
    }
}
