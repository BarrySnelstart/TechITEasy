package nl.novi.TechItEasy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "remoteControllers")
@Getter
@Setter


public class RemoteController {
    @Id
    @GeneratedValue

    @OneToOne(mappedBy = "remoteControllers")
    Television television;

    private  Long id;


    private String compatibleWith;
    private String batteryType;
    private String name;
    private String brand;
    private Double price;
    private int originalStock;
}
