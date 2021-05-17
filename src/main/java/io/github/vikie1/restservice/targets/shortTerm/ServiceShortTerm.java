package io.github.vikie1.restservice.targets.shortTerm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceShortTerm {
    
    @Autowired
    ShortTermTargetsRepo shortTermTargetsRepo;

    public List<Object> getShortTermProjects() {
        List<Object> objects = new ArrayList<>();
        shortTermTargetsRepo.findAll().forEach(objects :: add);
        return objects;
    }

    public void addShortTermProject(ShortTermTargets shortTermTargets) {
        shortTermTargetsRepo.save(shortTermTargets);
    }

    public void clearShortTermProject() {
        shortTermTargetsRepo.deleteAll();
    }

    public void deleteShortTermProject(String id) {
        shortTermTargetsRepo.deleteById(id);
    }

    public List<ShortTermTargets> getATargetItem(String id) {
        List<ShortTermTargets> termTargets = new ArrayList<>();
        termTargets.add(shortTermTargetsRepo.findById(id).orElse(null));
        return termTargets;
    }
}
