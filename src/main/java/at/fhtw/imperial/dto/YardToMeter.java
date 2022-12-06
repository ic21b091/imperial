package at.fhtw.imperial.dto;

public class YardToMeter {
    private double meter = 0;

    public double getMeter() {
        return meter;
    }

    public void convertValues(double yard) {
        meter = yard * 0.9144;
    }
}