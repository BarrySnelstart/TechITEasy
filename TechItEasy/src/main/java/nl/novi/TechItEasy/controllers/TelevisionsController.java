package nl.novi.TechItEasy.controllers;

import nl.novi.TechItEasy.models.Television;
import nl.novi.TechItEasy.repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/televisions")
public class TelevisionsController {

  
    @Autowired
    TelevisionRepository televisionRepository;
// TODO record not found
    @GetMapping("/{id}")
    public ResponseEntity <Television> getTelevision(@PathVariable("id") Long id) {
        Optional <Television> television = televisionRepository.findById(id);
        Television television1 = television.get();
        return ResponseEntity.ok().body(television1);
    }

    @GetMapping
    public ResponseEntity <List <Television>> getTelevisonList() {
        List <Television> television = televisionRepository.findAll();
        return ResponseEntity.ok(television);
    int id = 1000;
        List <Television> televisionDataBase = new ArrayList <>();


    @PostMapping()
    public ResponseEntity <Television> addTvToList(@RequestBody Television television) {
        television.setID(id);
        id ++;
        if(television.getName().length() >  20)
        {
            throw new NameToLongException("Name is to long");
        }
        this.televisionDataBase.add(television);

        return new  ResponseEntity<>(television,HttpStatus.CREATED);
    }

    // ------------------------------------------------------------------------
    @PutMapping("/{ID}")
    public ResponseEntity<String> changeTvModelName(@PathVariable int ID, @RequestBody String model) {

        for (Television tv:televisionDataBase) {
            if(tv.getID() == ID)
            {
                String oldModel = tv.getModel();
                tv.setModel(model);
                return ResponseEntity.ok("Tv found changed model:"+ oldModel + "To : " + tv.getModel());

            }
        }
        throw new RecordNotFoundException("Tv not found");
    }

    @PostMapping
    public ResponseEntity <Television> addTvToDataBase(@RequestBody Television television) {
        Television televisionSaved = televisionRepository.save(television);
        return ResponseEntity.created(null).body(televisionSaved);
    }


    // TODO else statements schrijven voor alle data!
    @PutMapping("/{id}")
    public ResponseEntity <Optional <Television>> changeTvValue(@PathVariable("id") Long id, @RequestBody Television television) {
        Optional <Television> television2 = televisionRepository.findById(id);
        Television television1 = television2.get();
        if (television.getBrand() != null) {
            television1.setBrand(television.getBrand());

    @GetMapping("/{ID}")
    public ResponseEntity <String> getTvByID(@PathVariable int ID) {

        for (Television tv:televisionDataBase) {
            if(tv.getID() == ID)
            {
                return ResponseEntity.ok("Tv found " + tv.getName() +" " +tv.getModel());
            }

        }
        televisionRepository.save(television1);
        return ResponseEntity.ok(television2);
    }

    // TODO Exeption Controller not allowed deletion
    @DeleteMapping("/{id}")
    public ResponseEntity deleteTelevision(@PathVariable("id") Long id) {
        Television televisionToDelete = televisionRepository.findById(id).get();
        if (televisionToDelete.getSold() > 0 || televisionToDelete.getOriginalStock() > 0) {

            return new ResponseEntity <>(
                    "Not allowd to delete an item with stock or history",
                    HttpStatus.FORBIDDEN);
        }

        televisionRepository.delete(televisionToDelete);
        return ResponseEntity.ok("Deleted");
    }
}


