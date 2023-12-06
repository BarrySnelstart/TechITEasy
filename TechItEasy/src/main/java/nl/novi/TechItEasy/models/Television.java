package nl.novi.TechItEasy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Entity
@Table(name = "televisions")


@Getter
@Setter

public class Television {

    @Id
    @GeneratedValue
    private Long id;
    private int sold;
    private String type;
    private String brand;
    private String name;
    private Double price;
    private String availableSize;
    private int refreshRate;
    private String screenQuality;
    private Boolean smartTv;
    private Boolean wifi;
    private Boolean voiceControl;
    private Boolean hdr;
    private Boolean bluetooth;
    private Boolean ambiLight;
    private int originalStock;
    private screenType screenType;
    private Date dateSold;
    private Date datePurchase;




}




