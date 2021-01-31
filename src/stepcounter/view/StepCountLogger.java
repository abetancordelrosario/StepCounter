package stepcounter.view;

import stepcounter.model.StepCount;

public interface StepCountLogger {
    
    void on(StepDetection StepDetection);
    
    interface StepDetection {
        void detected(StepCount stepCount);
    }
}
