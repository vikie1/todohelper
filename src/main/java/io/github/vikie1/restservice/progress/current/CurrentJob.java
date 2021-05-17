package io.github.vikie1.restservice.progress.current;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrentJob {
    
    private String startDate;
    private String expectedEndDate;
    @Id
    private String currentJob;

    public CurrentJob(String start, String current, String end){
        super();
        this.startDate = start;
        this.expectedEndDate = current;
        this.currentJob = current;
    }

    public CurrentJob(){}

    /**
     * @param currentJob the currentJob to set
     */
    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    /**
     * @param expectedEndDate the expectedEndDate to set
     */
    public void setExpectedEndDate(String expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the currentJob
     */
    public String getCurrentJob() {
        return currentJob;
    }

    /**
     * @return the expectedEndDate
     */
    public String getExpectedEndDate() {
        return expectedEndDate;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }
}
