package nl.novi.TechItEasy.exceptions;

public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException (){
        super ();
    }
    public RecordNotFoundException (String message){
        super ("Tv niet gevonden");
    }
    //    De RecordNotFoundException bevat :
//    een default exception
//    een exception met message

}
