package com.jpa.demo.repositories;

import com.jpa.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    //Impl of these methods are taken care by framework itself
    //Custom query methods
    List<Product> findByTitle(String title);
    List<Product> findByLive(Boolean live);
    List<Product> findByOutOfStock(Boolean outOfStock);
    Optional<Product> findByProductIdAndTitle(long productId, String title);

    // custom queries
    @Query("Select p from Product p where p.productId= ?1 and p.price= ?2")
    Product getProductByTitle(String title, double price);
}
