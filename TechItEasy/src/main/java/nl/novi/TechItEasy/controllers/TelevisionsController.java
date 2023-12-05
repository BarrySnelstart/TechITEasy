package nl.novi.TechItEasy.controllers;

import nl.novi.TechItEasy.dto.TelevisionDto;
import nl.novi.TechItEasy.models.Television;
import nl.novi.TechItEasy.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/televisions")
public class TelevisionsController {
    private final TelevisionService televisionService;

    public TelevisionsController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    @PostMapping
    public ResponseEntity postTelevision(TelevisionDto television) {
        televisionService.postTelevision(television);
        return ResponseEntity.ok("Tv Added");
    }

    @GetMapping
    public List <Television> getAllTelevisions() {
        return televisionService.getAllTelevisions();
    }

    @PutMapping("/{id}")
    public TelevisionDto updateTelevision(@PathVariable Long id, @RequestBody TelevisionDto newTelevision) {


        return televisionService.updateTelevision(id, newTelevision);
    }

}