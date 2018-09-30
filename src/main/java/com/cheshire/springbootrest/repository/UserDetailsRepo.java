package com.cheshire.springbootrest.repository;

import com.cheshire.springbootrest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
