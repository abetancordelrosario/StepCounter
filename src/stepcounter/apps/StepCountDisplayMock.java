package stepcounter.apps;

import stepcounter.model.StepCount;
import stepcounter.view.StepCountDisplay;

public class StepCountDisplayMock implements StepCountDisplay {

    @Override
    public void display(StepCount stepCount) {
        System.out.println(stepCount);
    }
    
}
