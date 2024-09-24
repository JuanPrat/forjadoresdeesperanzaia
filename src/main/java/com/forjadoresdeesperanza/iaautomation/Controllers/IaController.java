package com.forjadoresdeesperanza.iaautomation.Controllers;

import com.forjadoresdeesperanza.iaautomation.IA.IAWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IaController {

    @Autowired
    private IAWorker iaWorker;

    @GetMapping("/callIa")
    String generation(String userInput) {
        return iaWorker.callIA(userInput);
    }
}
