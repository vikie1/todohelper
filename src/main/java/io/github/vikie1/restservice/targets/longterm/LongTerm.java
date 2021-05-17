package io.github.vikie1.restservice.targets.longterm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LongTerm {
    @Id
    private String projectId;
    private String projectName;
    private String startDate;
    private String expectedDuration;

    public LongTerm(String projectId, String projectName, String startDate, String expectedDuration) {
        super();
        this.expectedDuration = expectedDuration;
        this.projectId = projectId;
        this.projectName = projectName;
        this.startDate = startDate;        
    }

    public LongTerm() {
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }
    /**
     * @return the expectedDuration
     */
    public String getExpectedDuration() {
        return expectedDuration;
    }

    /**
     * @return the projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @param expectedDuration the expectedDuration to set
     */
    public void setExpectedDuration(String expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
