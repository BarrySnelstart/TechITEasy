package nl.novi.TechItEasy.exceptions;

public class NameToLongException extends RuntimeException{


    public NameToLongException (){
        super();
    }
    public NameToLongException (String message){
        super(message);
    }

}
