package io.github.vikie1.restservice.progress.daily;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyProgress {
    
    //update the progress
    public DailyProgress(String itemLearnt, String duration){
        super();
        this.itemLearnt = itemLearnt;
        this.duration = duration;
    }

    //get progress
    public DailyProgress() {}

    @Id
    String itemLearnt;
    String duration;

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @param itemLearnt the itemLearnt to set
     */
    public void setItemLearnt(String itemLearnt) {
        this.itemLearnt = itemLearnt;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @return the itemLearnt
     */
    public String getItemLearnt() {
        return itemLearnt;
    }
}
