import Processor.DebugLogProcessor;
import Processor.ErrorLogProcessor;
import Processor.InfoLogProcessor;
import Processor.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO, "Just for info");
        logProcessor.log(LogProcessor.DEBUG, "Need to debug this");
        logProcessor.log(LogProcessor.ERROR, "Exceptions occurred");
    }
}
