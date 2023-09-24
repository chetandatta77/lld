package Processor;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG){
            System.out.println("DEBUG: "+ message);
        } else {
            super.log(logLevel, message);
        }
    }
}
