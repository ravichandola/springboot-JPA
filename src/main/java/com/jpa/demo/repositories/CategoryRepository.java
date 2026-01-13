package com.jpa.demo.repositories;

import com.jpa.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface CategoryRepository extends JpaRepository<Category, Long> {

}
