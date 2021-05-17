package io.github.vikie1.restservice.wins.bigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServBigWin {
    
    @Autowired
    BigWinsRepo bigWinsRepo;


    public void addBigWin(Big big) {
        bigWinsRepo.save(big);
    }
    
    public void deleteWin(String win) {
        bigWinsRepo.deleteById(win);
    }
}
