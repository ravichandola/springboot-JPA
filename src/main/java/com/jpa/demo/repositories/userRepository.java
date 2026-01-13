package com.jpa.demo.repositories;

import com.jpa.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {


}
