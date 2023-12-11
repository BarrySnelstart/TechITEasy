package nl.novi.TechItEasy.controllers;
import nl.novi.TechItEasy.dto.SalesInfoDto;
import nl.novi.TechItEasy.dto.TelevisionDto;
import nl.novi.TechItEasy.models.Television;
import nl.novi.TechItEasy.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity <TelevisionDto> postTelevision(@Validated @RequestBody TelevisionDto television) {
        TelevisionDto dto = televisionService.postTelevision(television);
        return ResponseEntity.created(null).body(dto);
=======

  
    @Autowired
    TelevisionRepository televisionRepository;
// TODO record not found
    @GetMapping("/{id}")
    public ResponseEntity <Television> getTelevision(@PathVariable("id") Long id) {
        Optional <Television> television = televisionRepository.findById(id);
        Television television1 = television.get();
        return ResponseEntity.ok().body(television1);

    }

    @GetMapping("/salesInfo/{id}")
    public ResponseEntity<SalesInfoDto> getSalesInfoById(@PathVariable Long id)
    {
        SalesInfoDto salesInfo = televisionService.getTelevisionSalesInfoById(id);
        return ResponseEntity.ok(salesInfo);
    }
    @GetMapping

    public List <Television> getAllTelevisions() {
        return televisionService.getAllTelevisions();

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

    @GetMapping("/{id}")
    public ResponseEntity<TelevisionDto> getTelevisionById(@PathVariable Long id) {
        TelevisionDto television = televisionService.getTelevisionById(id);
        return ResponseEntity.ok().body(television);
    }


    @PutMapping("/{id}")
    public TelevisionDto updateTelevision(@PathVariable Long id, @RequestBody TelevisionDto newTelevision) {
        return televisionService.updateTelevision(id, newTelevision);


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

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTelevision(@PathVariable Long id) {
        televisionService.deleteTelevision(id);
    return ResponseEntity.ok("Television deleted");
    }
}