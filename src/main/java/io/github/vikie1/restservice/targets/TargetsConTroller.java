package io.github.vikie1.restservice.targets;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.vikie1.restservice.progress.weekly.ServiceWeeklyProgress;
import io.github.vikie1.restservice.targets.longterm.LongTerm;
import io.github.vikie1.restservice.targets.longterm.ServiceLongTerm;
import io.github.vikie1.restservice.targets.midterm.MidTerm;
import io.github.vikie1.restservice.targets.midterm.ServiceMidTerm;
import io.github.vikie1.restservice.targets.shortTerm.ServiceShortTerm;
import io.github.vikie1.restservice.targets.shortTerm.ShortTermTargets;




@RestController
public class TargetsConTroller {
    @Autowired
    ServiceLongTerm serviceLongTerm;

    @Autowired
    ServiceMidTerm serviceMidTerm;

    @Autowired
    ServiceShortTerm serviceShortTerm;

    @Autowired
    ServiceWeeklyProgress serviceWeeklyProgress;

    @GetMapping(value="/projects")
    public HashMap<String, List<Object>> getAllProjects() {
        HashMap<String, List<Object>> finalHashMap = new HashMap<>();
        finalHashMap.put("shortTerm", serviceShortTerm.getShortTermProjects());
        finalHashMap.put("midterm", serviceMidTerm.getMidTerm());
        finalHashMap.put("longterm", serviceLongTerm.getLongTermProject());
        return finalHashMap;
    }

    @RequestMapping(value="/protects", method=RequestMethod.DELETE)
    public void requestClearProjects() {
        serviceLongTerm.clearLongTermProjects();
        serviceMidTerm.clearMidTerm();
        serviceShortTerm.clearShortTermProject();
    }
    
    @PostMapping(value="/projects/longterm")
    public void postLongTerm(@RequestBody LongTerm entity) {
        serviceLongTerm.addLongTermProject(entity);
    }

    @PostMapping(value="/projects/midterm")
    public void postMidTerm(@RequestBody MidTerm entity) {
        serviceMidTerm.addMidTermProject(entity);
    }
    
    @PostMapping(value="/projects/shorterm")
    public void postShortTerm(@RequestBody ShortTermTargets entity) {
        serviceShortTerm.addShortTermProject(entity);
    }
    
    @RequestMapping(value="/projects/longterm/{}", method=RequestMethod.DELETE)
    public void deleteALongTermProject(@PathVariable String param) {
        serviceWeeklyProgress.addWeeklyProgressFromProject(param, 1);
        serviceLongTerm.deleteALongTermProject(param);
    }
    
    @RequestMapping(value="/projects/midterm/{}", method=RequestMethod.DELETE)
    public void deleteAMidTermProject(@PathVariable String param) {
        serviceWeeklyProgress.addWeeklyProgressFromProject(param, 2);
        serviceMidTerm.deleteMidTermProject(param);
    }

    @RequestMapping(value="/projects/shorterm/{}", method=RequestMethod.DELETE)
    public void deleteShortTerm(@PathVariable String param) {
        serviceWeeklyProgress.addWeeklyProgressFromProject(param, 3);
        serviceShortTerm.deleteShortTermProject(param);
    }
    
    
}
