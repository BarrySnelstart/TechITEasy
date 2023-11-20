package nl.novi.TechItEasy.controllers;

import nl.novi.TechItEasy.exceptions.NameToLongException;
import nl.novi.TechItEasy.exceptions.RecordNotFoundException;
import nl.novi.TechItEasy.models.Television;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/television")
public class TelevisionsController {
    int id = 1000;
        List <Television> televisionDataBase = new ArrayList <>();


    @PostMapping()
    public ResponseEntity <Television> addTvToList(@RequestBody Television television) {
        television.setID(id);
        id ++;
        this.televisionDataBase.add(television);

        return new  ResponseEntity<>(television,HttpStatus.CREATED);
    }

    // ------------------------------------------------------------------------
    @PutMapping("/{ID}")
    public ResponseEntity<String> changeTvModelName(@PathVariable int ID, @RequestBody String model) {

        for (Television tv:televisionDataBase) {
            if(tv.getID() == ID)
            {
                tv.setModel(model);
                return ResponseEntity.ok("Tv found " + tv.getModel());
            }
        }
        throw new RecordNotFoundException("Tv not found");
    }

    // ------------------------------------------------------------------------
    @GetMapping()
    public ResponseEntity <List<Television>> getAllTelevisions() {
        return new ResponseEntity<>(this.televisionDataBase, HttpStatus.OK);
    }

    @GetMapping("/{ID}")
    public ResponseEntity <String> getTvByID(@PathVariable int ID) {

        for (Television tv:televisionDataBase) {
            if(tv.getID() == ID)
            {
                return ResponseEntity.ok("Tv found " + tv.getName());
            }
        }
        throw new RecordNotFoundException("Tv not found");
    }

//    // ------------------------------------------------------------------------
    @DeleteMapping("/{ID}")
    public ResponseEntity deleteTv(@PathVariable int ID) {
    List<Television> deleteList = new ArrayList<>();
        for (Television tv:televisionDataBase) {
            if(tv.getID() == ID)
            {
                deleteList.add(tv);
            }

        }
        if(!deleteList.isEmpty())
        {
            for(Television delete: deleteList)
            {
                televisionDataBase.remove(delete);
            }
        }

        return ResponseEntity.ok("Deleted");


    }

}
