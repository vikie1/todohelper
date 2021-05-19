package io.github.vikie1.restservice.progress.daily;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyProgress {

    // Constructor for creating lists
    public DailyProgress(String name, String time) {
        super();
        this.time = time;
        this.name = name;
    }

    // Constructor for reading lists
    public DailyProgress() {
    }

    private String name;

    @Id
    private String time;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
}