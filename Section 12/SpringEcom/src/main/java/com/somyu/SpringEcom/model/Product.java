package com.somyu.SpringEcom.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private String Description;
    private String brand;
    private String category;
    private BigDecimal price;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    /**
     * for image data
     */

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
