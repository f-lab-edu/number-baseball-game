package edu.number.baseball.util.io.write;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;


public abstract class ResultFileWrite {
    public static final String RESULT_FILE_PATH = "app/src/main/resources/result";

    public static void resultWrite(String result) {
        try {
            Path filePath = Paths.get(RESULT_FILE_PATH);
            byte[] resultBuffer = result.getBytes();
            Files.write(filePath, resultBuffer, CREATE ,APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
