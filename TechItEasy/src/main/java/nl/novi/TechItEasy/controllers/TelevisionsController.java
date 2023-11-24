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
@RequestMapping("/television")
public class TelevisionsController {
    @Autowired private TelevisionRepository televisionRepository;
      List <Television> televisionDataBase = new ArrayList <>();
    @GetMapping("televisions/{id}")
    public ResponseEntity<Television> getTvById(@PathVariable("id")  long id) {
        Optional<Television> televisionSaved = televisionRepository.findById(id);
        return ResponseEntity.ok(televisionSaved.get());
    }

    @PostMapping
    public ResponseEntity<Television> addTvToDataBase (@RequestBody Television television){
    Television televisionSaved = televisionRepository.save(television);
        return ResponseEntity.created(null).body(televisionSaved);
    }


}
