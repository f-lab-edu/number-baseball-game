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
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            String resultPath = "./app/src/main/resources/result";
            resultPath.replaceAll("/", File.separator);
            return  resultPath;
        } else if (osName.contains("window")){
            String resultPath = "./app/src/main/resources/result";
            resultPath.replaceAll("/", File.separator);
            return resultPath;
        }
        return "app/src/main/resources/result";
    }
}

