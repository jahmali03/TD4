package EX1;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.io.File;

    public class SingletonFileLogger {
        private static final String Dir = "out";
        private static final String Log_File_Path = "\\log.txt";
        private static SingletonFileLogger logger = new SingletonFileLogger();

        private SingletonFileLogger(){}

        public static SingletonFileLogger synchronized_getInstance(){
            return logger;
        }

        public void write(Level l, String error) {

            System.out.println(l.getLevelValue() + ": " + error );
        }

        private void writeToFile(Level l, String message, String fileName){
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


