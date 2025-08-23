package com.saumya.demo.repository;

import com.saumya.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Laptop SAVED");

    }
}
