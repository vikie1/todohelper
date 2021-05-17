package io.github.vikie1.restservice.progress.current;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServCurrentJob {
    
    @Autowired
    JobRepository jobRepository;

    public void addAJob(CurrentJob currentJob) {
        jobRepository.save(currentJob);
    }

    public List<Object> getCurrentJobs() {
        List<Object> jobs = new ArrayList<>();
        jobRepository.findAll().forEach(jobs :: add);
        return jobs;
    }

    public void deleteProgress() {
        jobRepository.deleteAll();
    }
}
