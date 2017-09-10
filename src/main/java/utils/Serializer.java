package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializer {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private Serializer() {
    }

    public static void save(Universe universe, String filename) throws IOException {
        String json = gson.toJson(universe);
        Path file = Paths.get(filename);
        Files.write(file, json.getBytes());
    }

    public static Universe load(String filename) throws IOException {
        Path file = Paths.get(filename);
        Reader reader = Files.newBufferedReader(file);
        return gson.fromJson(reader, Universe.class);
    }
}
