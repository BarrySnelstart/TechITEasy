package nl.novi.TechItEasy.controllers;

import nl.novi.TechItEasy.services.TelevisionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/televisions")
public class TelevisionsController {
    private final TelevisionService televisionService;

    public TelevisionsController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }
}


