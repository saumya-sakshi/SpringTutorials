package com.saumya.demo.service;

import com.saumya.demo.model.Laptop;
import com.saumya.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
