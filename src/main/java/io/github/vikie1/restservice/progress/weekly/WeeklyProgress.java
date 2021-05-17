package io.github.vikie1.restservice.progress.weekly;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WeeklyProgress {
    
    @Id
    private String itemLearnt;
    private String duration;

    public WeeklyProgress(String itemLearnt, String duration) {
        super();
        this.itemLearnt = itemLearnt;
        this.duration = duration;
    }

    public WeeklyProgress() {}

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the itemLearnt
     */
    public String getItemLearnt() {
        return itemLearnt;
    }

    /**
     * @param itemLearnt the itemLearnt to set
     */
    public void setItemLearnt(String itemLearnt) {
        this.itemLearnt = itemLearnt;
    }
}
