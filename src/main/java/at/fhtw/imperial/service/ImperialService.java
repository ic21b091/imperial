package at.fhtw.imperial.service;
import at.fhtw.imperial.dto.InchToCentimeter;
import at.fhtw.imperial.dto.YardToMeter;
import org.springframework.stereotype.Service;

@Service
public class ImperialService {
    private final InchToCentimeter i2c = new InchToCentimeter();
    private final YardToMeter y2m = new YardToMeter();

    public double getCentimeter() {
        return i2c.getCentimeter();
    }

    public double getMeter() {
        return y2m.getMeter();
    }

    public void calculateCentimeter(double inch) {
        i2c.convertValues(inch);
    }

    public void calculateMeter(double yard) {
        y2m.convertValues(yard);
    }
}