package EX1;

import static EX1.SingletonFileLogger.synchronized_getInstance;

public class SingletonLoggerTest {

    public static void main(String args[]){

        Level l = Level.ERROR;

        synchronized_getInstance().write(Level.ERROR, "Example of error message, fix your code" );
        synchronized_getInstance().write(Level.WARNING, "Example of warning message, something is weird in my progress" );
        synchronized_getInstance().write(Level.INFO, "No info available at the moment" );
        synchronized_getInstance().write(Level.DEBUG, "Processing debug" );

    }
}
