package com.somyu.SpringBootRest.controller;


import com.somyu.SpringBootRest.model.JobPost;
import com.somyu.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {


    @Autowired
    private JobService service;

    @CrossOrigin
    @GetMapping(path = "jobPosts", produces = {"application/json"})
    public List<JobPost> jobPosts(){
        return service.getAllJobs();
    }

    @CrossOrigin
    @GetMapping("jobPosts/{post}")
    public JobPost jobPost(@PathVariable("post") int post){
        return service.getJob(post);
    }

    @CrossOrigin
    @PostMapping("jobPosts")
    public void addPost(@RequestBody JobPost post){
      service.addJob(post);
    }

    @CrossOrigin
    @PutMapping("jobPosts")
    public JobPost updatePost(@RequestBody JobPost post){
        service.update(post);
        return service.getJob(post.getPostId());
    }


    @CrossOrigin
    @DeleteMapping("jobPosts/{id}")
    public String deletePost(@PathVariable("id") int id){
        service.delete(id);
        return "Job with id " + id+ " successfully Deleted";

    }
}
