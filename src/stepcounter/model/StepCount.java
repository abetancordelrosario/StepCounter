package stepcounter.model;

import java.time.LocalDateTime;

public class StepCount {
    private final LocalDateTime dateTime;
    private final Scale scale;
    private final int count;

    public StepCount(LocalDateTime dateTime, Scale scale, int count) {
        this.dateTime = dateTime;
        this.scale = scale;
        this.count = count;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Scale getScale() {
        return scale;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "StepCount{" + "dateTime=" + dateTime + ", scale=" + scale + ", count=" + count + '}';
    }
}
