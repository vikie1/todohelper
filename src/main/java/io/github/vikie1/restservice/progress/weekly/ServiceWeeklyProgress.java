package io.github.vikie1.restservice.progress.weekly;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.vikie1.restservice.targets.longterm.LongTerm;
import io.github.vikie1.restservice.targets.longterm.ServiceLongTerm;
import io.github.vikie1.restservice.targets.midterm.MidTerm;
import io.github.vikie1.restservice.targets.midterm.ServiceMidTerm;
import io.github.vikie1.restservice.targets.shortTerm.ServiceShortTerm;
import io.github.vikie1.restservice.targets.shortTerm.ShortTermTargets;

@Service
public class ServiceWeeklyProgress {

    @Autowired
    WeeklyRepository weeklyRepository;

    @Autowired
    ServiceLongTerm serviceLongTerm;

    @Autowired
    ServiceShortTerm serviceShortTerm;

    @Autowired
    ServiceMidTerm serviceMidTerm;

    public void addWeeklyProgress(WeeklyProgress progress) {
        weeklyRepository.save(progress);
    }

    public List<Object> getWeeklyProgress() {
        List<Object> weeklyProgress = new ArrayList<>();
        weeklyRepository.findAll().forEach(weeklyProgress::add);
        return weeklyProgress;
    }

    public void deleteWeeks() {
        weeklyRepository.deleteAll();
    }

    public void addWeeklyProgressFromProject(String id, int num) {
        List<WeeklyProgress> weeklyProgresses = new ArrayList<>();
        switch (num) {
            case 1: {
                List<LongTerm> longTerms = serviceLongTerm.getALongTermItem(id);
                if (!longTerms.equals(null)) {
                    weeklyProgresses.add((WeeklyProgress) longTerms);
                    weeklyRepository.saveAll(weeklyProgresses);
                } else {
                    return;
                }
                break;
            }
            case 2:{
                List<MidTerm> midTerms = serviceMidTerm.getAMidtermItem(id);
                if (!midTerms.equals(null)) {
                    weeklyProgresses.add((WeeklyProgress) midTerms);
                    weeklyRepository.saveAll(weeklyProgresses);
                } else {
                    return ;
                }
            }
            case 3:{
                List<ShortTermTargets> shortTermTargets = serviceShortTerm.getATargetItem(id);
                if (!shortTermTargets.equals(null)) {
                    weeklyProgresses.add((WeeklyProgress) shortTermTargets);
                    weeklyRepository.saveAll(weeklyProgresses);
                } else {
                    
                }
            }

            default:
                break;
        }
    }

}
