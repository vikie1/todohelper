package io.github.vikie1.restservice.targets.longterm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLongTerm {
    
    @Autowired
    LongTermRepo longTermRepo;

    public List<Object> getLongTermProject() {
        List<Object> list = new ArrayList<>();
        longTermRepo.findAll().forEach(list :: add);
        return list;
    }

    public void addLongTermProject(LongTerm longTerm) {
        longTermRepo.save(longTerm);
    }

    public void clearLongTermProjects() {
        longTermRepo.deleteAll();
    }

    public void deleteALongTermProject(String id) {
        longTermRepo.deleteById(id);
    }

    public List<LongTerm> getALongTermItem(String id) {
        List<LongTerm> longTerms = new ArrayList<>();
        longTerms.add(longTermRepo.findById(id).orElse(null));
        return longTerms;
    }
}
