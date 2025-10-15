package com.somyu.springdatarest.repo;


import com.somyu.springdatarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

}
