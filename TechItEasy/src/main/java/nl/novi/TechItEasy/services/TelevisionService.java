package nl.novi.TechItEasy.services;
import nl.novi.TechItEasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

@Service
public class TelevisionService {
    final private TelevisionRepository repository;
    public TelevisionService(TelevisionRepository repository) {
        this.repository = repository;
    }

}
