package nl.novi.TechItEasy.controllers;

import nl.novi.TechItEasy.exceptions.NameToLongException;
import nl.novi.TechItEasy.exceptions.RecordNotFoundException;
import nl.novi.TechItEasy.models.Television;
import nl.novi.TechItEasy.repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/televisions")
public class TelevisionsController {
    @Autowired TelevisionRepository televisionRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Television> getTelevision(@PathVariable("id") Long id) {
        Optional<Television> television = televisionRepository.findById(id);
        Television television1 = television.get();
        return ResponseEntity.ok().body(television1);
        }

    @PostMapping
        public ResponseEntity<Television> addTvToDataBase (@RequestBody Television television){
        Television televisionSaved = televisionRepository.save(television);
        return ResponseEntity.created(null).body(televisionSaved);
        }


}
