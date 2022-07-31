package edu.number.baseball.util.io.write;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.*;


public abstract class ResultFileWrite {

    public static void resultWrite(String result) {
        String resultFilePath = getResultFilePath();;
        try {
            Path filePath = Paths.get(resultFilePath);
            byte[] resultBuffer = result.getBytes();
            Files.write(filePath, resultBuffer, CREATE ,APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getResultFilePath() {
        String resultPath = "./app/src/main/resources/result";
        resultPath.replaceAll("/", File.separator);
        return  resultPath;    }
}

