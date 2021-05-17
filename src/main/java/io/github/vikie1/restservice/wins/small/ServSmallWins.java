package io.github.vikie1.restservice.wins.small;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServSmallWins {
    
    @Autowired
    SmallWinsRepo smallWinsRepo;

    public void addSmallWin(Small win) {
        smallWinsRepo.save(win);
    }

    public void deleteSmall(String id) {
        smallWinsRepo.deleteById(id);
    }
}
