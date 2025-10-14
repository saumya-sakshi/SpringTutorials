package com.somyu.SpringEcom.controller;

import com.somyu.SpringEcom.model.Product;
import com.somyu.SpringEcom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @CrossOrigin
    public ResponseEntity<List<Product> >getProduct(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/product/{id}")
    @CrossOrigin
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product = productService.getProductById(id);
        if(product!=null){return new ResponseEntity<>(product, HttpStatus.OK);}
        else{return new ResponseEntity<>(HttpStatus.NOT_FOUND);}

    }

    @PostMapping("/product")
    @CrossOrigin
    public ResponseEntity<?> createProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile)  {
        Product saveproduct = null;
        try {
            saveproduct = productService.addorUpdateProduct(product,imageFile);
            return   new ResponseEntity<>(saveproduct, HttpStatus.CREATED);
        } catch (IOException e) {
            return   new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }

    @GetMapping("/product/{id}/image")
    @CrossOrigin
    public ResponseEntity<byte[]> getImageByID(@PathVariable int id){
        Product product = productService.getProductById(id);
        if(product!=null){return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);}
        else{return new ResponseEntity<>(HttpStatus.NOT_FOUND);}

    }


    @PutMapping("/product/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> createProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile)  {
        Product updatedProduct = null;
        try {
            updatedProduct = productService.addorUpdateProduct(product,imageFile);
            return   new ResponseEntity<>(updatedProduct, HttpStatus.CREATED);
        } catch (IOException e) {
            return   new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }


    @DeleteMapping("/product/{id}")
    @CrossOrigin
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        Product product = productService.getProductById(id);
        if(product!=null){
            productService.deleteProduct(id);
            return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping("/products/search")
    @CrossOrigin
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> products = productService.searchProducts(keyword);
        System.out.println("searching with "+ keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
