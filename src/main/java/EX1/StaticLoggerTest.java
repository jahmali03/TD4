package EX1;

public class StaticLoggerTest {
    public static void main(String[] args){
        Level l = Level.ERROR;

        StaticLogger.write(Level.ERROR, "Error message : ");
        StaticLogger.write(Level.WARNING, "example of warning message, something is weird in my progress");
        StaticLogger.write(Level.INFO, "No info available at the moment");
        StaticLogger.write(Level.DEBUG, "Processing debug");

    }
}
