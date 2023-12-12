package nl.novi.TechItEasy.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CIModule")
@Getter
@Setter

public class CIModule {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String type;
    Double price;
}
