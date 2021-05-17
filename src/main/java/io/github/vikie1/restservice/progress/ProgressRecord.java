package io.github.vikie1.restservice.progress;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.vikie1.restservice.progress.current.CurrentJob;
import io.github.vikie1.restservice.progress.current.ServCurrentJob;
import io.github.vikie1.restservice.progress.daily.DailyProgress;
import io.github.vikie1.restservice.progress.daily.ServDailyProgress;
import io.github.vikie1.restservice.progress.weekly.ServiceWeeklyProgress;
import io.github.vikie1.restservice.progress.weekly.WeeklyProgress;



@RestController
public class ProgressRecord {
    @Autowired
    ServCurrentJob servCurrentJob;

    @Autowired
    ServDailyProgress servDailyProgress;

    @Autowired
    ServiceWeeklyProgress serviceWeeklyProgress;

    @GetMapping(value = "/progress")
    public HashMap<String, List<Object>> getProgress() {
        HashMap<String, List<Object>> finalResult = new HashMap<>();
        finalResult.put("CurrentJob", servCurrentJob.getCurrentJobs());
        finalResult.put("Daily", servDailyProgress.getDailyProgress());
        finalResult.put("WeeKly", serviceWeeklyProgress.getWeeklyProgress());
        return finalResult;
    }

    @PostMapping(value="/progress/current")
    public void postMethodName(@RequestBody CurrentJob entity) {
        servCurrentJob.addAJob(entity);
    }

    @PostMapping(value="/progress/daily")
    public void postMethodName(@RequestBody DailyProgress entity) {
        servDailyProgress.addMiscallenousProgress(entity);
    }
    
    @PostMapping(value="/progress/weekly")
    public void postMethodName(@RequestBody WeeklyProgress entity) {
        serviceWeeklyProgress.addWeeklyProgress(entity);
    }
    
    @RequestMapping(value="/progress", method=RequestMethod.DELETE)
    public void requestMethodName() {
        serviceWeeklyProgress.deleteWeeks();
        servDailyProgress.deleteProgress();
        servCurrentJob.deleteProgress();
    }
    
}
