package at.fhtw.imperial.controller;

import at.fhtw.imperial.service.ImperialService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialController {
    private final ImperialService iService;

    public ImperialController (ImperialService iService) {
        this.iService = iService;
    }

    @GetMapping("/centimeter/inch={inch}")
    public String inchToCentimeter(@PathVariable double inch) {
        iService.calculateCentimeter(inch);
        return iService.getCentimeter() + "";
    }

    @GetMapping("/meter/yard={yard}")
    public String yardToMeter(@PathVariable double yard) {
        iService.calculateMeter(yard);
        return iService.getMeter() + "";
    }
}
