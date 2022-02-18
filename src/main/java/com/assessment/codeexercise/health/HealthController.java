package com.assessment.codeexercise.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("ping")
    public static String ping() {
        return "pong";
    }
}
