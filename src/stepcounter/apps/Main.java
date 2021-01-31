package stepcounter.apps;

import stepcounter.control.MonitorStepCommand;
import stepcounter.view.StepCountDisplay;
import stepcounter.view.StepCountLogger;
import stepcounter.view.StepCountStore;

public class Main {
    
    public static void main(String[] args) {
        new Main().execute();
    }
    private final StepCountLogger logger;
    private final StepCountStore store;
    private final StepCountDisplay display;

    public Main() {
        logger = new StepCountLoggerMock();
        store = new StepCountStoreMock();
        display = new StepCountDisplayMock();
    }

    
    private void execute() {
        new MonitorStepCommand(logger,store,display).execute();
    }
    
}
