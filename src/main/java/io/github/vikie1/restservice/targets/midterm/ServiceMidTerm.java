package io.github.vikie1.restservice.targets.midterm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMidTerm {
    @Autowired
    MidTermRepo midTermRepo;

    public List<Object> getMidTerm() {
        List<Object> list = new ArrayList<>();
        midTermRepo.findAll().forEach(list :: add);
        return list;
    }

    public void addMidTermProject(MidTerm midTerm) {
        midTermRepo.save(midTerm);
    }
    public void clearMidTerm() {
        midTermRepo.deleteAll();
    }

    public void deleteMidTermProject(String id) {
        midTermRepo.deleteById(id);
    }

    public List<MidTerm> getAMidtermItem(String id) {
        List<MidTerm> midTerms = new ArrayList<>();
        midTerms.add(midTermRepo.findById(id).orElse(null));
        return midTerms;
    }
}
