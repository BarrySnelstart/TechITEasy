package nl.novi.TechItEasy.services;

import nl.novi.TechItEasy.controllers.ExceptionController;
import nl.novi.TechItEasy.dto.TelevisionDto;
import nl.novi.TechItEasy.exceptions.RecordNotFoundException;
import nl.novi.TechItEasy.models.Television;
import nl.novi.TechItEasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TelevisionService {
    final private TelevisionRepository repository;

    public TelevisionService(TelevisionRepository repository) {
        this.repository = repository;
    }

    public TelevisionDto postTelevision(TelevisionDto televisionDto) {
        Television television = new Television();
        television.setName(televisionDto.name);
        television.setSold(televisionDto.sold);
        television.setType(televisionDto.type);
        television.setBrand(televisionDto.brand);
        television.setPrice(televisionDto.price);
        television.setAmbiLight(televisionDto.ambiLight);
        television.setAvailableSize(televisionDto.availableSize);
        television.setRefreshRate(televisionDto.refreshRate);
        television.setScreenQuality(televisionDto.screenQuality);
        television.setSmartTv(televisionDto.smartTv);
        television.setWifi(televisionDto.wifi);
        television.setBluetooth(televisionDto.bluetooth);
        television.setVoiceControl(televisionDto.voiceControl);
        television.setHdr(televisionDto.hdr);
        television.setAmbiLight(televisionDto.ambiLight);
        television.setOriginalStock(televisionDto.originalStock);
        television.setScreenType(televisionDto.screenType);
        television.setDateSold(televisionDto.dateSold);
        television.setDatePurchase(televisionDto.datePurchase);
        repository.save(television);
        televisionDto = televisionToDto(television);
        televisionDto.id = television.getId();

        return televisionDto;
    }

    public List <Television> getAllTelevisions() {
        List <Television> allTelvisions = new ArrayList <>();
        List <Television> tvDB = repository.findAll();
        for (Television tv : tvDB) {
            allTelvisions.add(tv);
        }
        return allTelvisions;

    }

    public TelevisionDto getTelevisionById(Long id) {
        TelevisionDto dto = new TelevisionDto();
        Television television1 = repository.getReferenceById(id);
        if (repository.getReferenceById(id) != null) {
            dto.id = television1.getId();
            dto.type = television1.getType();
            dto.brand = television1.getBrand();
            dto.name = television1.getName();
            dto.price = television1.getPrice();
            dto.availableSize = television1.getAvailableSize();
            dto.refreshRate = television1.getRefreshRate();
            dto.screenType = television1.getScreenType();
            dto.screenQuality = television1.getScreenQuality();
            dto.smartTv = television1.getWifi();
            dto.wifi = television1.getWifi();
            dto.voiceControl = television1.getVoiceControl();
            dto.hdr = television1.getHdr();
            dto.bluetooth = television1.getBluetooth();
            dto.ambiLight = television1.getAmbiLight();
            dto.originalStock = television1.getOriginalStock();
            dto.sold = television1.getSold();


            return dto;
        } else {
            throw new RecordNotFoundException();
        }

    }

    public TelevisionDto updateTelevision(Long id, TelevisionDto newTelevisionData) {
        Television television1 = repository.getReferenceById(id);
        TelevisionDto dto = new TelevisionDto();
        television1.setAmbiLight(newTelevisionData.ambiLight);
        television1.setAvailableSize(newTelevisionData.availableSize);
        television1.setAmbiLight(newTelevisionData.ambiLight);
        television1.setBluetooth(newTelevisionData.bluetooth);
        television1.setBrand(newTelevisionData.brand);
        television1.setHdr(newTelevisionData.hdr);
        television1.setName(newTelevisionData.name);
        television1.setOriginalStock(newTelevisionData.originalStock);
        television1.setPrice(newTelevisionData.price);
        television1.setRefreshRate(newTelevisionData.refreshRate);
        television1.setScreenQuality(newTelevisionData.screenQuality);
        television1.setScreenType(newTelevisionData.screenType);
        television1.setSmartTv(newTelevisionData.smartTv);
        television1.setSold(newTelevisionData.sold);
        television1.setType(newTelevisionData.type);
        television1.setVoiceControl(newTelevisionData.voiceControl);
        television1.setWifi(newTelevisionData.wifi);
        repository.save(television1);

        dto.id = television1.getId();
        dto.type = television1.getType();
        dto.brand = television1.getBrand();
        dto.name = television1.getName();
        dto.price = television1.getPrice();
        dto.availableSize = television1.getAvailableSize();
        dto.refreshRate = television1.getRefreshRate();
        dto.screenType = television1.getScreenType();
        dto.screenQuality = television1.getScreenQuality();
        dto.smartTv = television1.getWifi();
        dto.wifi = television1.getWifi();
        dto.voiceControl = television1.getVoiceControl();
        dto.hdr = television1.getHdr();
        dto.bluetooth = television1.getBluetooth();
        dto.ambiLight = television1.getAmbiLight();
        dto.originalStock = television1.getOriginalStock();
        dto.sold = television1.getSold();

        return dto;

    }

    public void deleteTelevision(Long id) {
        repository.deleteById(id);
    }


    public Television dtoToTelevison(TelevisionDto dto) {
        var television = new Television();

        television.setType(dto.type);
        television.setBrand(dto.brand);
        television.setName(dto.name);
        television.setPrice(dto.price);
        television.setAvailableSize(dto.availableSize);
        television.setRefreshRate(dto.refreshRate);
        television.setScreenType(dto.screenType);
        television.setScreenQuality(dto.screenQuality);
        television.setSmartTv(dto.smartTv);
        television.setWifi(dto.wifi);
        television.setVoiceControl(dto.voiceControl);
        television.setHdr(dto.hdr);
        television.setBluetooth(dto.bluetooth);
        television.setAmbiLight(dto.ambiLight);
        television.setOriginalStock(dto.originalStock);
        television.setSold(dto.sold);
        return television;
    }

    public TelevisionDto televisionToDto(Television television) {
        TelevisionDto dto = new TelevisionDto();

        dto.id = television.getId();
        dto.type = television.getType();
        dto.brand = television.getBrand();
        dto.name = television.getName();
        dto.price = television.getPrice();
        dto.availableSize = television.getAvailableSize();
        dto.refreshRate = television.getRefreshRate();
        dto.screenType = television.getScreenType();
        dto.screenQuality = television.getScreenQuality();
        dto.wifi = television.getWifi();
        dto.voiceControl = television.getVoiceControl();
        dto.hdr = television.getHdr();
        dto.bluetooth = television.getBluetooth();
        dto.ambiLight = television.getAmbiLight();
        dto.originalStock = television.getOriginalStock();
        dto.sold = television.getSold();

        return dto;
    }
}


