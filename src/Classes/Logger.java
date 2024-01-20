package Classes;

import java.io.File;
import java.nio.file.Path;
import java.util.Date;
import static java.nio.file.Files.exists;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    static Logger instance;

    String filePath;
    File logFile;
    private Logger(String pathToFile){
        this.filePath = pathToFile;
        if (!exists(Path.of(pathToFile)))
            logFile = new File(pathToFile);
    }
    public static Logger getInstance(String path) {     //Singletone
        if (instance == null)
            instance = new Logger(path);
        return instance;
    }

    public void Logging(String type, String action) {
        String text = "["+ new Date() + "] " + action + type + "\n";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
