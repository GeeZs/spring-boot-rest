package com.cheshire.springbootrest.repository;

import com.cheshire.springbootrest.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
