package io.github.vikie1.restservice.wins.medium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServMediumWins {
    
    @Autowired
    MediumWinsRepo mediumWinsRepo;

    public void addWin(Medium medium) {
        mediumWinsRepo.save(medium);
    }

    public void delete(String id) {
        mediumWinsRepo.deleteById(id);
    }
}
