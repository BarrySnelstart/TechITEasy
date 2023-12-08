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
    }

    @GetMapping("/{id}")
    public ResponseEntity<TelevisionDto> getTelevisionById(@PathVariable Long id) {
        TelevisionDto television = televisionService.getTelevisionById(id);
        return ResponseEntity.ok().body(television);
    }

    @PutMapping("/{id}")
    public TelevisionDto updateTelevision(@PathVariable Long id, @RequestBody TelevisionDto newTelevision) {
        return televisionService.updateTelevision(id, newTelevision);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTelevision(@PathVariable Long id) {
        televisionService.deleteTelevision(id);
    return ResponseEntity.ok("Television deleted");
    }
}