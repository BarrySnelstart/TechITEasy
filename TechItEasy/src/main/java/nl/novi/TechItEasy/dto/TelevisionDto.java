package nl.novi.TechItEasy.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;


public class TelevisionDto {

    public Long id;

    public int sold;

    @NotBlank
    public String type;
    @NotBlank
    public String brand;

    @NotBlank
    public String name;

    @NotNull
    public Double price;
    public String availableSize;
    public int refreshRate;
    public String screenQuality;
    public Boolean smartTv;
    public Boolean wifi;
    public Boolean voiceControl;
    public Boolean hdr;
    public Boolean bluetooth;
    public Boolean ambiLight;
    public int originalStock;
    public nl.novi.TechItEasy.models.screenType screenType;
    public Date dateSold;
    public Date datePurchase;
}

