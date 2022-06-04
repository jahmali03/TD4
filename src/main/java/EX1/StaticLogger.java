package EX1;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.io.File;

public class StaticLogger {

        private final static String DIR = "out";
        private final static String LOG_FILES_PATH = "\\log.txt";

        public static void write(Level l, String error) {

            System.out.println(l.getLevelValue() + ": " + error );
        }
        private static void writeToFile(Level l, String message, String fileName){
            try {

                File file = new File(fileName + ".txt");
                if (file.createNewFile()) {
                    FileWriter fw = new FileWriter(file);
                    fw.write(message);
                    fw.close();
                }
            } catch (IOException ex) {
                write(l, ex.toString());
            }
        }
    }
