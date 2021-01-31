package stepcounter.control;

import stepcounter.model.StepCount;
import stepcounter.view.StepCountDisplay;
import stepcounter.view.StepCountStore;
import stepcounter.view.StepCountLogger;

public class MonitorStepCommand implements Command {
    private final StepCountLogger stepLogger;
    private final StepCountStore stepCountStore;
    private final StepCountDisplay stepCountDisplay;

    public MonitorStepCommand(StepCountLogger stepCountLogger, StepCountStore stepCountStore, StepCountDisplay stepCountDisplay) {
        this.stepLogger = stepCountLogger;
        this.stepCountStore = stepCountStore;
        this.stepCountDisplay = stepCountDisplay;
        this.stepLogger.on(StepDetection());
    }

    @Override
    public void execute() {
    }

    private StepCountLogger.StepDetection StepDetection() {
        return new StepCountLogger.StepDetection() {
            @Override
            public void detected(StepCount stepCount) {
                stepCountStore.save(stepCount);
            }
        };
    }
    
   
}
