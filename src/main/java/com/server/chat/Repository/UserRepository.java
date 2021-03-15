package com.server.chat.Repository;

import com.server.chat.Entity.ChatRoom;
import com.server.chat.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    User findByUsername(String username);
}

