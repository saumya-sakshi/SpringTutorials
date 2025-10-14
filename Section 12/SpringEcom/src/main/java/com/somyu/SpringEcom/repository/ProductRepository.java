package com.somyu.SpringEcom.repository;

import com.somyu.SpringEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("SELECT P FROM Product P WHERE "+
            "LOWER(P.Name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(P.Description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(P.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(P.category) LIKE LOWER(CONCAT('%', :keyword, '%')) "
    )
    List<Product> searchProduct(String keyword);
}
