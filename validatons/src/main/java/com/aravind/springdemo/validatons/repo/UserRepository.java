package com.aravind.springdemo.validatons.repo;

import com.aravind.springdemo.validatons.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(int id);

}
