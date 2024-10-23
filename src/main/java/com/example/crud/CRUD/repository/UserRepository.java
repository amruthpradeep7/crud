package com.example.crud.CRUD.repository;


import com.example.crud.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
