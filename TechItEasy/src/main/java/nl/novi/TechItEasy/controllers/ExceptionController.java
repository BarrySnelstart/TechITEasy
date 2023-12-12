package nl.novi.TechItEasy.controllers;
import nl.novi.TechItEasy.exceptions.NameToLongException;
import nl.novi.TechItEasy.exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    //    De ExceptionController bevat:
//    een exceptionhandler
    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> recordNotFoundException (RecordNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = NameToLongException.class)
    public ResponseEntity<Object> NameToLongException (NameToLongException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
