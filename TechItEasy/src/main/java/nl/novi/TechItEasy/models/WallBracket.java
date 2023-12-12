package nl.novi.TechItEasy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wallbrackets")
@Getter
@Setter
public class WallBracket {

    @Id
    @GeneratedValue
    Long id;

    String size;
    Boolean adjustable;
    String name;
    Double price;

}
