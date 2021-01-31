package stepcounter.apps;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import static stepcounter.model.Scale.Minute;
import stepcounter.model.StepCount;

import stepcounter.view.StepCountLogger;

public class StepCountLoggerMock implements StepCountLogger {

    private StepDetection stepDetection;

    public StepCountLoggerMock() {
        Timer timer = new Timer();
        timer.schedule(task(), 1000, 1000);
    }

    
    @Override
    public void on(StepDetection stepDetection) {
        this.stepDetection = stepDetection;
    }
    
    private TimerTask task(){
        return new TimerTask() {
           @Override
           public void run() {
               if (stepDetection == null) return;
               stepDetection.detected(new StepCount(LocalDateTime.now(), Minute, new Random().nextInt(500)));
           }
        };
    }

}
