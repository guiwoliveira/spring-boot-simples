package com.guiwoliveira.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guiwoliveira.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
