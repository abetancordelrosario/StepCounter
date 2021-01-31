package stepcounter.apps;

import stepcounter.model.StepCount;
import stepcounter.view.StepCountStore;


public class StepCountStoreMock implements StepCountStore {
    
    @Override
    public void save(StepCount stepCount) {
        System.out.println("Storing" + stepCount);
    }

}
