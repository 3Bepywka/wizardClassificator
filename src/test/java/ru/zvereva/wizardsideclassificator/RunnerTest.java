package ru.zvereva.wizardsideclassificator;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RunnerTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private PrintStream defaultSystemOut;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        defaultSystemOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

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

        Runner.main(new String[] {file.getAbsolutePath()});

        assertThat(outContent.toString(), is("     Harry - WHITE\n"));
    }

    @After
    public void tearDown() {
        System.setOut(defaultSystemOut);
    }

}
