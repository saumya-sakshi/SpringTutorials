package com.somyu.datarest.repo;

import com.somyu.datarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

}
