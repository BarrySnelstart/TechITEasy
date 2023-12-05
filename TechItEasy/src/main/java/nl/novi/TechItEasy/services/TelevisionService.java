package nl.novi.TechItEasy.services;

import nl.novi.TechItEasy.dto.TelevisionDto;
import nl.novi.TechItEasy.models.Television;
import nl.novi.TechItEasy.models.screenType;
import nl.novi.TechItEasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

//    public Television updateTelevision(Long id, TelevisionDto newTelevisionData) {
////        Optional <Television> televisionOptional = TelevisionRepository.findById(id);
//       Optional <Television> television1 = repository.findById(id);
//        television1.setAmbiLight(newTelevisionData.ambiLight);
//        television1.setAvailableSize(newTelevisionData.availableSize);
//        television1.setAmbiLight(newTelevisionData.ambiLight);
//        television1.setBluetooth(newTelevisionData.bluetooth);
//        television1.setBrand(newTelevisionData.brand);
//        television1.setHdr(newTelevisionData.hdr);
//        television1.setName(newTelevisionData.name);
//        television1.setOriginalStock(newTelevisionData.originalStock);
//        television1.setPrice(newTelevisionData.price);
//        television1.setRefreshRate(newTelevisionData.refreshRate);
//        television1.setScreenQuality(newTelevisionData.screenQuality);
//        television1.setScreenType(newTelevisionData.screenType);
//        television1.setSmartTv(newTelevisionData.smartTv);
//        television1.setSold(newTelevisionData.sold);
//        television1.setType(newTelevisionData.type);
//        television1.setVoiceControl(newTelevisionData.voiceControl);
//        television1.setWifi(newTelevisionData.wifi);
//        Television newTelevision = repository.save(television1);
//
//        return television1;
//
//    }

}


