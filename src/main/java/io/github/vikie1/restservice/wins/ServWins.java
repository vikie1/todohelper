package io.github.vikie1.restservice.wins;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.vikie1.restservice.wins.bigger.BigWinsRepo;
import io.github.vikie1.restservice.wins.medium.MediumWinsRepo;
import io.github.vikie1.restservice.wins.small.SmallWinsRepo;

/**
 * ServWins
 */
@Service
public class ServWins {

    @Autowired
    BigWinsRepo bigWinsRepo;

    @Autowired
    MediumWinsRepo mediumWinsRepo;

    @Autowired
    SmallWinsRepo smallWinsRepo;
    
    public List<Object> bigWin() {
        List<Object> list = new ArrayList<>();
        bigWinsRepo.findAll().forEach(list :: add);
        return list;
    }

    public List<Object> mediumWin() {
        List<Object> list = new ArrayList<>();
        mediumWinsRepo.findAll().forEach(list :: add);
        return list;
    }

    public List<Object> smallWin() {
        List<Object> list = new ArrayList<>();
        smallWinsRepo.findAll().forEach(list :: add);
        return list;
    }
}
