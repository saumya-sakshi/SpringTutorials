package com.somyu.SpringBootRest.service;

import com.somyu.SpringBootRest.model.JobPost;
import com.somyu.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

@Autowired
private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
    jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){return jobRepo.getAllJobs();}

    public JobPost getJob(int i) {
        return jobRepo.getJob(i);
    }

    public void update(JobPost post) {
         jobRepo.update(post);
    }

    public void delete(int id) {
        jobRepo.delete(id);
    }
}
