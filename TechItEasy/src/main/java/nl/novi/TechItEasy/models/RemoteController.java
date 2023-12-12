package nl.novi.TechItEasy.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "remoteControllers")
@Getter
@Setter





public class RemoteController {
    @Id
    @GeneratedValue
    Long id;

    String compatibleWith;
    String batteryType;
    String name;
    String brand;
    Double price;
    int originalStock;
}
