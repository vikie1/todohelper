package io.github.vikie1.restservice.wins;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.vikie1.restservice.wins.bigger.Big;
import io.github.vikie1.restservice.wins.bigger.ServBigWin;
import io.github.vikie1.restservice.wins.medium.Medium;
import io.github.vikie1.restservice.wins.medium.ServMediumWins;
import io.github.vikie1.restservice.wins.small.ServSmallWins;
import io.github.vikie1.restservice.wins.small.Small;






@RestController
public class WinsController {
    
    @Autowired
    ServWins servWins;

    @Autowired
    ServBigWin servBigWin;

    @Autowired
    ServMediumWins servMediumWins;

    @Autowired
    ServSmallWins servSmallWins;

    @RequestMapping("/wins")
    public HashMap<String, List<Object>> getWins() {
        HashMap<String, List<Object>> finalMap = new HashMap<>();
        finalMap.put("bigwins", servWins.bigWin());
        finalMap.put("mediumwins", servWins.mediumWin());
        finalMap.put("smallwins", servWins.smallWin());
        return finalMap;
    }
    
    @PostMapping(value="/wins/big")
    public void postBigWins(@RequestBody Big big) {
        servBigWin.addBigWin(big);
    }
    
    @RequestMapping(value="/wins/big/{id}", method=RequestMethod.DELETE)
    public void deleteBigWins(@PathVariable String id) {
        servBigWin.deleteWin(id);
    }
    
    @PostMapping(value="/wins/medium")
    public void postMediumWin(@RequestBody Medium entity) {
        servMediumWins.addWin(entity);
    }

    @RequestMapping(value="/wins/medium/{id}", method=RequestMethod.DELETE)
    public void deleteMediumWin(@PathVariable String param) {
        servMediumWins.delete(param);
    }
    
    @PostMapping(value="/wins/small")
    public void postSmall(@RequestBody Small entity) {
        servSmallWins.addSmallWin(entity);
    }
    
    @RequestMapping(value="/wins/small/{}", method = RequestMethod.DELETE)
    public void deletSmallWins(@PathVariable String id) {
        servSmallWins.deleteSmall(id);
    }
    
}
