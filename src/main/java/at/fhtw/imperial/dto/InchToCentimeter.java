package at.fhtw.imperial.dto;

public class InchToCentimeter {
    private double centimeter = 0;

    public double getCentimeter() {
        return centimeter;
    }

    public void convertValues(double inch) {
        centimeter = inch * 2.54;
    }
}
